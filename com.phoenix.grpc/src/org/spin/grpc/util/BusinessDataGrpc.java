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
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: business.proto")
public final class BusinessDataGrpc {

  private BusinessDataGrpc() {}

  public static final String SERVICE_NAME = "data.BusinessData";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetEntityRequest,
      org.spin.grpc.util.Entity> METHOD_GET_ENTITY =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetEntityRequest, org.spin.grpc.util.Entity>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.BusinessData", "GetEntity"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetEntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Entity.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.CreateEntityRequest,
      org.spin.grpc.util.Entity> METHOD_CREATE_ENTITY =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.CreateEntityRequest, org.spin.grpc.util.Entity>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.BusinessData", "CreateEntity"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.CreateEntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Entity.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.UpdateEntityRequest,
      org.spin.grpc.util.Entity> METHOD_UPDATE_ENTITY =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.UpdateEntityRequest, org.spin.grpc.util.Entity>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.BusinessData", "UpdateEntity"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.UpdateEntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Entity.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.DeleteEntityRequest,
      org.spin.grpc.util.Empty> METHOD_DELETE_ENTITY =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.DeleteEntityRequest, org.spin.grpc.util.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.BusinessData", "DeleteEntity"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.DeleteEntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListEntitiesRequest,
      org.spin.grpc.util.ListEntitiesResponse> METHOD_LIST_ENTITIES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListEntitiesRequest, org.spin.grpc.util.ListEntitiesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.BusinessData", "ListEntities"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListEntitiesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListEntitiesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.RunBusinessProcessRequest,
      org.spin.grpc.util.ProcessLog> METHOD_RUN_BUSINESS_PROCESS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.RunBusinessProcessRequest, org.spin.grpc.util.ProcessLog>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.BusinessData", "RunBusinessProcess"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.RunBusinessProcessRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ProcessLog.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BusinessDataStub newStub(io.grpc.Channel channel) {
    return new BusinessDataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BusinessDataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BusinessDataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BusinessDataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BusinessDataFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class BusinessDataImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get a Entity
     * </pre>
     */
    public void getEntity(org.spin.grpc.util.GetEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ENTITY, responseObserver);
    }

    /**
     * <pre>
     * Create Entity Request
     * </pre>
     */
    public void createEntity(org.spin.grpc.util.CreateEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ENTITY, responseObserver);
    }

    /**
     * <pre>
     * Update Entity Request
     * </pre>
     */
    public void updateEntity(org.spin.grpc.util.UpdateEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ENTITY, responseObserver);
    }

    /**
     * <pre>
     * Delete Entity Request
     * </pre>
     */
    public void deleteEntity(org.spin.grpc.util.DeleteEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ENTITY, responseObserver);
    }

    /**
     * <pre>
     *	List a Entities
     * </pre>
     */
    public void listEntities(org.spin.grpc.util.ListEntitiesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListEntitiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_ENTITIES, responseObserver);
    }

    /**
     * <pre>
     *	Request a BusinessProcess / Report
     * </pre>
     */
    public void runBusinessProcess(org.spin.grpc.util.RunBusinessProcessRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ProcessLog> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_BUSINESS_PROCESS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ENTITY,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetEntityRequest,
                org.spin.grpc.util.Entity>(
                  this, METHODID_GET_ENTITY)))
          .addMethod(
            METHOD_CREATE_ENTITY,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.CreateEntityRequest,
                org.spin.grpc.util.Entity>(
                  this, METHODID_CREATE_ENTITY)))
          .addMethod(
            METHOD_UPDATE_ENTITY,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.UpdateEntityRequest,
                org.spin.grpc.util.Entity>(
                  this, METHODID_UPDATE_ENTITY)))
          .addMethod(
            METHOD_DELETE_ENTITY,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.DeleteEntityRequest,
                org.spin.grpc.util.Empty>(
                  this, METHODID_DELETE_ENTITY)))
          .addMethod(
            METHOD_LIST_ENTITIES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListEntitiesRequest,
                org.spin.grpc.util.ListEntitiesResponse>(
                  this, METHODID_LIST_ENTITIES)))
          .addMethod(
            METHOD_RUN_BUSINESS_PROCESS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.RunBusinessProcessRequest,
                org.spin.grpc.util.ProcessLog>(
                  this, METHODID_RUN_BUSINESS_PROCESS)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BusinessDataStub extends io.grpc.stub.AbstractStub<BusinessDataStub> {
    private BusinessDataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BusinessDataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessDataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BusinessDataStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a Entity
     * </pre>
     */
    public void getEntity(org.spin.grpc.util.GetEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ENTITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create Entity Request
     * </pre>
     */
    public void createEntity(org.spin.grpc.util.CreateEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ENTITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update Entity Request
     * </pre>
     */
    public void updateEntity(org.spin.grpc.util.UpdateEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ENTITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete Entity Request
     * </pre>
     */
    public void deleteEntity(org.spin.grpc.util.DeleteEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ENTITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List a Entities
     * </pre>
     */
    public void listEntities(org.spin.grpc.util.ListEntitiesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListEntitiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_ENTITIES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request a BusinessProcess / Report
     * </pre>
     */
    public void runBusinessProcess(org.spin.grpc.util.RunBusinessProcessRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ProcessLog> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RUN_BUSINESS_PROCESS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BusinessDataBlockingStub extends io.grpc.stub.AbstractStub<BusinessDataBlockingStub> {
    private BusinessDataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BusinessDataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessDataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BusinessDataBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a Entity
     * </pre>
     */
    public org.spin.grpc.util.Entity getEntity(org.spin.grpc.util.GetEntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ENTITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create Entity Request
     * </pre>
     */
    public org.spin.grpc.util.Entity createEntity(org.spin.grpc.util.CreateEntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ENTITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update Entity Request
     * </pre>
     */
    public org.spin.grpc.util.Entity updateEntity(org.spin.grpc.util.UpdateEntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ENTITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete Entity Request
     * </pre>
     */
    public org.spin.grpc.util.Empty deleteEntity(org.spin.grpc.util.DeleteEntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ENTITY, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List a Entities
     * </pre>
     */
    public org.spin.grpc.util.ListEntitiesResponse listEntities(org.spin.grpc.util.ListEntitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_ENTITIES, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request a BusinessProcess / Report
     * </pre>
     */
    public org.spin.grpc.util.ProcessLog runBusinessProcess(org.spin.grpc.util.RunBusinessProcessRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RUN_BUSINESS_PROCESS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BusinessDataFutureStub extends io.grpc.stub.AbstractStub<BusinessDataFutureStub> {
    private BusinessDataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BusinessDataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BusinessDataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BusinessDataFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a Entity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Entity> getEntity(
        org.spin.grpc.util.GetEntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ENTITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create Entity Request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Entity> createEntity(
        org.spin.grpc.util.CreateEntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ENTITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update Entity Request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Entity> updateEntity(
        org.spin.grpc.util.UpdateEntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ENTITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete Entity Request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Empty> deleteEntity(
        org.spin.grpc.util.DeleteEntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ENTITY, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List a Entities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListEntitiesResponse> listEntities(
        org.spin.grpc.util.ListEntitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_ENTITIES, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request a BusinessProcess / Report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ProcessLog> runBusinessProcess(
        org.spin.grpc.util.RunBusinessProcessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RUN_BUSINESS_PROCESS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENTITY = 0;
  private static final int METHODID_CREATE_ENTITY = 1;
  private static final int METHODID_UPDATE_ENTITY = 2;
  private static final int METHODID_DELETE_ENTITY = 3;
  private static final int METHODID_LIST_ENTITIES = 4;
  private static final int METHODID_RUN_BUSINESS_PROCESS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BusinessDataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BusinessDataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ENTITY:
          serviceImpl.getEntity((org.spin.grpc.util.GetEntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity>) responseObserver);
          break;
        case METHODID_CREATE_ENTITY:
          serviceImpl.createEntity((org.spin.grpc.util.CreateEntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity>) responseObserver);
          break;
        case METHODID_UPDATE_ENTITY:
          serviceImpl.updateEntity((org.spin.grpc.util.UpdateEntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity>) responseObserver);
          break;
        case METHODID_DELETE_ENTITY:
          serviceImpl.deleteEntity((org.spin.grpc.util.DeleteEntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty>) responseObserver);
          break;
        case METHODID_LIST_ENTITIES:
          serviceImpl.listEntities((org.spin.grpc.util.ListEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListEntitiesResponse>) responseObserver);
          break;
        case METHODID_RUN_BUSINESS_PROCESS:
          serviceImpl.runBusinessProcess((org.spin.grpc.util.RunBusinessProcessRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ProcessLog>) responseObserver);
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

  private static final class BusinessDataDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempiereData.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BusinessDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BusinessDataDescriptorSupplier())
              .addMethod(METHOD_GET_ENTITY)
              .addMethod(METHOD_CREATE_ENTITY)
              .addMethod(METHOD_UPDATE_ENTITY)
              .addMethod(METHOD_DELETE_ENTITY)
              .addMethod(METHOD_LIST_ENTITIES)
              .addMethod(METHOD_RUN_BUSINESS_PROCESS)
              .build();
        }
      }
    }
    return result;
  }
}
