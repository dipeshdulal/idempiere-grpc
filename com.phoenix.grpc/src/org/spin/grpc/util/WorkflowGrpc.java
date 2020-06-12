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
 *	Workflow management service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: business.proto")
public final class WorkflowGrpc {

  private WorkflowGrpc() {}

  public static final String SERVICE_NAME = "data.Workflow";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListWorkflowsRequest,
      org.spin.grpc.util.ListWorkflowsResponse> METHOD_LIST_WORKFLOWS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListWorkflowsRequest, org.spin.grpc.util.ListWorkflowsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Workflow", "ListWorkflows"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListWorkflowsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListWorkflowsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListDocumentActionsRequest,
      org.spin.grpc.util.ListDocumentActionsResponse> METHOD_LIST_DOCUMENT_ACTIONS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListDocumentActionsRequest, org.spin.grpc.util.ListDocumentActionsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Workflow", "ListDocumentActions"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListDocumentActionsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListDocumentActionsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListDocumentStatusesRequest,
      org.spin.grpc.util.ListDocumentStatusesResponse> METHOD_LIST_DOCUMENT_STATUSES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListDocumentStatusesRequest, org.spin.grpc.util.ListDocumentStatusesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Workflow", "ListDocumentStatuses"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListDocumentStatusesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListDocumentStatusesResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowStub newStub(io.grpc.Channel channel) {
    return new WorkflowStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WorkflowBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WorkflowFutureStub(channel);
  }

  /**
   * <pre>
   *	Workflow management service
   * </pre>
   */
  public static abstract class WorkflowImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *	List Workflow
     * </pre>
     */
    public void listWorkflows(org.spin.grpc.util.ListWorkflowsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWorkflowsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_WORKFLOWS, responseObserver);
    }

    /**
     * <pre>
     *	List Document Actions
     * </pre>
     */
    public void listDocumentActions(org.spin.grpc.util.ListDocumentActionsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDocumentActionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DOCUMENT_ACTIONS, responseObserver);
    }

    /**
     * <pre>
     *	List Document Statuses
     * </pre>
     */
    public void listDocumentStatuses(org.spin.grpc.util.ListDocumentStatusesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDocumentStatusesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DOCUMENT_STATUSES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_WORKFLOWS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListWorkflowsRequest,
                org.spin.grpc.util.ListWorkflowsResponse>(
                  this, METHODID_LIST_WORKFLOWS)))
          .addMethod(
            METHOD_LIST_DOCUMENT_ACTIONS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListDocumentActionsRequest,
                org.spin.grpc.util.ListDocumentActionsResponse>(
                  this, METHODID_LIST_DOCUMENT_ACTIONS)))
          .addMethod(
            METHOD_LIST_DOCUMENT_STATUSES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListDocumentStatusesRequest,
                org.spin.grpc.util.ListDocumentStatusesResponse>(
                  this, METHODID_LIST_DOCUMENT_STATUSES)))
          .build();
    }
  }

  /**
   * <pre>
   *	Workflow management service
   * </pre>
   */
  public static final class WorkflowStub extends io.grpc.stub.AbstractStub<WorkflowStub> {
    private WorkflowStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkflowStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkflowStub(channel, callOptions);
    }

    /**
     * <pre>
     *	List Workflow
     * </pre>
     */
    public void listWorkflows(org.spin.grpc.util.ListWorkflowsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWorkflowsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_WORKFLOWS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List Document Actions
     * </pre>
     */
    public void listDocumentActions(org.spin.grpc.util.ListDocumentActionsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDocumentActionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DOCUMENT_ACTIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List Document Statuses
     * </pre>
     */
    public void listDocumentStatuses(org.spin.grpc.util.ListDocumentStatusesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDocumentStatusesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DOCUMENT_STATUSES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *	Workflow management service
   * </pre>
   */
  public static final class WorkflowBlockingStub extends io.grpc.stub.AbstractStub<WorkflowBlockingStub> {
    private WorkflowBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkflowBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkflowBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *	List Workflow
     * </pre>
     */
    public org.spin.grpc.util.ListWorkflowsResponse listWorkflows(org.spin.grpc.util.ListWorkflowsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_WORKFLOWS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List Document Actions
     * </pre>
     */
    public org.spin.grpc.util.ListDocumentActionsResponse listDocumentActions(org.spin.grpc.util.ListDocumentActionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DOCUMENT_ACTIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List Document Statuses
     * </pre>
     */
    public org.spin.grpc.util.ListDocumentStatusesResponse listDocumentStatuses(org.spin.grpc.util.ListDocumentStatusesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DOCUMENT_STATUSES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *	Workflow management service
   * </pre>
   */
  public static final class WorkflowFutureStub extends io.grpc.stub.AbstractStub<WorkflowFutureStub> {
    private WorkflowFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkflowFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkflowFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *	List Workflow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListWorkflowsResponse> listWorkflows(
        org.spin.grpc.util.ListWorkflowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_WORKFLOWS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List Document Actions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListDocumentActionsResponse> listDocumentActions(
        org.spin.grpc.util.ListDocumentActionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DOCUMENT_ACTIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List Document Statuses
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListDocumentStatusesResponse> listDocumentStatuses(
        org.spin.grpc.util.ListDocumentStatusesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DOCUMENT_STATUSES, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_WORKFLOWS = 0;
  private static final int METHODID_LIST_DOCUMENT_ACTIONS = 1;
  private static final int METHODID_LIST_DOCUMENT_STATUSES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkflowImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_WORKFLOWS:
          serviceImpl.listWorkflows((org.spin.grpc.util.ListWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWorkflowsResponse>) responseObserver);
          break;
        case METHODID_LIST_DOCUMENT_ACTIONS:
          serviceImpl.listDocumentActions((org.spin.grpc.util.ListDocumentActionsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDocumentActionsResponse>) responseObserver);
          break;
        case METHODID_LIST_DOCUMENT_STATUSES:
          serviceImpl.listDocumentStatuses((org.spin.grpc.util.ListDocumentStatusesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDocumentStatusesResponse>) responseObserver);
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

  private static final class WorkflowDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempiereData.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WorkflowGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowDescriptorSupplier())
              .addMethod(METHOD_LIST_WORKFLOWS)
              .addMethod(METHOD_LIST_DOCUMENT_ACTIONS)
              .addMethod(METHOD_LIST_DOCUMENT_STATUSES)
              .build();
        }
      }
    }
    return result;
  }
}
