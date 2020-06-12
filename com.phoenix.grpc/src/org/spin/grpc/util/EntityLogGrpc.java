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
 *	Logger services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: business.proto")
public final class EntityLogGrpc {

  private EntityLogGrpc() {}

  public static final String SERVICE_NAME = "data.EntityLog";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListProcessLogsRequest,
      org.spin.grpc.util.ListProcessLogsResponse> METHOD_LIST_PROCESS_LOGS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListProcessLogsRequest, org.spin.grpc.util.ListProcessLogsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.EntityLog", "ListProcessLogs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListProcessLogsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListProcessLogsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListRecordLogsRequest,
      org.spin.grpc.util.ListRecordLogsResponse> METHOD_LIST_RECORD_LOGS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListRecordLogsRequest, org.spin.grpc.util.ListRecordLogsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.EntityLog", "ListRecordLogs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListRecordLogsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListRecordLogsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListRecordChatsRequest,
      org.spin.grpc.util.ListRecordChatsResponse> METHOD_LIST_RECORD_CHATS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListRecordChatsRequest, org.spin.grpc.util.ListRecordChatsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.EntityLog", "ListRecordChats"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListRecordChatsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListRecordChatsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListChatEntriesRequest,
      org.spin.grpc.util.ListChatEntriesResponse> METHOD_LIST_CHAT_ENTRIES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListChatEntriesRequest, org.spin.grpc.util.ListChatEntriesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.EntityLog", "ListChatEntries"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListChatEntriesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListChatEntriesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListWorkflowLogsRequest,
      org.spin.grpc.util.ListWorkflowLogsResponse> METHOD_LIST_WORKFLOW_LOGS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListWorkflowLogsRequest, org.spin.grpc.util.ListWorkflowLogsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.EntityLog", "ListWorkflowLogs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListWorkflowLogsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListWorkflowLogsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListRecentItemsRequest,
      org.spin.grpc.util.ListRecentItemsResponse> METHOD_LIST_RECENT_ITEMS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListRecentItemsRequest, org.spin.grpc.util.ListRecentItemsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.EntityLog", "ListRecentItems"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListRecentItemsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListRecentItemsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EntityLogStub newStub(io.grpc.Channel channel) {
    return new EntityLogStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EntityLogBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EntityLogBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EntityLogFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EntityLogFutureStub(channel);
  }

  /**
   * <pre>
   *	Logger services
   * </pre>
   */
  public static abstract class EntityLogImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *	Request BusinessProcess Activity from current session
     * </pre>
     */
    public void listProcessLogs(org.spin.grpc.util.ListProcessLogsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListProcessLogsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_PROCESS_LOGS, responseObserver);
    }

    /**
     * <pre>
     *	Request Record Log List
     * </pre>
     */
    public void listRecordLogs(org.spin.grpc.util.ListRecordLogsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecordLogsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_RECORD_LOGS, responseObserver);
    }

    /**
     * <pre>
     *	Request Record Chat List
     * </pre>
     */
    public void listRecordChats(org.spin.grpc.util.ListRecordChatsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecordChatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_RECORD_CHATS, responseObserver);
    }

    /**
     * <pre>
     *	Request Chat Entries List
     * </pre>
     */
    public void listChatEntries(org.spin.grpc.util.ListChatEntriesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListChatEntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CHAT_ENTRIES, responseObserver);
    }

    /**
     * <pre>
     *	List workflow processes
     * </pre>
     */
    public void listWorkflowLogs(org.spin.grpc.util.ListWorkflowLogsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWorkflowLogsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_WORKFLOW_LOGS, responseObserver);
    }

    /**
     * <pre>
     *	Request Recent Items
     * </pre>
     */
    public void listRecentItems(org.spin.grpc.util.ListRecentItemsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecentItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_RECENT_ITEMS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_PROCESS_LOGS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListProcessLogsRequest,
                org.spin.grpc.util.ListProcessLogsResponse>(
                  this, METHODID_LIST_PROCESS_LOGS)))
          .addMethod(
            METHOD_LIST_RECORD_LOGS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListRecordLogsRequest,
                org.spin.grpc.util.ListRecordLogsResponse>(
                  this, METHODID_LIST_RECORD_LOGS)))
          .addMethod(
            METHOD_LIST_RECORD_CHATS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListRecordChatsRequest,
                org.spin.grpc.util.ListRecordChatsResponse>(
                  this, METHODID_LIST_RECORD_CHATS)))
          .addMethod(
            METHOD_LIST_CHAT_ENTRIES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListChatEntriesRequest,
                org.spin.grpc.util.ListChatEntriesResponse>(
                  this, METHODID_LIST_CHAT_ENTRIES)))
          .addMethod(
            METHOD_LIST_WORKFLOW_LOGS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListWorkflowLogsRequest,
                org.spin.grpc.util.ListWorkflowLogsResponse>(
                  this, METHODID_LIST_WORKFLOW_LOGS)))
          .addMethod(
            METHOD_LIST_RECENT_ITEMS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListRecentItemsRequest,
                org.spin.grpc.util.ListRecentItemsResponse>(
                  this, METHODID_LIST_RECENT_ITEMS)))
          .build();
    }
  }

  /**
   * <pre>
   *	Logger services
   * </pre>
   */
  public static final class EntityLogStub extends io.grpc.stub.AbstractStub<EntityLogStub> {
    private EntityLogStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntityLogStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityLogStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntityLogStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Request BusinessProcess Activity from current session
     * </pre>
     */
    public void listProcessLogs(org.spin.grpc.util.ListProcessLogsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListProcessLogsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_PROCESS_LOGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Record Log List
     * </pre>
     */
    public void listRecordLogs(org.spin.grpc.util.ListRecordLogsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecordLogsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_RECORD_LOGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Record Chat List
     * </pre>
     */
    public void listRecordChats(org.spin.grpc.util.ListRecordChatsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecordChatsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_RECORD_CHATS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Chat Entries List
     * </pre>
     */
    public void listChatEntries(org.spin.grpc.util.ListChatEntriesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListChatEntriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_CHAT_ENTRIES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List workflow processes
     * </pre>
     */
    public void listWorkflowLogs(org.spin.grpc.util.ListWorkflowLogsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWorkflowLogsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_WORKFLOW_LOGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Recent Items
     * </pre>
     */
    public void listRecentItems(org.spin.grpc.util.ListRecentItemsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecentItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_RECENT_ITEMS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *	Logger services
   * </pre>
   */
  public static final class EntityLogBlockingStub extends io.grpc.stub.AbstractStub<EntityLogBlockingStub> {
    private EntityLogBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntityLogBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityLogBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntityLogBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Request BusinessProcess Activity from current session
     * </pre>
     */
    public org.spin.grpc.util.ListProcessLogsResponse listProcessLogs(org.spin.grpc.util.ListProcessLogsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_PROCESS_LOGS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Record Log List
     * </pre>
     */
    public org.spin.grpc.util.ListRecordLogsResponse listRecordLogs(org.spin.grpc.util.ListRecordLogsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_RECORD_LOGS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Record Chat List
     * </pre>
     */
    public org.spin.grpc.util.ListRecordChatsResponse listRecordChats(org.spin.grpc.util.ListRecordChatsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_RECORD_CHATS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Chat Entries List
     * </pre>
     */
    public org.spin.grpc.util.ListChatEntriesResponse listChatEntries(org.spin.grpc.util.ListChatEntriesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CHAT_ENTRIES, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List workflow processes
     * </pre>
     */
    public org.spin.grpc.util.ListWorkflowLogsResponse listWorkflowLogs(org.spin.grpc.util.ListWorkflowLogsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_WORKFLOW_LOGS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Recent Items
     * </pre>
     */
    public org.spin.grpc.util.ListRecentItemsResponse listRecentItems(org.spin.grpc.util.ListRecentItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_RECENT_ITEMS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *	Logger services
   * </pre>
   */
  public static final class EntityLogFutureStub extends io.grpc.stub.AbstractStub<EntityLogFutureStub> {
    private EntityLogFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntityLogFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityLogFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntityLogFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Request BusinessProcess Activity from current session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListProcessLogsResponse> listProcessLogs(
        org.spin.grpc.util.ListProcessLogsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_PROCESS_LOGS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Record Log List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListRecordLogsResponse> listRecordLogs(
        org.spin.grpc.util.ListRecordLogsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_RECORD_LOGS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Record Chat List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListRecordChatsResponse> listRecordChats(
        org.spin.grpc.util.ListRecordChatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_RECORD_CHATS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Chat Entries List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListChatEntriesResponse> listChatEntries(
        org.spin.grpc.util.ListChatEntriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_CHAT_ENTRIES, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List workflow processes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListWorkflowLogsResponse> listWorkflowLogs(
        org.spin.grpc.util.ListWorkflowLogsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_WORKFLOW_LOGS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Recent Items
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListRecentItemsResponse> listRecentItems(
        org.spin.grpc.util.ListRecentItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_RECENT_ITEMS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PROCESS_LOGS = 0;
  private static final int METHODID_LIST_RECORD_LOGS = 1;
  private static final int METHODID_LIST_RECORD_CHATS = 2;
  private static final int METHODID_LIST_CHAT_ENTRIES = 3;
  private static final int METHODID_LIST_WORKFLOW_LOGS = 4;
  private static final int METHODID_LIST_RECENT_ITEMS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EntityLogImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EntityLogImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_PROCESS_LOGS:
          serviceImpl.listProcessLogs((org.spin.grpc.util.ListProcessLogsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListProcessLogsResponse>) responseObserver);
          break;
        case METHODID_LIST_RECORD_LOGS:
          serviceImpl.listRecordLogs((org.spin.grpc.util.ListRecordLogsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecordLogsResponse>) responseObserver);
          break;
        case METHODID_LIST_RECORD_CHATS:
          serviceImpl.listRecordChats((org.spin.grpc.util.ListRecordChatsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecordChatsResponse>) responseObserver);
          break;
        case METHODID_LIST_CHAT_ENTRIES:
          serviceImpl.listChatEntries((org.spin.grpc.util.ListChatEntriesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListChatEntriesResponse>) responseObserver);
          break;
        case METHODID_LIST_WORKFLOW_LOGS:
          serviceImpl.listWorkflowLogs((org.spin.grpc.util.ListWorkflowLogsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListWorkflowLogsResponse>) responseObserver);
          break;
        case METHODID_LIST_RECENT_ITEMS:
          serviceImpl.listRecentItems((org.spin.grpc.util.ListRecentItemsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListRecentItemsResponse>) responseObserver);
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

  private static final class EntityLogDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempiereData.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EntityLogGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EntityLogDescriptorSupplier())
              .addMethod(METHOD_LIST_PROCESS_LOGS)
              .addMethod(METHOD_LIST_RECORD_LOGS)
              .addMethod(METHOD_LIST_RECORD_CHATS)
              .addMethod(METHOD_LIST_CHAT_ENTRIES)
              .addMethod(METHOD_LIST_WORKFLOW_LOGS)
              .addMethod(METHOD_LIST_RECENT_ITEMS)
              .build();
        }
      }
    }
    return result;
  }
}
