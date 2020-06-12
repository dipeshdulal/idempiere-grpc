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
    comments = "Source: access.proto")
public final class SecurityGrpc {

  private SecurityGrpc() {}

  public static final String SERVICE_NAME = "access.Security";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.LoginRequest,
      org.spin.grpc.util.UserInfoValue> METHOD_GET_USER_INFO =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.LoginRequest, org.spin.grpc.util.UserInfoValue>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "access.Security", "GetUserInfo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.LoginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.UserInfoValue.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.LoginRequest,
      org.spin.grpc.util.Session> METHOD_RUN_LOGIN =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.LoginRequest, org.spin.grpc.util.Session>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "access.Security", "RunLogin"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.LoginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Session.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.LoginRequest,
      org.spin.grpc.util.Session> METHOD_RUN_LOGIN_DEFAULT =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.LoginRequest, org.spin.grpc.util.Session>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "access.Security", "RunLoginDefault"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.LoginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Session.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.LogoutRequest,
      org.spin.grpc.util.Session> METHOD_RUN_LOGOUT =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.LogoutRequest, org.spin.grpc.util.Session>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "access.Security", "RunLogout"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.LogoutRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Session.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.UserInfoRequest,
      org.spin.grpc.util.UserInfoValue> METHOD_GET_USER_INFO_FROM_SESSION =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.UserInfoRequest, org.spin.grpc.util.UserInfoValue>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "access.Security", "GetUserInfoFromSession"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.UserInfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.UserInfoValue.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.UserInfoRequest,
      org.spin.grpc.util.Menu> METHOD_GET_MENU_AND_CHILD =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.UserInfoRequest, org.spin.grpc.util.Menu>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "access.Security", "GetMenuAndChild"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.UserInfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Menu.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.UserInfoRequest,
      org.spin.grpc.util.Session> METHOD_RUN_CHANGE_ROLE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.UserInfoRequest, org.spin.grpc.util.Session>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "access.Security", "RunChangeRole"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.UserInfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Session.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.SessionRequest,
      org.spin.grpc.util.Session> METHOD_GET_SESSION =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.SessionRequest, org.spin.grpc.util.Session>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "access.Security", "GetSession"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.SessionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Session.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityStub newStub(io.grpc.Channel channel) {
    return new SecurityStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecurityBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecurityFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class SecurityImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Request user roles
     * </pre>
     */
    public void getUserInfo(org.spin.grpc.util.LoginRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.UserInfoValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_INFO, responseObserver);
    }

