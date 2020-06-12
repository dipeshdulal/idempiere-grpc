package com.phoenix.grpc;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.spin.grpc.util.impl.AccessServer;
import org.spin.grpc.util.impl.DictionaryServer;
import org.spin.grpc.util.impl.EnrollmentServer;

public class Activator implements BundleActivator {

	DictionaryServer dictionaryServer;
	AccessServer accessServer;
	EnrollmentServer enrollmentServer;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start grpc");
//		Dictionary<String, String> props = new Hashtable<String, String>();
//		props.put("service.exported.interfaces", "*");
//		props.put("service.exported.configs","ecf.generic.server");
//		props.put("ecf.grcp.server.urlContext", "http://localhost:50001");
//		context.registerService(GreeterServer.class, new GreeterServer(), props);
		dictionaryServer = new DictionaryServer(50051);
		dictionaryServer.start();
		accessServer = new AccessServer(50050);
		accessServer.start();
		enrollmentServer = new EnrollmentServer(50047);
		enrollmentServer.start();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Grpc");
		dictionaryServer.stop();
		accessServer.stop();
		enrollmentServer.stop();
	}

}
