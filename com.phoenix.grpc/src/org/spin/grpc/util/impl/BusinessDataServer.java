package org.spin.grpc.util.impl;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.logging.Logger;

import org.compiere.Adempiere;
import org.compiere.util.Util;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyServerBuilder;
import io.netty.handler.ssl.ClientAuth;
import io.netty.handler.ssl.SslContextBuilder;

public class BusinessDataServer {
	private static final Logger logger = Logger.getLogger(BusinessDataServiceImplementation.class.getName());

	  private Server server;
	  private final int port;
	  private final String certChainFilePath;
	  private final String privateKeyFilePath;
	  private final String trustCertCollectionFilePath;
	  private final boolean isTlsEnabled;
	  
	  /**
	   * Default values
	   * @param port
	   * @param certChainFilePath
	   * @param privateKeyFilePath
	   * @param trustCertCollectionFilePath
	   */
	  public BusinessDataServer(int port,
              String certChainFilePath,
              String privateKeyFilePath,
              String trustCertCollectionFilePath) {
		  this.port = port;
		  this.certChainFilePath = certChainFilePath;
		  this.privateKeyFilePath = privateKeyFilePath;
		  this.trustCertCollectionFilePath = trustCertCollectionFilePath;
		  this.isTlsEnabled = !Util.isEmpty(certChainFilePath) && !Util.isEmpty(privateKeyFilePath); 
	  }
	  
	  /**
	   * With TLS disabled
	   * @param port
	   */
	  public BusinessDataServer(int port) {
		  this(port, null, null, null);
	  }
	  
	  /**
	   * Get SSL / TLS context
	   * @return
	   */
	  private SslContextBuilder getSslContextBuilder() {
	        SslContextBuilder sslClientContextBuilder = SslContextBuilder.forServer(new File(certChainFilePath),
	                new File(privateKeyFilePath));
	        if (trustCertCollectionFilePath != null) {
	            sslClientContextBuilder.trustManager(new File(trustCertCollectionFilePath));
	            sslClientContextBuilder.clientAuth(ClientAuth.REQUIRE);
	        }
	        return GrpcSslContexts.configure(sslClientContextBuilder);
	  }
	  
	  public void start() throws IOException {
		  if(isTlsEnabled) {
			  server = NettyServerBuilder.forPort(port)
		                .addService(new BusinessDataServiceImplementation())
		                .sslContext(getSslContextBuilder().build())
		                .build()
		                .start();
		  } else {
			  server = ServerBuilder.forPort(port)
					  	//	Base Service
				        .addService(new BusinessDataServiceImplementation())
				        //	Core Functionality
				        .addService(new CoreFunctionalityImplementation())
				        //	User Interface
				        .addService(new UserInterfaceServiceImplementation())
				        //	Dashboarding
//				        .addService(new DashboardingServiceImplementation())
				        //	Workflow
//				        .addService(new WorkflowServiceImplementation())
				        //	Entity Log
//				        .addService(new EntityLogServiceImplementation())
				        //	POS
//				        .addService(new PointOfSalesServiceImplementation())
				        .build()
				        .start();
		  }
		  logger.info("Server started, listening on " + port);
		    Runtime.getRuntime().addShutdownHook(new Thread() {
		      @Override
		      public void run() {
		        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
		    	  logger.info("*** shutting down gRPC server since JVM is shutting down");
		        BusinessDataServer.this.stop();
		        logger.info("*** server shut down");
		      }
		    });
	  }

	  public void stop() {
	    if (server != null) {
	      server.shutdown();
	    }
	  }

	  /**
	   * Await termination on the main thread since the grpc library uses daemon threads.
	   */
	  private void blockUntilShutdown() throws InterruptedException {
	    if (server != null) {
	      server.awaitTermination();
	    }
	  }

	  /**
	   * Main launches the server from the command line.
	   */
	  public static void main(String[] args) throws IOException, InterruptedException {
			Adempiere.startup(false);
		    int defaultPort = 50052;
		    if(args != null) {
		    	Optional<String> parameter = Arrays.asList(args).stream()
		    			.filter(arg -> !Util.isEmpty(arg))
		    			.filter(arg -> arg.matches("[+-]?\\d*(\\.\\d+)?")).findFirst();
		    	if(parameter.isPresent()) {
		    		defaultPort = Integer.parseInt(parameter.get());
		    	}
			}
		    String certChainFilePath = (args.length > 1? args[1]: null);
		    String privateKeyFilePath = (args.length > 2? args[2]: null);
		    String trustCertCollectionFilePath = (args.length > 3? args[3]: null);
		    final BusinessDataServer server = new BusinessDataServer(defaultPort, 
		    		certChainFilePath,
		    		privateKeyFilePath,
		    		trustCertCollectionFilePath);
		    server.start();
		    server.blockUntilShutdown();
	  }
}