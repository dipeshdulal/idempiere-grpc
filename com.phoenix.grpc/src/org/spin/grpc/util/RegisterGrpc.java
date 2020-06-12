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
    comments = "Source: enrollment.proto")
public final class RegisterGrpc {

  private RegisterGrpc() {}

  public static final String SERVICE_NAME = "enrollment.Register";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.EnrollUserRequest,
      org.spin.grpc.util.User> METHOD_ENROLL_USER =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.EnrollUserRequest, org.spin.grpc.util.User>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "enrollment.Register", "EnrollUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.EnrollUserRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.User.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ResetPasswordRequest,
      org.spin.grpc.util.ResetPasswordResponse> METHOD_RESET_PASSWORD =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ResetPasswordRequest, org.spin.grpc.util.ResetPasswordResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "enrollment.Register", "ResetPassword"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ResetPasswordRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ResetPasswordResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ResetPasswordTokenRequest,
      org.spin.grpc.util.ResetPasswordResponse> METHOD_RESET_PASSWORD_FROM_TOKEN =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ResetPasswordTokenRequest, org.spin.grpc.util.ResetPasswordResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "enrollment.Register", "ResetPasswordFromToken"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ResetPasswordTokenRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ResetPasswordResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ActivateUserRequest,
      org.spin.grpc.util.ActivateUserResponse> METHOD_ACTIVATE_USER =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ActivateUserRequest, org.spin.grpc.util.ActivateUserResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "enrollment.Register", "ActivateUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ActivateUserRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ActivateUserResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegisterStub newStub(io.grpc.Channel channel) {
    return new RegisterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegisterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegisterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegisterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegisterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class RegisterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Request enroll User
     * </pre>
     */
    public void enrollUser(org.spin.grpc.util.EnrollUserRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.User> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ENROLL_USER, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void resetPassword(org.spin.grpc.util.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ResetPasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESET_PASSWORD, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void resetPasswordFromToken(org.spin.grpc.util.ResetPasswordTokenRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ResetPasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESET_PASSWORD_FROM_TOKEN, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void activateUser(org.spin.grpc.util.ActivateUserRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ActivateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE_USER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ENROLL_USER,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.EnrollUserRequest,
                org.spin.grpc.util.User>(
                  this, METHODID_ENROLL_USER)))
          .addMethod(
            METHOD_RESET_PASSWORD,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ResetPasswordRequest,
                org.spin.grpc.util.ResetPasswordResponse>(
                  this, METHODID_RESET_PASSWORD)))
          .addMethod(
            METHOD_RESET_PASSWORD_FROM_TOKEN,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ResetPasswordTokenRequest,
                org.spin.grpc.util.ResetPasswordResponse>(
                  this, METHODID_RESET_PASSWORD_FROM_TOKEN)))
          .addMethod(
            METHOD_ACTIVATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ActivateUserRequest,
                org.spin.grpc.util.ActivateUserResponse>(
                  this, METHODID_ACTIVATE_USER)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RegisterStub extends io.grpc.stub.AbstractStub<RegisterStub> {
    private RegisterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request enroll User
     * </pre>
     */
    public void enrollUser(org.spin.grpc.util.EnrollUserRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ENROLL_USER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void resetPassword(org.spin.grpc.util.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ResetPasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESET_PASSWORD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void resetPasswordFromToken(org.spin.grpc.util.ResetPasswordTokenRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ResetPasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESET_PASSWORD_FROM_TOKEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public void activateUser(org.spin.grpc.util.ActivateUserRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ActivateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE_USER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RegisterBlockingStub extends io.grpc.stub.AbstractStub<RegisterBlockingStub> {
    private RegisterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request enroll User
     * </pre>
     */
    public org.spin.grpc.util.User enrollUser(org.spin.grpc.util.EnrollUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ENROLL_USER, getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public org.spin.grpc.util.ResetPasswordResponse resetPassword(org.spin.grpc.util.ResetPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESET_PASSWORD, getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public org.spin.grpc.util.ResetPasswordResponse resetPasswordFromToken(org.spin.grpc.util.ResetPasswordTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESET_PASSWORD_FROM_TOKEN, getCallOptions(), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public org.spin.grpc.util.ActivateUserResponse activateUser(org.spin.grpc.util.ActivateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE_USER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RegisterFutureStub extends io.grpc.stub.AbstractStub<RegisterFutureStub> {
    private RegisterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request enroll User
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.User> enrollUser(
        org.spin.grpc.util.EnrollUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ENROLL_USER, getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ResetPasswordResponse> resetPassword(
        org.spin.grpc.util.ResetPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESET_PASSWORD, getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ResetPasswordResponse> resetPasswordFromToken(
        org.spin.grpc.util.ResetPasswordTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESET_PASSWORD_FROM_TOKEN, getCallOptions()), request);
    }

    /**
     * <pre>
     * 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ActivateUserResponse> activateUser(
        org.spin.grpc.util.ActivateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE_USER, getCallOptions()), request);
    }
  }

  private static final int METHODID_ENROLL_USER = 0;
  private static final int METHODID_RESET_PASSWORD = 1;
  private static final int METHODID_RESET_PASSWORD_FROM_TOKEN = 2;
  private static final int METHODID_ACTIVATE_USER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegisterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegisterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENROLL_USER:
          serviceImpl.enrollUser((org.spin.grpc.util.EnrollUserRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.User>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((org.spin.grpc.util.ResetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ResetPasswordResponse>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD_FROM_TOKEN:
          serviceImpl.resetPasswordFromToken((org.spin.grpc.util.ResetPasswordTokenRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ResetPasswordResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_USER:
          serviceImpl.activateUser((org.spin.grpc.util.ActivateUserRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ActivateUserResponse>) responseObserver);
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

  private static final class RegisterDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.Enrollment.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RegisterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegisterDescriptorSupplier())
              .addMethod(METHOD_ENROLL_USER)
              .addMethod(METHOD_RESET_PASSWORD)
              .addMethod(METHOD_RESET_PASSWORD_FROM_TOKEN)
              .addMethod(METHOD_ACTIVATE_USER)
              .build();
        }
      }
    }
    return result;
  }
}