    /**
     * <pre>
     * Request login from user
     * </pre>
     */
    public void runLogin(org.spin.grpc.util.LoginRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_LOGIN, responseObserver);
    }

    /**
     * <pre>
     * Request login and role
     * </pre>
     */
    public void runLoginDefault(org.spin.grpc.util.LoginRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_LOGIN_DEFAULT, responseObserver);
    }

    /**
     * <pre>
     * Request a Role from uuid
     * </pre>
     */
    public void runLogout(org.spin.grpc.util.LogoutRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_LOGOUT, responseObserver);
    }

    /**
     * <pre>
     * Request user roles from Session
     * </pre>
     */
    public void getUserInfoFromSession(org.spin.grpc.util.UserInfoRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.UserInfoValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_INFO_FROM_SESSION, responseObserver);
    }

    /**
     * <pre>
     * Request Menu from Parent UUID
     * </pre>
     */
    public void getMenuAndChild(org.spin.grpc.util.UserInfoRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Menu> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MENU_AND_CHILD, responseObserver);
    }

    /**
     * <pre>
     * Request change role
     * </pre>
     */
    public void runChangeRole(org.spin.grpc.util.UserInfoRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_CHANGE_ROLE, responseObserver);
    }

    /**
     * <pre>
     * Request session
     * </pre>
     */
    public void getSession(org.spin.grpc.util.SessionRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SESSION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_USER_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.LoginRequest,
                org.spin.grpc.util.UserInfoValue>(
                  this, METHODID_GET_USER_INFO)))
          .addMethod(
            METHOD_RUN_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.LoginRequest,
                org.spin.grpc.util.Session>(
                  this, METHODID_RUN_LOGIN)))
          .addMethod(
            METHOD_RUN_LOGIN_DEFAULT,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.LoginRequest,
                org.spin.grpc.util.Session>(
                  this, METHODID_RUN_LOGIN_DEFAULT)))
          .addMethod(
            METHOD_RUN_LOGOUT,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.LogoutRequest,
                org.spin.grpc.util.Session>(
                  this, METHODID_RUN_LOGOUT)))
          .addMethod(
            METHOD_GET_USER_INFO_FROM_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.UserInfoRequest,
                org.spin.grpc.util.UserInfoValue>(
                  this, METHODID_GET_USER_INFO_FROM_SESSION)))
          .addMethod(
            METHOD_GET_MENU_AND_CHILD,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.UserInfoRequest,
                org.spin.grpc.util.Menu>(
                  this, METHODID_GET_MENU_AND_CHILD)))
          .addMethod(
            METHOD_RUN_CHANGE_ROLE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.UserInfoRequest,
                org.spin.grpc.util.Session>(
                  this, METHODID_RUN_CHANGE_ROLE)))
          .addMethod(
            METHOD_GET_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.SessionRequest,
                org.spin.grpc.util.Session>(
                  this, METHODID_GET_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class SecurityStub extends io.grpc.stub.AbstractStub<SecurityStub> {
    private SecurityStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request user roles
     * </pre>
     */
    public void getUserInfo(org.spin.grpc.util.LoginRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.UserInfoValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request login from user
     * </pre>
     */
    public void runLogin(org.spin.grpc.util.LoginRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RUN_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request login and role
     * </pre>
     */
    public void runLoginDefault(org.spin.grpc.util.LoginRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RUN_LOGIN_DEFAULT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a Role from uuid
     * </pre>
     */
    public void runLogout(org.spin.grpc.util.LogoutRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RUN_LOGOUT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request user roles from Session
     * </pre>
     */
    public void getUserInfoFromSession(org.spin.grpc.util.UserInfoRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.UserInfoValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO_FROM_SESSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request Menu from Parent UUID
     * </pre>
     */
    public void getMenuAndChild(org.spin.grpc.util.UserInfoRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Menu> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MENU_AND_CHILD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request change role
     * </pre>
     */
    public void runChangeRole(org.spin.grpc.util.UserInfoRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RUN_CHANGE_ROLE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request session
     * </pre>
     */
    public void getSession(org.spin.grpc.util.SessionRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SESSION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class SecurityBlockingStub extends io.grpc.stub.AbstractStub<SecurityBlockingStub> {
    private SecurityBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request user roles
     * </pre>
     */
    public org.spin.grpc.util.UserInfoValue getUserInfo(org.spin.grpc.util.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request login from user
     * </pre>
     */
    public org.spin.grpc.util.Session runLogin(org.spin.grpc.util.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RUN_LOGIN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request login and role
     * </pre>
     */
    public org.spin.grpc.util.Session runLoginDefault(org.spin.grpc.util.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RUN_LOGIN_DEFAULT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a Role from uuid
     * </pre>
     */
    public org.spin.grpc.util.Session runLogout(org.spin.grpc.util.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RUN_LOGOUT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request user roles from Session
     * </pre>
     */
    public org.spin.grpc.util.UserInfoValue getUserInfoFromSession(org.spin.grpc.util.UserInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_INFO_FROM_SESSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request Menu from Parent UUID
     * </pre>
     */
    public org.spin.grpc.util.Menu getMenuAndChild(org.spin.grpc.util.UserInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MENU_AND_CHILD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request change role
     * </pre>
     */
    public org.spin.grpc.util.Session runChangeRole(org.spin.grpc.util.UserInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RUN_CHANGE_ROLE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Request session
     * </pre>
     */
    public org.spin.grpc.util.Session getSession(org.spin.grpc.util.SessionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SESSION, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class SecurityFutureStub extends io.grpc.stub.AbstractStub<SecurityFutureStub> {
    private SecurityFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request user roles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.UserInfoValue> getUserInfo(
        org.spin.grpc.util.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request login from user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Session> runLogin(
        org.spin.grpc.util.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RUN_LOGIN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request login and role
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Session> runLoginDefault(
        org.spin.grpc.util.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RUN_LOGIN_DEFAULT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a Role from uuid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Session> runLogout(
        org.spin.grpc.util.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RUN_LOGOUT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request user roles from Session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.UserInfoValue> getUserInfoFromSession(
        org.spin.grpc.util.UserInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO_FROM_SESSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request Menu from Parent UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Menu> getMenuAndChild(
        org.spin.grpc.util.UserInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MENU_AND_CHILD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request change role
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Session> runChangeRole(
        org.spin.grpc.util.UserInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RUN_CHANGE_ROLE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Request session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Session> getSession(
        org.spin.grpc.util.SessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SESSION, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_INFO = 0;
  private static final int METHODID_RUN_LOGIN = 1;
  private static final int METHODID_RUN_LOGIN_DEFAULT = 2;
  private static final int METHODID_RUN_LOGOUT = 3;
  private static final int METHODID_GET_USER_INFO_FROM_SESSION = 4;
  private static final int METHODID_GET_MENU_AND_CHILD = 5;
  private static final int METHODID_RUN_CHANGE_ROLE = 6;
  private static final int METHODID_GET_SESSION = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecurityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecurityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((org.spin.grpc.util.LoginRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.UserInfoValue>) responseObserver);
          break;
        case METHODID_RUN_LOGIN:
          serviceImpl.runLogin((org.spin.grpc.util.LoginRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Session>) responseObserver);
          break;
        case METHODID_RUN_LOGIN_DEFAULT:
          serviceImpl.runLoginDefault((org.spin.grpc.util.LoginRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Session>) responseObserver);
          break;
        case METHODID_RUN_LOGOUT:
          serviceImpl.runLogout((org.spin.grpc.util.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Session>) responseObserver);
          break;
        case METHODID_GET_USER_INFO_FROM_SESSION:
          serviceImpl.getUserInfoFromSession((org.spin.grpc.util.UserInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.UserInfoValue>) responseObserver);
          break;
        case METHODID_GET_MENU_AND_CHILD:
          serviceImpl.getMenuAndChild((org.spin.grpc.util.UserInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Menu>) responseObserver);
          break;
        case METHODID_RUN_CHANGE_ROLE:
          serviceImpl.runChangeRole((org.spin.grpc.util.UserInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Session>) responseObserver);
          break;
        case METHODID_GET_SESSION:
          serviceImpl.getSession((org.spin.grpc.util.SessionRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Session>) responseObserver);
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

  private static final class SecurityDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempiereAccess.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecurityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityDescriptorSupplier())
              .addMethod(METHOD_GET_USER_INFO)
              .addMethod(METHOD_RUN_LOGIN)
              .addMethod(METHOD_RUN_LOGIN_DEFAULT)
              .addMethod(METHOD_RUN_LOGOUT)
              .addMethod(METHOD_GET_USER_INFO_FROM_SESSION)
              .addMethod(METHOD_GET_MENU_AND_CHILD)
              .addMethod(METHOD_RUN_CHANGE_ROLE)
              .addMethod(METHOD_GET_SESSION)
              .build();
        }
      }
    }
    return result;
  }
}
