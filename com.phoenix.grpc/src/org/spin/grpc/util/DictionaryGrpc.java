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
    comments = "Source: dictionary.proto")
public final class DictionaryGrpc {

  private DictionaryGrpc() {}

  public static final String SERVICE_NAME = "dictionary.Dictionary";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.EntityRequest,
      org.spin.grpc.util.Window> METHOD_GET_WINDOW =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.EntityRequest, org.spin.grpc.util.Window>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetWindow"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.EntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Window.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.EntityRequest,
      org.spin.grpc.util.Window> METHOD_GET_WINDOW_AND_TABS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.EntityRequest, org.spin.grpc.util.Window>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetWindowAndTabs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.EntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Window.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.EntityRequest,
      org.spin.grpc.util.Tab> METHOD_GET_TAB =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.EntityRequest, org.spin.grpc.util.Tab>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetTab"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.EntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Tab.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.EntityRequest,
      org.spin.grpc.util.Tab> METHOD_GET_TAB_AND_FIELDS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.EntityRequest, org.spin.grpc.util.Tab>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetTabAndFields"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.EntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Tab.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.FieldRequest,
      org.spin.grpc.util.Field> METHOD_GET_FIELD =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.FieldRequest, org.spin.grpc.util.Field>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetField"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.FieldRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Field.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ReferenceRequest,
      org.spin.grpc.util.Reference> METHOD_GET_REFERENCE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ReferenceRequest, org.spin.grpc.util.Reference>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetReference"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ReferenceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Reference.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ValidationRuleRequest,
      org.spin.grpc.util.ValidationRule> METHOD_GET_VALIDATION_RULE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ValidationRuleRequest, org.spin.grpc.util.ValidationRule>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetValidationRule"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ValidationRuleRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ValidationRule.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.EntityRequest,
      org.spin.grpc.util.Process> METHOD_GET_PROCESS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.EntityRequest, org.spin.grpc.util.Process>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetProcess"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.EntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Process.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.EntityRequest,
      org.spin.grpc.util.Browser> METHOD_GET_BROWSER =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.EntityRequest, org.spin.grpc.util.Browser>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetBrowser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.EntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Browser.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.EntityRequest,
      org.spin.grpc.util.Form> METHOD_GET_FORM =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.EntityRequest, org.spin.grpc.util.Form>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dictionary.Dictionary", "GetForm"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.EntityRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Form.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DictionaryStub newStub(io.grpc.Channel channel) {
    return new DictionaryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DictionaryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DictionaryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DictionaryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DictionaryFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class DictionaryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Request a Window
     * </pre>
     */
    public void getWindow(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Window> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_WINDOW, responseObserver);
    }

    /**
     * <pre>
     * Request Window and tabs
     * </pre>
     */
    public void getWindowAndTabs(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Window> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_WINDOW_AND_TABS, responseObserver);
    }

    /**
     * <pre>
     * Request a Tab
     * </pre>
     */
    public void getTab(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Tab> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TAB, responseObserver);
    }

    /**
     * <pre>
     * Request a Tab and Fields
     * </pre>
     */
    public void getTabAndFields(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Tab> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TAB_AND_FIELDS, responseObserver);
    }

    /**
     * <pre>
     * Request a Field
     * </pre>
     */
    public void getField(org.spin.grpc.util.FieldRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Field> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FIELD, responseObserver);
    }

    /**
     * <pre>
     * Reference Request
     * </pre>
     */
    public void getReference(org.spin.grpc.util.ReferenceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Reference> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REFERENCE, responseObserver);
    }

    /**
     * <pre>
     * Reference Request
     * </pre>
     */
    public void getValidationRule(org.spin.grpc.util.ValidationRuleRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ValidationRule> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VALIDATION_RULE, responseObserver);
    }

    /**
     * <pre>
     * Request Process
     * </pre>
     */
    public void getProcess(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Process> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PROCESS, responseObserver);
    }

    /**
     * <pre>
     * Request Browser
     * </pre>
     */
    public void getBrowser(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Browser> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BROWSER, responseObserver);
    }

    /**
     * <pre>
     * Get Form
     * </pre>
     */
    public void getForm(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Form> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FORM, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_WINDOW,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.EntityRequest,
                org.spin.grpc.util.Window>(
                  this, METHODID_GET_WINDOW)))
          .addMethod(
            METHOD_GET_WINDOW_AND_TABS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.EntityRequest,
                org.spin.grpc.util.Window>(
                  this, METHODID_GET_WINDOW_AND_TABS)))
          .addMethod(
            METHOD_GET_TAB,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.EntityRequest,
                org.spin.grpc.util.Tab>(
                  this, METHODID_GET_TAB)))
          .addMethod(
            METHOD_GET_TAB_AND_FIELDS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.EntityRequest,
                org.spin.grpc.util.Tab>(
                  this, METHODID_GET_TAB_AND_FIELDS)))
          .addMethod(
            METHOD_GET_FIELD,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.FieldRequest,
                org.spin.grpc.util.Field>(
                  this, METHODID_GET_FIELD)))
          .addMethod(
            METHOD_GET_REFERENCE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ReferenceRequest,
                org.spin.grpc.util.Reference>(
                  this, METHODID_GET_REFERENCE)))
          .addMethod(
            METHOD_GET_VALIDATION_RULE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ValidationRuleRequest,
                org.spin.grpc.util.ValidationRule>(
                  this, METHODID_GET_VALIDATION_RULE)))
          .addMethod(
            METHOD_GET_PROCESS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.EntityRequest,
                org.spin.grpc.util.Process>(
                  this, METHODID_GET_PROCESS)))
          .addMethod(
            METHOD_GET_BROWSER,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.EntityRequest,
                org.spin.grpc.util.Browser>(
                  this, METHODID_GET_BROWSER)))
          .addMethod(
            METHOD_GET_FORM,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.EntityRequest,
                org.spin.grpc.util.Form>(
                  this, METHODID_GET_FORM)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DictionaryStub extends io.grpc.stub.AbstractStub<DictionaryStub> {
    private DictionaryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DictionaryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DictionaryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DictionaryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request a Window
     * </pre>
     */
    public void getWindow(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Window> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_WINDOW, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request Window and tabs
     * </pre>
     */
    public void getWindowAndTabs(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Window> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_WINDOW_AND_TABS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a Tab
     * </pre>
     */
    public void getTab(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Tab> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TAB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a Tab and Fields
     * </pre>
     */
    public void getTabAndFields(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Tab> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TAB_AND_FIELDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a Field
     * </pre>
     */
    public void getField(org.spin.grpc.util.FieldRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Field> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FIELD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reference Request
     * </pre>
     */
    public void getReference(org.spin.grpc.util.ReferenceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Reference> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reference Request
     * </pre>
     */
    public void getValidationRule(org.spin.grpc.util.ValidationRuleRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ValidationRule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VALIDATION_RULE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request Process
     * </pre>
     */
    public void getProcess(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Process> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PROCESS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request Browser
     * </pre>
     */
    public void getBrowser(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Browser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BROWSER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Form
     * </pre>
     */
    public void getForm(org.spin.grpc.util.EntityRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Form> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FORM, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DictionaryBlockingStub extends io.grpc.stub.AbstractStub<DictionaryBlockingStub> {
    private DictionaryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DictionaryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DictionaryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DictionaryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request a Window
     * </pre>
     */
    public org.spin.grpc.util.Window getWindow(org.spin.grpc.util.EntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_WINDOW, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request Window and tabs
     * </pre>
     */
    public org.spin.grpc.util.Window getWindowAndTabs(org.spin.grpc.util.EntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_WINDOW_AND_TABS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a Tab
     * </pre>
     */
    public org.spin.grpc.util.Tab getTab(org.spin.grpc.util.EntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TAB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a Tab and Fields
     * </pre>
     */
    public org.spin.grpc.util.Tab getTabAndFields(org.spin.grpc.util.EntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TAB_AND_FIELDS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a Field
     * </pre>
     */
    public org.spin.grpc.util.Field getField(org.spin.grpc.util.FieldRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FIELD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Reference Request
     * </pre>
     */
    public org.spin.grpc.util.Reference getReference(org.spin.grpc.util.ReferenceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REFERENCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Reference Request
     * </pre>
     */
    public org.spin.grpc.util.ValidationRule getValidationRule(org.spin.grpc.util.ValidationRuleRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VALIDATION_RULE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request Process
     * </pre>
     */
    public org.spin.grpc.util.Process getProcess(org.spin.grpc.util.EntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PROCESS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request Browser
     * </pre>
     */
    public org.spin.grpc.util.Browser getBrowser(org.spin.grpc.util.EntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BROWSER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Form
     * </pre>
     */
    public org.spin.grpc.util.Form getForm(org.spin.grpc.util.EntityRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FORM, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DictionaryFutureStub extends io.grpc.stub.AbstractStub<DictionaryFutureStub> {
    private DictionaryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DictionaryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DictionaryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DictionaryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request a Window
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Window> getWindow(
        org.spin.grpc.util.EntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_WINDOW, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request Window and tabs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Window> getWindowAndTabs(
        org.spin.grpc.util.EntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_WINDOW_AND_TABS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a Tab
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Tab> getTab(
        org.spin.grpc.util.EntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TAB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a Tab and Fields
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Tab> getTabAndFields(
        org.spin.grpc.util.EntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TAB_AND_FIELDS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a Field
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Field> getField(
        org.spin.grpc.util.FieldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FIELD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Reference Request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Reference> getReference(
        org.spin.grpc.util.ReferenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Reference Request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ValidationRule> getValidationRule(
        org.spin.grpc.util.ValidationRuleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VALIDATION_RULE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request Process
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Process> getProcess(
        org.spin.grpc.util.EntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PROCESS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request Browser
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Browser> getBrowser(
        org.spin.grpc.util.EntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BROWSER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Form
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Form> getForm(
        org.spin.grpc.util.EntityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FORM, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WINDOW = 0;
  private static final int METHODID_GET_WINDOW_AND_TABS = 1;
  private static final int METHODID_GET_TAB = 2;
  private static final int METHODID_GET_TAB_AND_FIELDS = 3;
  private static final int METHODID_GET_FIELD = 4;
  private static final int METHODID_GET_REFERENCE = 5;
  private static final int METHODID_GET_VALIDATION_RULE = 6;
  private static final int METHODID_GET_PROCESS = 7;
  private static final int METHODID_GET_BROWSER = 8;
  private static final int METHODID_GET_FORM = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DictionaryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DictionaryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WINDOW:
          serviceImpl.getWindow((org.spin.grpc.util.EntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Window>) responseObserver);
          break;
        case METHODID_GET_WINDOW_AND_TABS:
          serviceImpl.getWindowAndTabs((org.spin.grpc.util.EntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Window>) responseObserver);
          break;
        case METHODID_GET_TAB:
          serviceImpl.getTab((org.spin.grpc.util.EntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Tab>) responseObserver);
          break;
        case METHODID_GET_TAB_AND_FIELDS:
          serviceImpl.getTabAndFields((org.spin.grpc.util.EntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Tab>) responseObserver);
          break;
        case METHODID_GET_FIELD:
          serviceImpl.getField((org.spin.grpc.util.FieldRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Field>) responseObserver);
          break;
        case METHODID_GET_REFERENCE:
          serviceImpl.getReference((org.spin.grpc.util.ReferenceRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Reference>) responseObserver);
          break;
        case METHODID_GET_VALIDATION_RULE:
          serviceImpl.getValidationRule((org.spin.grpc.util.ValidationRuleRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ValidationRule>) responseObserver);
          break;
        case METHODID_GET_PROCESS:
          serviceImpl.getProcess((org.spin.grpc.util.EntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Process>) responseObserver);
          break;
        case METHODID_GET_BROWSER:
          serviceImpl.getBrowser((org.spin.grpc.util.EntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Browser>) responseObserver);
          break;
        case METHODID_GET_FORM:
          serviceImpl.getForm((org.spin.grpc.util.EntityRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Form>) responseObserver);
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

  private static final class DictionaryDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempiereDictionary.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DictionaryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DictionaryDescriptorSupplier())
              .addMethod(METHOD_GET_WINDOW)
              .addMethod(METHOD_GET_WINDOW_AND_TABS)
              .addMethod(METHOD_GET_TAB)
              .addMethod(METHOD_GET_TAB_AND_FIELDS)
              .addMethod(METHOD_GET_FIELD)
              .addMethod(METHOD_GET_REFERENCE)
              .addMethod(METHOD_GET_VALIDATION_RULE)
              .addMethod(METHOD_GET_PROCESS)
              .addMethod(METHOD_GET_BROWSER)
              .addMethod(METHOD_GET_FORM)
              .build();
        }
      }
    }
    return result;
  }
}
