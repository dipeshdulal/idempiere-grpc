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
 *	All related to dashboarding
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: business.proto")
public final class DashboardingGrpc {

  private DashboardingGrpc() {}

  public static final String SERVICE_NAME = "data.Dashboarding";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListDashboardsRequest,
      org.spin.grpc.util.ListDashboardsResponse> METHOD_LIST_DASHBOARDS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListDashboardsRequest, org.spin.grpc.util.ListDashboardsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Dashboarding", "ListDashboards"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListDashboardsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListDashboardsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListFavoritesRequest,
      org.spin.grpc.util.ListFavoritesResponse> METHOD_LIST_FAVORITES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListFavoritesRequest, org.spin.grpc.util.ListFavoritesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Dashboarding", "ListFavorites"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListFavoritesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListFavoritesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListPendingDocumentsRequest,
      org.spin.grpc.util.ListPendingDocumentsResponse> METHOD_LIST_PENDING_DOCUMENTS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListPendingDocumentsRequest, org.spin.grpc.util.ListPendingDocumentsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Dashboarding", "ListPendingDocuments"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListPendingDocumentsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListPendingDocumentsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DashboardingStub newStub(io.grpc.Channel channel) {
    return new DashboardingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DashboardingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DashboardingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DashboardingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DashboardingFutureStub(channel);
  }

  /**
   * <pre>
   *	All related to dashboarding
   * </pre>
   */
  public static abstract class DashboardingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *	Request Dashboards Content Edit
     * </pre>
     */
    public void listDashboards(org.spin.grpc.util.ListDashboardsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDashboardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DASHBOARDS, responseObserver);
    }

    /**
     * <pre>
     *	Request Favorites
     * </pre>
     */
    public void listFavorites(org.spin.grpc.util.ListFavoritesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListFavoritesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_FAVORITES, responseObserver);
    }

    /**
     * <pre>
     *	Request Document Statuses
     * </pre>
     */
    public void listPendingDocuments(org.spin.grpc.util.ListPendingDocumentsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPendingDocumentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_PENDING_DOCUMENTS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_DASHBOARDS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListDashboardsRequest,
                org.spin.grpc.util.ListDashboardsResponse>(
                  this, METHODID_LIST_DASHBOARDS)))
          .addMethod(
            METHOD_LIST_FAVORITES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListFavoritesRequest,
                org.spin.grpc.util.ListFavoritesResponse>(
                  this, METHODID_LIST_FAVORITES)))
          .addMethod(
            METHOD_LIST_PENDING_DOCUMENTS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListPendingDocumentsRequest,
                org.spin.grpc.util.ListPendingDocumentsResponse>(
                  this, METHODID_LIST_PENDING_DOCUMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   *	All related to dashboarding
   * </pre>
   */
  public static final class DashboardingStub extends io.grpc.stub.AbstractStub<DashboardingStub> {
    private DashboardingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardingStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Request Dashboards Content Edit
     * </pre>
     */
    public void listDashboards(org.spin.grpc.util.ListDashboardsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDashboardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DASHBOARDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Favorites
     * </pre>
     */
    public void listFavorites(org.spin.grpc.util.ListFavoritesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListFavoritesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_FAVORITES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Document Statuses
     * </pre>
     */
    public void listPendingDocuments(org.spin.grpc.util.ListPendingDocumentsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPendingDocumentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_PENDING_DOCUMENTS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *	All related to dashboarding
   * </pre>
   */
  public static final class DashboardingBlockingStub extends io.grpc.stub.AbstractStub<DashboardingBlockingStub> {
    private DashboardingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Request Dashboards Content Edit
     * </pre>
     */
    public org.spin.grpc.util.ListDashboardsResponse listDashboards(org.spin.grpc.util.ListDashboardsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DASHBOARDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Favorites
     * </pre>
     */
    public org.spin.grpc.util.ListFavoritesResponse listFavorites(org.spin.grpc.util.ListFavoritesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_FAVORITES, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Document Statuses
     * </pre>
     */
    public org.spin.grpc.util.ListPendingDocumentsResponse listPendingDocuments(org.spin.grpc.util.ListPendingDocumentsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_PENDING_DOCUMENTS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *	All related to dashboarding
   * </pre>
   */
  public static final class DashboardingFutureStub extends io.grpc.stub.AbstractStub<DashboardingFutureStub> {
    private DashboardingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Request Dashboards Content Edit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListDashboardsResponse> listDashboards(
        org.spin.grpc.util.ListDashboardsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DASHBOARDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Favorites
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListFavoritesResponse> listFavorites(
        org.spin.grpc.util.ListFavoritesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_FAVORITES, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Document Statuses
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListPendingDocumentsResponse> listPendingDocuments(
        org.spin.grpc.util.ListPendingDocumentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_PENDING_DOCUMENTS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DASHBOARDS = 0;
  private static final int METHODID_LIST_FAVORITES = 1;
  private static final int METHODID_LIST_PENDING_DOCUMENTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DashboardingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DashboardingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DASHBOARDS:
          serviceImpl.listDashboards((org.spin.grpc.util.ListDashboardsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDashboardsResponse>) responseObserver);
          break;
        case METHODID_LIST_FAVORITES:
          serviceImpl.listFavorites((org.spin.grpc.util.ListFavoritesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListFavoritesResponse>) responseObserver);
          break;
        case METHODID_LIST_PENDING_DOCUMENTS:
          serviceImpl.listPendingDocuments((org.spin.grpc.util.ListPendingDocumentsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPendingDocumentsResponse>) responseObserver);
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

  private static final class DashboardingDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempiereData.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DashboardingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DashboardingDescriptorSupplier())
              .addMethod(METHOD_LIST_DASHBOARDS)
              .addMethod(METHOD_LIST_FAVORITES)
              .addMethod(METHOD_LIST_PENDING_DOCUMENTS)
              .build();
        }
      }
    }
    return result;
  }
}
