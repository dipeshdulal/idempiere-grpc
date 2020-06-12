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
 *	User Interface
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: business.proto")
public final class UserInterfaceGrpc {

  private UserInterfaceGrpc() {}

  public static final String SERVICE_NAME = "data.UserInterface";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.RollbackEntityRequest,
      org.spin.grpc.util.Entity> METHOD_ROLLBACK_ENTITY =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.RollbackEntityRequest, org.spin.grpc.util.Entity>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "RollbackEntity"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.RollbackEntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Entity.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.RunCalloutRequest,
      org.spin.grpc.util.Callout> METHOD_RUN_CALLOUT =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.RunCalloutRequest, org.spin.grpc.util.Callout>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "RunCallout"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.RunCalloutRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Callout.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListTranslationsRequest,
      org.spin.grpc.util.ListTranslationsResponse> METHOD_LIST_TRANSLATIONS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListTranslationsRequest, org.spin.grpc.util.ListTranslationsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "ListTranslations"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListTranslationsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListTranslationsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetDefaultValueRequest,
      org.spin.grpc.util.Value> METHOD_GET_DEFAULT_VALUE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetDefaultValueRequest, org.spin.grpc.util.Value>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "GetDefaultValue"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetDefaultValueRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Value.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetLookupItemRequest,
      org.spin.grpc.util.LookupItem> METHOD_GET_LOOKUP_ITEM =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetLookupItemRequest, org.spin.grpc.util.LookupItem>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "GetLookupItem"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetLookupItemRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.LookupItem.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListLookupItemsRequest,
      org.spin.grpc.util.ListLookupItemsResponse> METHOD_LIST_LOOKUP_ITEMS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListLookupItemsRequest, org.spin.grpc.util.ListLookupItemsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "ListLookupItems"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListLookupItemsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListLookupItemsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListBrowserItemsRequest,
      org.spin.grpc.util.ListBrowserItemsResponse> METHOD_LIST_BROWSER_ITEMS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListBrowserItemsRequest, org.spin.grpc.util.ListBrowserItemsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "ListBrowserItems"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListBrowserItemsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListBrowserItemsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListReferencesRequest,
      org.spin.grpc.util.ListReferencesResponse> METHOD_LIST_REFERENCES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListReferencesRequest, org.spin.grpc.util.ListReferencesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "ListReferences"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListReferencesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListReferencesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetContextInfoValueRequest,
      org.spin.grpc.util.ContextInfoValue> METHOD_GET_CONTEXT_INFO_VALUE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetContextInfoValueRequest, org.spin.grpc.util.ContextInfoValue>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "GetContextInfoValue"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetContextInfoValueRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ContextInfoValue.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetPrivateAccessRequest,
      org.spin.grpc.util.PrivateAccess> METHOD_GET_PRIVATE_ACCESS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetPrivateAccessRequest, org.spin.grpc.util.PrivateAccess>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "GetPrivateAccess"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetPrivateAccessRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.PrivateAccess.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.LockPrivateAccessRequest,
      org.spin.grpc.util.PrivateAccess> METHOD_LOCK_PRIVATE_ACCESS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.LockPrivateAccessRequest, org.spin.grpc.util.PrivateAccess>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "LockPrivateAccess"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.LockPrivateAccessRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.PrivateAccess.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.UnlockPrivateAccessRequest,
      org.spin.grpc.util.PrivateAccess> METHOD_UNLOCK_PRIVATE_ACCESS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.UnlockPrivateAccessRequest, org.spin.grpc.util.PrivateAccess>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "UnlockPrivateAccess"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.UnlockPrivateAccessRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.PrivateAccess.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListPrintFormatsRequest,
      org.spin.grpc.util.ListPrintFormatsResponse> METHOD_LIST_PRINT_FORMATS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListPrintFormatsRequest, org.spin.grpc.util.ListPrintFormatsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "ListPrintFormats"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListPrintFormatsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListPrintFormatsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListReportViewsRequest,
      org.spin.grpc.util.ListReportViewsResponse> METHOD_LIST_REPORT_VIEWS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListReportViewsRequest, org.spin.grpc.util.ListReportViewsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "ListReportViews"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListReportViewsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListReportViewsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListDrillTablesRequest,
      org.spin.grpc.util.ListDrillTablesResponse> METHOD_LIST_DRILL_TABLES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListDrillTablesRequest, org.spin.grpc.util.ListDrillTablesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "ListDrillTables"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListDrillTablesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListDrillTablesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetReportOutputRequest,
      org.spin.grpc.util.ReportOutput> METHOD_GET_REPORT_OUTPUT =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetReportOutputRequest, org.spin.grpc.util.ReportOutput>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "GetReportOutput"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetReportOutputRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ReportOutput.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.CreateChatEntryRequest,
      org.spin.grpc.util.ChatEntry> METHOD_CREATE_CHAT_ENTRY =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.CreateChatEntryRequest, org.spin.grpc.util.ChatEntry>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "CreateChatEntry"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.CreateChatEntryRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ChatEntry.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetResourceRequest,
      org.spin.grpc.util.Resource> METHOD_GET_RESOURCE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetResourceRequest, org.spin.grpc.util.Resource>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "GetResource"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetResourceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Resource.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetResourceReferenceRequest,
      org.spin.grpc.util.ResourceReference> METHOD_GET_RESOURCE_REFERENCE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetResourceReferenceRequest, org.spin.grpc.util.ResourceReference>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "GetResourceReference"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetResourceReferenceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ResourceReference.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetAttachmentRequest,
      org.spin.grpc.util.Attachment> METHOD_GET_ATTACHMENT =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetAttachmentRequest, org.spin.grpc.util.Attachment>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.UserInterface", "GetAttachment"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetAttachmentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Attachment.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserInterfaceStub newStub(io.grpc.Channel channel) {
    return new UserInterfaceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserInterfaceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserInterfaceFutureStub(channel);
  }

  /**
   * <pre>
   *	User Interface
   * </pre>
   */
  public static abstract class UserInterfaceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *	Rollback Entity Request
     * </pre>
     */
    public void rollbackEntity(org.spin.grpc.util.RollbackEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ROLLBACK_ENTITY, responseObserver);
    }

    /**
     * <pre>
     * Run a Callout
     * </pre>
     */
    public void runCallout(org.spin.grpc.util.RunCalloutRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Callout> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_CALLOUT, responseObserver);
    }

    /**
     * <pre>
     *	Request Translations List
     * </pre>
     */
    public void listTranslations(org.spin.grpc.util.ListTranslationsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListTranslationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TRANSLATIONS, responseObserver);
    }

    /**
     * <pre>
     * Get Default Value
     * </pre>
     */
    public void getDefaultValue(org.spin.grpc.util.GetDefaultValueRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Value> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEFAULT_VALUE, responseObserver);
    }

    /**
     * <pre>
     * Get Lookup Item
     * </pre>
     */
    public void getLookupItem(org.spin.grpc.util.GetLookupItemRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.LookupItem> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_LOOKUP_ITEM, responseObserver);
    }

    /**
     * <pre>
     * List Lookup Item
     * </pre>
     */
    public void listLookupItems(org.spin.grpc.util.ListLookupItemsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListLookupItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_LOOKUP_ITEMS, responseObserver);
    }

    /**
     * <pre>
     *	Request Browser Data
     * </pre>
     */
    public void listBrowserItems(org.spin.grpc.util.ListBrowserItemsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListBrowserItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BROWSER_ITEMS, responseObserver);
    }

    /**
     * <pre>
     * List a References
     * </pre>
     */
    public void listReferences(org.spin.grpc.util.ListReferencesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListReferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_REFERENCES, responseObserver);
    }

    /**
     * <pre>
     * Get context Info
     * </pre>
     */
    public void getContextInfoValue(org.spin.grpc.util.GetContextInfoValueRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ContextInfoValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CONTEXT_INFO_VALUE, responseObserver);
    }

    /**
     * <pre>
     * Get Private Access
     * </pre>
     */
    public void getPrivateAccess(org.spin.grpc.util.GetPrivateAccessRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRIVATE_ACCESS, responseObserver);
    }

    /**
     * <pre>
     * Create Private Access
     * </pre>
     */
    public void lockPrivateAccess(org.spin.grpc.util.LockPrivateAccessRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOCK_PRIVATE_ACCESS, responseObserver);
    }

    /**
     * <pre>
     * Change Private Access
     * </pre>
     */
    public void unlockPrivateAccess(org.spin.grpc.util.UnlockPrivateAccessRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UNLOCK_PRIVATE_ACCESS, responseObserver);
    }

    /**
     * <pre>
     *	Request Print Format List
     * </pre>
     */
    public void listPrintFormats(org.spin.grpc.util.ListPrintFormatsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPrintFormatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_PRINT_FORMATS, responseObserver);
    }

    /**
     * <pre>
     *	Request Report View List
     * </pre>
     */
    public void listReportViews(org.spin.grpc.util.ListReportViewsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListReportViewsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_REPORT_VIEWS, responseObserver);
    }

    /**
     * <pre>
     *	Request Drill Tables List
     * </pre>
     */
    public void listDrillTables(org.spin.grpc.util.ListDrillTablesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDrillTablesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DRILL_TABLES, responseObserver);
    }

    /**
     * <pre>
     *	Request Report Output
     * </pre>
     */
    public void getReportOutput(org.spin.grpc.util.GetReportOutputRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ReportOutput> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REPORT_OUTPUT, responseObserver);
    }

    /**
     * <pre>
     * Add Chat Entry
     * </pre>
     */
    public void createChatEntry(org.spin.grpc.util.CreateChatEntryRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ChatEntry> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CHAT_ENTRY, responseObserver);
    }

    /**
     * <pre>
     *	Service for get a resource from resource uuid
     * </pre>
     */
    public void getResource(org.spin.grpc.util.GetResourceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Resource> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RESOURCE, responseObserver);
    }

    /**
     * <pre>
     *	Service for get a resource reference from image, attachment or archive
     * </pre>
     */
    public void getResourceReference(org.spin.grpc.util.GetResourceReferenceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ResourceReference> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RESOURCE_REFERENCE, responseObserver);
    }

    /**
     * <pre>
     *	Service for get a attachment from table and record uuid
     * </pre>
     */
    public void getAttachment(org.spin.grpc.util.GetAttachmentRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Attachment> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ATTACHMENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ROLLBACK_ENTITY,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.RollbackEntityRequest,
                org.spin.grpc.util.Entity>(
                  this, METHODID_ROLLBACK_ENTITY)))
          .addMethod(
            METHOD_RUN_CALLOUT,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.RunCalloutRequest,
                org.spin.grpc.util.Callout>(
                  this, METHODID_RUN_CALLOUT)))
          .addMethod(
            METHOD_LIST_TRANSLATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListTranslationsRequest,
                org.spin.grpc.util.ListTranslationsResponse>(
                  this, METHODID_LIST_TRANSLATIONS)))
          .addMethod(
            METHOD_GET_DEFAULT_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetDefaultValueRequest,
                org.spin.grpc.util.Value>(
                  this, METHODID_GET_DEFAULT_VALUE)))
          .addMethod(
            METHOD_GET_LOOKUP_ITEM,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetLookupItemRequest,
                org.spin.grpc.util.LookupItem>(
                  this, METHODID_GET_LOOKUP_ITEM)))
          .addMethod(
            METHOD_LIST_LOOKUP_ITEMS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListLookupItemsRequest,
                org.spin.grpc.util.ListLookupItemsResponse>(
                  this, METHODID_LIST_LOOKUP_ITEMS)))
          .addMethod(
            METHOD_LIST_BROWSER_ITEMS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListBrowserItemsRequest,
                org.spin.grpc.util.ListBrowserItemsResponse>(
                  this, METHODID_LIST_BROWSER_ITEMS)))
          .addMethod(
            METHOD_LIST_REFERENCES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListReferencesRequest,
                org.spin.grpc.util.ListReferencesResponse>(
                  this, METHODID_LIST_REFERENCES)))
          .addMethod(
            METHOD_GET_CONTEXT_INFO_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetContextInfoValueRequest,
                org.spin.grpc.util.ContextInfoValue>(
                  this, METHODID_GET_CONTEXT_INFO_VALUE)))
          .addMethod(
            METHOD_GET_PRIVATE_ACCESS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetPrivateAccessRequest,
                org.spin.grpc.util.PrivateAccess>(
                  this, METHODID_GET_PRIVATE_ACCESS)))
          .addMethod(
            METHOD_LOCK_PRIVATE_ACCESS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.LockPrivateAccessRequest,
                org.spin.grpc.util.PrivateAccess>(
                  this, METHODID_LOCK_PRIVATE_ACCESS)))
          .addMethod(
            METHOD_UNLOCK_PRIVATE_ACCESS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.UnlockPrivateAccessRequest,
                org.spin.grpc.util.PrivateAccess>(
                  this, METHODID_UNLOCK_PRIVATE_ACCESS)))
          .addMethod(
            METHOD_LIST_PRINT_FORMATS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListPrintFormatsRequest,
                org.spin.grpc.util.ListPrintFormatsResponse>(
                  this, METHODID_LIST_PRINT_FORMATS)))
          .addMethod(
            METHOD_LIST_REPORT_VIEWS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListReportViewsRequest,
                org.spin.grpc.util.ListReportViewsResponse>(
                  this, METHODID_LIST_REPORT_VIEWS)))
          .addMethod(
            METHOD_LIST_DRILL_TABLES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListDrillTablesRequest,
                org.spin.grpc.util.ListDrillTablesResponse>(
                  this, METHODID_LIST_DRILL_TABLES)))
          .addMethod(
            METHOD_GET_REPORT_OUTPUT,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetReportOutputRequest,
                org.spin.grpc.util.ReportOutput>(
                  this, METHODID_GET_REPORT_OUTPUT)))
          .addMethod(
            METHOD_CREATE_CHAT_ENTRY,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.CreateChatEntryRequest,
                org.spin.grpc.util.ChatEntry>(
                  this, METHODID_CREATE_CHAT_ENTRY)))
          .addMethod(
            METHOD_GET_RESOURCE,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.spin.grpc.util.GetResourceRequest,
                org.spin.grpc.util.Resource>(
                  this, METHODID_GET_RESOURCE)))
          .addMethod(
            METHOD_GET_RESOURCE_REFERENCE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetResourceReferenceRequest,
                org.spin.grpc.util.ResourceReference>(
                  this, METHODID_GET_RESOURCE_REFERENCE)))
          .addMethod(
            METHOD_GET_ATTACHMENT,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetAttachmentRequest,
                org.spin.grpc.util.Attachment>(
                  this, METHODID_GET_ATTACHMENT)))
          .build();
    }
  }

  /**
   * <pre>
   *	User Interface
   * </pre>
   */
  public static final class UserInterfaceStub extends io.grpc.stub.AbstractStub<UserInterfaceStub> {
    private UserInterfaceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInterfaceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInterfaceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInterfaceStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Rollback Entity Request
     * </pre>
     */
    public void rollbackEntity(org.spin.grpc.util.RollbackEntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK_ENTITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run a Callout
     * </pre>
     */
    public void runCallout(org.spin.grpc.util.RunCalloutRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Callout> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RUN_CALLOUT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Translations List
     * </pre>
     */
    public void listTranslations(org.spin.grpc.util.ListTranslationsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListTranslationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSLATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Default Value
     * </pre>
     */
    public void getDefaultValue(org.spin.grpc.util.GetDefaultValueRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEFAULT_VALUE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Lookup Item
     * </pre>
     */
    public void getLookupItem(org.spin.grpc.util.GetLookupItemRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.LookupItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_LOOKUP_ITEM, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Lookup Item
     * </pre>
     */
    public void listLookupItems(org.spin.grpc.util.ListLookupItemsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListLookupItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_LOOKUP_ITEMS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Browser Data
     * </pre>
     */
    public void listBrowserItems(org.spin.grpc.util.ListBrowserItemsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListBrowserItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BROWSER_ITEMS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List a References
     * </pre>
     */
    public void listReferences(org.spin.grpc.util.ListReferencesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListReferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_REFERENCES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get context Info
     * </pre>
     */
    public void getContextInfoValue(org.spin.grpc.util.GetContextInfoValueRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ContextInfoValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CONTEXT_INFO_VALUE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Private Access
     * </pre>
     */
    public void getPrivateAccess(org.spin.grpc.util.GetPrivateAccessRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRIVATE_ACCESS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create Private Access
     * </pre>
     */
    public void lockPrivateAccess(org.spin.grpc.util.LockPrivateAccessRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOCK_PRIVATE_ACCESS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Change Private Access
     * </pre>
     */
    public void unlockPrivateAccess(org.spin.grpc.util.UnlockPrivateAccessRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UNLOCK_PRIVATE_ACCESS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Print Format List
     * </pre>
     */
    public void listPrintFormats(org.spin.grpc.util.ListPrintFormatsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPrintFormatsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_PRINT_FORMATS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Report View List
     * </pre>
     */
    public void listReportViews(org.spin.grpc.util.ListReportViewsRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListReportViewsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_REPORT_VIEWS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Drill Tables List
     * </pre>
     */
    public void listDrillTables(org.spin.grpc.util.ListDrillTablesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDrillTablesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DRILL_TABLES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Request Report Output
     * </pre>
     */
    public void getReportOutput(org.spin.grpc.util.GetReportOutputRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ReportOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REPORT_OUTPUT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add Chat Entry
     * </pre>
     */
    public void createChatEntry(org.spin.grpc.util.CreateChatEntryRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ChatEntry> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CHAT_ENTRY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Service for get a resource from resource uuid
     * </pre>
     */
    public void getResource(org.spin.grpc.util.GetResourceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Resource> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_RESOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Service for get a resource reference from image, attachment or archive
     * </pre>
     */
    public void getResourceReference(org.spin.grpc.util.GetResourceReferenceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ResourceReference> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RESOURCE_REFERENCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Service for get a attachment from table and record uuid
     * </pre>
     */
    public void getAttachment(org.spin.grpc.util.GetAttachmentRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Attachment> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ATTACHMENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *	User Interface
   * </pre>
   */
  public static final class UserInterfaceBlockingStub extends io.grpc.stub.AbstractStub<UserInterfaceBlockingStub> {
    private UserInterfaceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInterfaceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInterfaceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInterfaceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Rollback Entity Request
     * </pre>
     */
    public org.spin.grpc.util.Entity rollbackEntity(org.spin.grpc.util.RollbackEntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ROLLBACK_ENTITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a Callout
     * </pre>
     */
    public org.spin.grpc.util.Callout runCallout(org.spin.grpc.util.RunCalloutRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RUN_CALLOUT, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Translations List
     * </pre>
     */
    public org.spin.grpc.util.ListTranslationsResponse listTranslations(org.spin.grpc.util.ListTranslationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TRANSLATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Default Value
     * </pre>
     */
    public org.spin.grpc.util.Value getDefaultValue(org.spin.grpc.util.GetDefaultValueRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEFAULT_VALUE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Lookup Item
     * </pre>
     */
    public org.spin.grpc.util.LookupItem getLookupItem(org.spin.grpc.util.GetLookupItemRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_LOOKUP_ITEM, getCallOptions(), request);
    }

    /**
     * <pre>
     * List Lookup Item
     * </pre>
     */
    public org.spin.grpc.util.ListLookupItemsResponse listLookupItems(org.spin.grpc.util.ListLookupItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_LOOKUP_ITEMS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Browser Data
     * </pre>
     */
    public org.spin.grpc.util.ListBrowserItemsResponse listBrowserItems(org.spin.grpc.util.ListBrowserItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BROWSER_ITEMS, getCallOptions(), request);
    }

    /**
     * <pre>
     * List a References
     * </pre>
     */
    public org.spin.grpc.util.ListReferencesResponse listReferences(org.spin.grpc.util.ListReferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_REFERENCES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Get context Info
     * </pre>
     */
    public org.spin.grpc.util.ContextInfoValue getContextInfoValue(org.spin.grpc.util.GetContextInfoValueRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CONTEXT_INFO_VALUE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Private Access
     * </pre>
     */
    public org.spin.grpc.util.PrivateAccess getPrivateAccess(org.spin.grpc.util.GetPrivateAccessRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRIVATE_ACCESS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create Private Access
     * </pre>
     */
    public org.spin.grpc.util.PrivateAccess lockPrivateAccess(org.spin.grpc.util.LockPrivateAccessRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOCK_PRIVATE_ACCESS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Change Private Access
     * </pre>
     */
    public org.spin.grpc.util.PrivateAccess unlockPrivateAccess(org.spin.grpc.util.UnlockPrivateAccessRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UNLOCK_PRIVATE_ACCESS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Print Format List
     * </pre>
     */
    public org.spin.grpc.util.ListPrintFormatsResponse listPrintFormats(org.spin.grpc.util.ListPrintFormatsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_PRINT_FORMATS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Report View List
     * </pre>
     */
    public org.spin.grpc.util.ListReportViewsResponse listReportViews(org.spin.grpc.util.ListReportViewsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_REPORT_VIEWS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Drill Tables List
     * </pre>
     */
    public org.spin.grpc.util.ListDrillTablesResponse listDrillTables(org.spin.grpc.util.ListDrillTablesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DRILL_TABLES, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Request Report Output
     * </pre>
     */
    public org.spin.grpc.util.ReportOutput getReportOutput(org.spin.grpc.util.GetReportOutputRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REPORT_OUTPUT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Add Chat Entry
     * </pre>
     */
    public org.spin.grpc.util.ChatEntry createChatEntry(org.spin.grpc.util.CreateChatEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CHAT_ENTRY, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Service for get a resource from resource uuid
     * </pre>
     */
    public java.util.Iterator<org.spin.grpc.util.Resource> getResource(
        org.spin.grpc.util.GetResourceRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_RESOURCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Service for get a resource reference from image, attachment or archive
     * </pre>
     */
    public org.spin.grpc.util.ResourceReference getResourceReference(org.spin.grpc.util.GetResourceReferenceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RESOURCE_REFERENCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Service for get a attachment from table and record uuid
     * </pre>
     */
    public org.spin.grpc.util.Attachment getAttachment(org.spin.grpc.util.GetAttachmentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ATTACHMENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *	User Interface
   * </pre>
   */
  public static final class UserInterfaceFutureStub extends io.grpc.stub.AbstractStub<UserInterfaceFutureStub> {
    private UserInterfaceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInterfaceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInterfaceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInterfaceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Rollback Entity Request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Entity> rollbackEntity(
        org.spin.grpc.util.RollbackEntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK_ENTITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Run a Callout
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Callout> runCallout(
        org.spin.grpc.util.RunCalloutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RUN_CALLOUT, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Translations List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListTranslationsResponse> listTranslations(
        org.spin.grpc.util.ListTranslationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSLATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Default Value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Value> getDefaultValue(
        org.spin.grpc.util.GetDefaultValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEFAULT_VALUE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Lookup Item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.LookupItem> getLookupItem(
        org.spin.grpc.util.GetLookupItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_LOOKUP_ITEM, getCallOptions()), request);
    }

    /**
     * <pre>
     * List Lookup Item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListLookupItemsResponse> listLookupItems(
        org.spin.grpc.util.ListLookupItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_LOOKUP_ITEMS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Browser Data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListBrowserItemsResponse> listBrowserItems(
        org.spin.grpc.util.ListBrowserItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BROWSER_ITEMS, getCallOptions()), request);
    }

    /**
     * <pre>
     * List a References
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListReferencesResponse> listReferences(
        org.spin.grpc.util.ListReferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_REFERENCES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Get context Info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ContextInfoValue> getContextInfoValue(
        org.spin.grpc.util.GetContextInfoValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CONTEXT_INFO_VALUE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Private Access
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.PrivateAccess> getPrivateAccess(
        org.spin.grpc.util.GetPrivateAccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRIVATE_ACCESS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create Private Access
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.PrivateAccess> lockPrivateAccess(
        org.spin.grpc.util.LockPrivateAccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOCK_PRIVATE_ACCESS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Change Private Access
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.PrivateAccess> unlockPrivateAccess(
        org.spin.grpc.util.UnlockPrivateAccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UNLOCK_PRIVATE_ACCESS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Print Format List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListPrintFormatsResponse> listPrintFormats(
        org.spin.grpc.util.ListPrintFormatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_PRINT_FORMATS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Report View List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListReportViewsResponse> listReportViews(
        org.spin.grpc.util.ListReportViewsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_REPORT_VIEWS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Drill Tables List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListDrillTablesResponse> listDrillTables(
        org.spin.grpc.util.ListDrillTablesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DRILL_TABLES, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Request Report Output
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ReportOutput> getReportOutput(
        org.spin.grpc.util.GetReportOutputRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REPORT_OUTPUT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Add Chat Entry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ChatEntry> createChatEntry(
        org.spin.grpc.util.CreateChatEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CHAT_ENTRY, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Service for get a resource reference from image, attachment or archive
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ResourceReference> getResourceReference(
        org.spin.grpc.util.GetResourceReferenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RESOURCE_REFERENCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Service for get a attachment from table and record uuid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Attachment> getAttachment(
        org.spin.grpc.util.GetAttachmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ATTACHMENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_ROLLBACK_ENTITY = 0;
  private static final int METHODID_RUN_CALLOUT = 1;
  private static final int METHODID_LIST_TRANSLATIONS = 2;
  private static final int METHODID_GET_DEFAULT_VALUE = 3;
  private static final int METHODID_GET_LOOKUP_ITEM = 4;
  private static final int METHODID_LIST_LOOKUP_ITEMS = 5;
  private static final int METHODID_LIST_BROWSER_ITEMS = 6;
  private static final int METHODID_LIST_REFERENCES = 7;
  private static final int METHODID_GET_CONTEXT_INFO_VALUE = 8;
  private static final int METHODID_GET_PRIVATE_ACCESS = 9;
  private static final int METHODID_LOCK_PRIVATE_ACCESS = 10;
  private static final int METHODID_UNLOCK_PRIVATE_ACCESS = 11;
  private static final int METHODID_LIST_PRINT_FORMATS = 12;
  private static final int METHODID_LIST_REPORT_VIEWS = 13;
  private static final int METHODID_LIST_DRILL_TABLES = 14;
  private static final int METHODID_GET_REPORT_OUTPUT = 15;
  private static final int METHODID_CREATE_CHAT_ENTRY = 16;
  private static final int METHODID_GET_RESOURCE = 17;
  private static final int METHODID_GET_RESOURCE_REFERENCE = 18;
  private static final int METHODID_GET_ATTACHMENT = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserInterfaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserInterfaceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROLLBACK_ENTITY:
          serviceImpl.rollbackEntity((org.spin.grpc.util.RollbackEntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Entity>) responseObserver);
          break;
        case METHODID_RUN_CALLOUT:
          serviceImpl.runCallout((org.spin.grpc.util.RunCalloutRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Callout>) responseObserver);
          break;
        case METHODID_LIST_TRANSLATIONS:
          serviceImpl.listTranslations((org.spin.grpc.util.ListTranslationsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListTranslationsResponse>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_VALUE:
          serviceImpl.getDefaultValue((org.spin.grpc.util.GetDefaultValueRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Value>) responseObserver);
          break;
        case METHODID_GET_LOOKUP_ITEM:
          serviceImpl.getLookupItem((org.spin.grpc.util.GetLookupItemRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.LookupItem>) responseObserver);
          break;
        case METHODID_LIST_LOOKUP_ITEMS:
          serviceImpl.listLookupItems((org.spin.grpc.util.ListLookupItemsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListLookupItemsResponse>) responseObserver);
          break;
        case METHODID_LIST_BROWSER_ITEMS:
          serviceImpl.listBrowserItems((org.spin.grpc.util.ListBrowserItemsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListBrowserItemsResponse>) responseObserver);
          break;
        case METHODID_LIST_REFERENCES:
          serviceImpl.listReferences((org.spin.grpc.util.ListReferencesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListReferencesResponse>) responseObserver);
          break;
        case METHODID_GET_CONTEXT_INFO_VALUE:
          serviceImpl.getContextInfoValue((org.spin.grpc.util.GetContextInfoValueRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ContextInfoValue>) responseObserver);
          break;
        case METHODID_GET_PRIVATE_ACCESS:
          serviceImpl.getPrivateAccess((org.spin.grpc.util.GetPrivateAccessRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess>) responseObserver);
          break;
        case METHODID_LOCK_PRIVATE_ACCESS:
          serviceImpl.lockPrivateAccess((org.spin.grpc.util.LockPrivateAccessRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess>) responseObserver);
          break;
        case METHODID_UNLOCK_PRIVATE_ACCESS:
          serviceImpl.unlockPrivateAccess((org.spin.grpc.util.UnlockPrivateAccessRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.PrivateAccess>) responseObserver);
          break;
        case METHODID_LIST_PRINT_FORMATS:
          serviceImpl.listPrintFormats((org.spin.grpc.util.ListPrintFormatsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPrintFormatsResponse>) responseObserver);
          break;
        case METHODID_LIST_REPORT_VIEWS:
          serviceImpl.listReportViews((org.spin.grpc.util.ListReportViewsRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListReportViewsResponse>) responseObserver);
          break;
        case METHODID_LIST_DRILL_TABLES:
          serviceImpl.listDrillTables((org.spin.grpc.util.ListDrillTablesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListDrillTablesResponse>) responseObserver);
          break;
        case METHODID_GET_REPORT_OUTPUT:
          serviceImpl.getReportOutput((org.spin.grpc.util.GetReportOutputRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ReportOutput>) responseObserver);
          break;
        case METHODID_CREATE_CHAT_ENTRY:
          serviceImpl.createChatEntry((org.spin.grpc.util.CreateChatEntryRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ChatEntry>) responseObserver);
          break;
        case METHODID_GET_RESOURCE:
          serviceImpl.getResource((org.spin.grpc.util.GetResourceRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Resource>) responseObserver);
          break;
        case METHODID_GET_RESOURCE_REFERENCE:
          serviceImpl.getResourceReference((org.spin.grpc.util.GetResourceReferenceRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ResourceReference>) responseObserver);
          break;
        case METHODID_GET_ATTACHMENT:
          serviceImpl.getAttachment((org.spin.grpc.util.GetAttachmentRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Attachment>) responseObserver);
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

  private static final class UserInterfaceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempiereData.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserInterfaceDescriptorSupplier())
              .addMethod(METHOD_ROLLBACK_ENTITY)
              .addMethod(METHOD_RUN_CALLOUT)
              .addMethod(METHOD_LIST_TRANSLATIONS)
              .addMethod(METHOD_GET_DEFAULT_VALUE)
              .addMethod(METHOD_GET_LOOKUP_ITEM)
              .addMethod(METHOD_LIST_LOOKUP_ITEMS)
              .addMethod(METHOD_LIST_BROWSER_ITEMS)
              .addMethod(METHOD_LIST_REFERENCES)
              .addMethod(METHOD_GET_CONTEXT_INFO_VALUE)
              .addMethod(METHOD_GET_PRIVATE_ACCESS)
              .addMethod(METHOD_LOCK_PRIVATE_ACCESS)
              .addMethod(METHOD_UNLOCK_PRIVATE_ACCESS)
              .addMethod(METHOD_LIST_PRINT_FORMATS)
              .addMethod(METHOD_LIST_REPORT_VIEWS)
              .addMethod(METHOD_LIST_DRILL_TABLES)
              .addMethod(METHOD_GET_REPORT_OUTPUT)
              .addMethod(METHOD_CREATE_CHAT_ENTRY)
              .addMethod(METHOD_GET_RESOURCE)
              .addMethod(METHOD_GET_RESOURCE_REFERENCE)
              .addMethod(METHOD_GET_ATTACHMENT)
              .build();
        }
      }
    }
    return result;
  }
}
