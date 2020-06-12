package org.spin.grpc.util;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: core_functionality.proto")
public final class CoreFunctionalityGrpc {

  private CoreFunctionalityGrpc() {}

  public static final String SERVICE_NAME = "data.CoreFunctionality";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetCountryRequest,
      org.spin.grpc.util.Country> METHOD_GET_COUNTRY =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetCountryRequest, org.spin.grpc.util.Country>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.CoreFunctionality", "GetCountry"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetCountryRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Country.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListOrganizationsRequest,
      org.spin.grpc.util.ListOrganizationsResponse> METHOD_LIST_ORGANIZATIONS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListOrganizationsRequest, org.spin.grpc.util.ListOrganizationsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.CoreFunctionality", "ListOrganizations"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListOrganizationsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListOrganizationsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListWarehousesRequest,
      org.spin.grpc.util.ListWarehousesResponse> METHOD_LIST_WAREHOUSES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListWarehousesRequest, org.spin.grpc.util.ListWarehousesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.CoreFunctionality", "ListWarehouses"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListWarehousesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListWarehousesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListLanguagesRequest,
      org.spin.grpc.util.ListLanguagesResponse> METHOD_LIST_LANGUAGES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListLanguagesRequest, org.spin.grpc.util.ListLanguagesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.CoreFunctionality", "ListLanguages"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListLanguagesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListLanguagesResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreFunctionalityStub newStub(io.grpc.Channel channel) {
    return new CoreFunctionalityStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreFunctionalityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CoreFunctionalityBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreFunctionalityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CoreFunctionalityFutureStub(channel);
  }

  /**
   */
  public static abstract class CoreFunctionalityImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *	Get Country Information
     * </pre>
     */
    public void getCountry(org.spin.grpc.util.GetCountryRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Country> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COUNTRY, responseObserver);
    }

    /**
     * <pre>
     *	List Organizations
     * </pre>
     */
    public void listOrganizations(org.spin.grpc.util.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrganizationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_ORGANIZATIONS, responseObserver);
    }

    /**
     * <pre>
     *	Warehouses
     * </pre>
     */
    public void listWarehouses(org.spin.grpc.util.ListWarehousesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWarehousesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_WAREHOUSES, responseObserver);
    }

    /**
     * <pre>
     *	Request Language List
     * </pre>
     */
    public void listLanguages(org.spin.grpc.util.ListLanguagesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListLanguagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_LANGUAGES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_COUNTRY,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetCountryRequest,
                org.spin.grpc.util.Country>(
                  this, METHODID_GET_COUNTRY)))
          .addMethod(
            METHOD_LIST_ORGANIZATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListOrganizationsRequest,
                org.spin.grpc.util.ListOrganizationsResponse>(
                  this, METHODID_LIST_ORGANIZATIONS)))
          .addMethod(
            METHOD_LIST_WAREHOUSES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListWarehousesRequest,
                org.spin.grpc.util.ListWarehousesResponse>(
                  this, METHODID_LIST_WAREHOUSES)))
          .addMethod(
            METHOD_LIST_LANGUAGES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListLanguagesRequest,
                org.spin.grpc.util.ListLanguagesResponse>(
                  this, METHODID_LIST_LANGUAGES)))
          .build();
    }
  }

  /**
   */
  public static final class CoreFunctionalityStub extends io.grpc.stub.AbstractStub<CoreFunctionalityStub> {
    private CoreFunctionalityStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreFunctionalityStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreFunctionalityStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreFunctionalityStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Get Country Information
     * </pre>
     */
    public void getCountry(org.spin.grpc.util.GetCountryRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Country> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COUNTRY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List Organizations
     * </pre>
     */
    public void listOrganizations(org.spin.grpc.util.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrganizationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_ORGANIZATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Warehouses
     * </pre>
     */
    public void listWarehouses(org.spin.grpc.util.ListWarehousesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWarehousesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_WAREHOUSES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Language List
     * </pre>
     */
    public void listLanguages(org.spin.grpc.util.ListLanguagesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListLanguagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_LANGUAGES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoreFunctionalityBlockingStub extends io.grpc.stub.AbstractStub<CoreFunctionalityBlockingStub> {
    private CoreFunctionalityBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreFunctionalityBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreFunctionalityBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreFunctionalityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Get Country Information
     * </pre>
     */
    public org.spin.grpc.util.Country getCountry(org.spin.grpc.util.GetCountryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COUNTRY, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List Organizations
     * </pre>
     */
    public org.spin.grpc.util.ListOrganizationsResponse listOrganizations(org.spin.grpc.util.ListOrganizationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_ORGANIZATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Warehouses
     * </pre>
     */
    public org.spin.grpc.util.ListWarehousesResponse listWarehouses(org.spin.grpc.util.ListWarehousesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_WAREHOUSES, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Language List
     * </pre>
     */
    public org.spin.grpc.util.ListLanguagesResponse listLanguages(org.spin.grpc.util.ListLanguagesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_LANGUAGES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoreFunctionalityFutureStub extends io.grpc.stub.AbstractStub<CoreFunctionalityFutureStub> {
    private CoreFunctionalityFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreFunctionalityFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreFunctionalityFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreFunctionalityFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Get Country Information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Country> getCountry(
        org.spin.grpc.util.GetCountryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COUNTRY, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List Organizations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListOrganizationsResponse> listOrganizations(
        org.spin.grpc.util.ListOrganizationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_ORGANIZATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Warehouses
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListWarehousesResponse> listWarehouses(
        org.spin.grpc.util.ListWarehousesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_WAREHOUSES, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Language List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListLanguagesResponse> listLanguages(
        org.spin.grpc.util.ListLanguagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_LANGUAGES, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COUNTRY = 0;
  private static final int METHODID_LIST_ORGANIZATIONS = 1;
  private static final int METHODID_LIST_WAREHOUSES = 2;
  private static final int METHODID_LIST_LANGUAGES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoreFunctionalityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoreFunctionalityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COUNTRY:
          serviceImpl.getCountry((org.spin.grpc.util.GetCountryRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Country>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATIONS:
          serviceImpl.listOrganizations((org.spin.grpc.util.ListOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrganizationsResponse>) responseObserver);
          break;
        case METHODID_LIST_WAREHOUSES:
          serviceImpl.listWarehouses((org.spin.grpc.util.ListWarehousesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWarehousesResponse>) responseObserver);
          break;
        case METHODID_LIST_LANGUAGES:
          serviceImpl.listLanguages((org.spin.grpc.util.ListLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListLanguagesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class CoreFunctionalityDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempiereCoreFunctionality.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CoreFunctionalityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoreFunctionalityDescriptorSupplier())
              .addMethod(METHOD_GET_COUNTRY)
              .addMethod(METHOD_LIST_ORGANIZATIONS)
              .addMethod(METHOD_LIST_WAREHOUSES)
              .addMethod(METHOD_LIST_LANGUAGES)
              .build();
        }
      }
    }
    return result;
  }
}
