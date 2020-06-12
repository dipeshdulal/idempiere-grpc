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
 *	POS Service used for ADempiere integration 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: point_of_sales.proto")
public final class StoreGrpc {

  private StoreGrpc() {}

  public static final String SERVICE_NAME = "data.Store";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.PointOfSalesRequest,
      org.spin.grpc.util.PointOfSales> METHOD_GET_POINT_OF_SALES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.PointOfSalesRequest, org.spin.grpc.util.PointOfSales>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "GetPointOfSales"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.PointOfSalesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.PointOfSales.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListPointOfSalesRequest,
      org.spin.grpc.util.ListPointOfSalesResponse> METHOD_LIST_POINT_OF_SALES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListPointOfSalesRequest, org.spin.grpc.util.ListPointOfSalesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "ListPointOfSales"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListPointOfSalesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListPointOfSalesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetProductPriceRequest,
      org.spin.grpc.util.ProductPrice> METHOD_GET_PRODUCT_PRICE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetProductPriceRequest, org.spin.grpc.util.ProductPrice>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "GetProductPrice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetProductPriceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ProductPrice.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListProductPriceRequest,
      org.spin.grpc.util.ListProductPriceResponse> METHOD_LIST_PRODUCT_PRICE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListProductPriceRequest, org.spin.grpc.util.ListProductPriceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "ListProductPrice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListProductPriceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListProductPriceResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.CreateOrderRequest,
      org.spin.grpc.util.Order> METHOD_CREATE_ORDER =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.CreateOrderRequest, org.spin.grpc.util.Order>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "CreateOrder"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.CreateOrderRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Order.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.DeleteOrderRequest,
      org.spin.grpc.util.Empty> METHOD_DELETE_ORDER =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.DeleteOrderRequest, org.spin.grpc.util.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "DeleteOrder"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.DeleteOrderRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.CreateOrderLineRequest,
      org.spin.grpc.util.OrderLine> METHOD_CREATE_ORDER_LINE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.CreateOrderLineRequest, org.spin.grpc.util.OrderLine>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "CreateOrderLine"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.CreateOrderLineRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.OrderLine.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.DeleteOrderLineRequest,
      org.spin.grpc.util.Empty> METHOD_DELETE_ORDER_LINE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.DeleteOrderLineRequest, org.spin.grpc.util.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "DeleteOrderLine"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.DeleteOrderLineRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.UpdateOrderLineRequest,
      org.spin.grpc.util.OrderLine> METHOD_UPDATE_ORDER_LINE =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.UpdateOrderLineRequest, org.spin.grpc.util.OrderLine>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "UpdateOrderLine"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.UpdateOrderLineRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.OrderLine.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetOrderRequest,
      org.spin.grpc.util.Order> METHOD_GET_ORDER =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetOrderRequest, org.spin.grpc.util.Order>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "GetOrder"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetOrderRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.Order.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListOrdersRequest,
      org.spin.grpc.util.ListOrdersResponse> METHOD_LIST_ORDERS =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListOrdersRequest, org.spin.grpc.util.ListOrdersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "ListOrders"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListOrdersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListOrdersResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.ListOrderLinesRequest,
      org.spin.grpc.util.ListOrderLinesResponse> METHOD_LIST_ORDER_LINES =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.ListOrderLinesRequest, org.spin.grpc.util.ListOrderLinesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "ListOrderLines"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListOrderLinesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.ListOrderLinesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.spin.grpc.util.GetKeyLayoutRequest,
      org.spin.grpc.util.KeyLayout> METHOD_GET_KEY_LAYOUT =
      io.grpc.MethodDescriptor.<org.spin.grpc.util.GetKeyLayoutRequest, org.spin.grpc.util.KeyLayout>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "data.Store", "GetKeyLayout"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.GetKeyLayoutRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.spin.grpc.util.KeyLayout.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreStub newStub(io.grpc.Channel channel) {
    return new StoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StoreFutureStub(channel);
  }

  /**
   * <pre>
   *	POS Service used for ADempiere integration 
   * </pre>
   */
  public static abstract class StoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *	Get POS Definition
     * </pre>
     */
    public void getPointOfSales(org.spin.grpc.util.PointOfSalesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.PointOfSales> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_POINT_OF_SALES, responseObserver);
    }

    /**
     * <pre>
     *	List Point of Sales
     * </pre>
     */
    public void listPointOfSales(org.spin.grpc.util.ListPointOfSalesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPointOfSalesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_POINT_OF_SALES, responseObserver);
    }

    /**
     * <pre>
     *	Get Product Price from Code / UPC / Name
     * </pre>
     */
    public void getProductPrice(org.spin.grpc.util.GetProductPriceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ProductPrice> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_PRICE, responseObserver);
    }

    /**
     * <pre>
     *	List Product Price
     * </pre>
     */
    public void listProductPrice(org.spin.grpc.util.ListProductPriceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListProductPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_PRODUCT_PRICE, responseObserver);
    }

    /**
     * <pre>
     *	Create Order
     * </pre>
     */
    public void createOrder(org.spin.grpc.util.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Order> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ORDER, responseObserver);
    }

    /**
     * <pre>
     *	Delete Order
     * </pre>
     */
    public void deleteOrder(org.spin.grpc.util.DeleteOrderRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ORDER, responseObserver);
    }

    /**
     * <pre>
     *	Create Order Line
     * </pre>
     */
    public void createOrderLine(org.spin.grpc.util.CreateOrderLineRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.OrderLine> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ORDER_LINE, responseObserver);
    }

    /**
     * <pre>
     *	Delete Order Line
     * </pre>
     */
    public void deleteOrderLine(org.spin.grpc.util.DeleteOrderLineRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ORDER_LINE, responseObserver);
    }

    /**
     * <pre>
     *	Update Order Line
     * </pre>
     */
    public void updateOrderLine(org.spin.grpc.util.UpdateOrderLineRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.OrderLine> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ORDER_LINE, responseObserver);
    }

    /**
     * <pre>
     *	Get a Order
     * </pre>
     */
    public void getOrder(org.spin.grpc.util.GetOrderRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Order> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ORDER, responseObserver);
    }

    /**
     * <pre>
     *	List Orders
     * </pre>
     */
    public void listOrders(org.spin.grpc.util.ListOrdersRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrdersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_ORDERS, responseObserver);
    }

    /**
     * <pre>
     *	List Order Lines
     * </pre>
     */
    public void listOrderLines(org.spin.grpc.util.ListOrderLinesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrderLinesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_ORDER_LINES, responseObserver);
    }

    /**
     * <pre>
     *	Get a Key Layout
     * </pre>
     */
    public void getKeyLayout(org.spin.grpc.util.GetKeyLayoutRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.KeyLayout> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_KEY_LAYOUT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_POINT_OF_SALES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.PointOfSalesRequest,
                org.spin.grpc.util.PointOfSales>(
                  this, METHODID_GET_POINT_OF_SALES)))
          .addMethod(
            METHOD_LIST_POINT_OF_SALES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListPointOfSalesRequest,
                org.spin.grpc.util.ListPointOfSalesResponse>(
                  this, METHODID_LIST_POINT_OF_SALES)))
          .addMethod(
            METHOD_GET_PRODUCT_PRICE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetProductPriceRequest,
                org.spin.grpc.util.ProductPrice>(
                  this, METHODID_GET_PRODUCT_PRICE)))
          .addMethod(
            METHOD_LIST_PRODUCT_PRICE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListProductPriceRequest,
                org.spin.grpc.util.ListProductPriceResponse>(
                  this, METHODID_LIST_PRODUCT_PRICE)))
          .addMethod(
            METHOD_CREATE_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.CreateOrderRequest,
                org.spin.grpc.util.Order>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            METHOD_DELETE_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.DeleteOrderRequest,
                org.spin.grpc.util.Empty>(
                  this, METHODID_DELETE_ORDER)))
          .addMethod(
            METHOD_CREATE_ORDER_LINE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.CreateOrderLineRequest,
                org.spin.grpc.util.OrderLine>(
                  this, METHODID_CREATE_ORDER_LINE)))
          .addMethod(
            METHOD_DELETE_ORDER_LINE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.DeleteOrderLineRequest,
                org.spin.grpc.util.Empty>(
                  this, METHODID_DELETE_ORDER_LINE)))
          .addMethod(
            METHOD_UPDATE_ORDER_LINE,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.UpdateOrderLineRequest,
                org.spin.grpc.util.OrderLine>(
                  this, METHODID_UPDATE_ORDER_LINE)))
          .addMethod(
            METHOD_GET_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetOrderRequest,
                org.spin.grpc.util.Order>(
                  this, METHODID_GET_ORDER)))
          .addMethod(
            METHOD_LIST_ORDERS,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListOrdersRequest,
                org.spin.grpc.util.ListOrdersResponse>(
                  this, METHODID_LIST_ORDERS)))
          .addMethod(
            METHOD_LIST_ORDER_LINES,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.ListOrderLinesRequest,
                org.spin.grpc.util.ListOrderLinesResponse>(
                  this, METHODID_LIST_ORDER_LINES)))
          .addMethod(
            METHOD_GET_KEY_LAYOUT,
            asyncUnaryCall(
              new MethodHandlers<
                org.spin.grpc.util.GetKeyLayoutRequest,
                org.spin.grpc.util.KeyLayout>(
                  this, METHODID_GET_KEY_LAYOUT)))
          .build();
    }
  }

  /**
   * <pre>
   *	POS Service used for ADempiere integration 
   * </pre>
   */
  public static final class StoreStub extends io.grpc.stub.AbstractStub<StoreStub> {
    private StoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Get POS Definition
     * </pre>
     */
    public void getPointOfSales(org.spin.grpc.util.PointOfSalesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.PointOfSales> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_POINT_OF_SALES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List Point of Sales
     * </pre>
     */
    public void listPointOfSales(org.spin.grpc.util.ListPointOfSalesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPointOfSalesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_POINT_OF_SALES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Get Product Price from Code / UPC / Name
     * </pre>
     */
    public void getProductPrice(org.spin.grpc.util.GetProductPriceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ProductPrice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_PRICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List Product Price
     * </pre>
     */
    public void listProductPrice(org.spin.grpc.util.ListProductPriceRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListProductPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_PRODUCT_PRICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Create Order
     * </pre>
     */
    public void createOrder(org.spin.grpc.util.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Order> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ORDER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Delete Order
     * </pre>
     */
    public void deleteOrder(org.spin.grpc.util.DeleteOrderRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ORDER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Create Order Line
     * </pre>
     */
    public void createOrderLine(org.spin.grpc.util.CreateOrderLineRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.OrderLine> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ORDER_LINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Delete Order Line
     * </pre>
     */
    public void deleteOrderLine(org.spin.grpc.util.DeleteOrderLineRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ORDER_LINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Update Order Line
     * </pre>
     */
    public void updateOrderLine(org.spin.grpc.util.UpdateOrderLineRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.OrderLine> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ORDER_LINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Get a Order
     * </pre>
     */
    public void getOrder(org.spin.grpc.util.GetOrderRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.Order> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ORDER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List Orders
     * </pre>
     */
    public void listOrders(org.spin.grpc.util.ListOrdersRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrdersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_ORDERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	List Order Lines
     * </pre>
     */
    public void listOrderLines(org.spin.grpc.util.ListOrderLinesRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrderLinesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_ORDER_LINES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	Get a Key Layout
     * </pre>
     */
    public void getKeyLayout(org.spin.grpc.util.GetKeyLayoutRequest request,
        io.grpc.stub.StreamObserver<org.spin.grpc.util.KeyLayout> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_KEY_LAYOUT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *	POS Service used for ADempiere integration 
   * </pre>
   */
  public static final class StoreBlockingStub extends io.grpc.stub.AbstractStub<StoreBlockingStub> {
    private StoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Get POS Definition
     * </pre>
     */
    public org.spin.grpc.util.PointOfSales getPointOfSales(org.spin.grpc.util.PointOfSalesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_POINT_OF_SALES, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List Point of Sales
     * </pre>
     */
    public org.spin.grpc.util.ListPointOfSalesResponse listPointOfSales(org.spin.grpc.util.ListPointOfSalesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_POINT_OF_SALES, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Get Product Price from Code / UPC / Name
     * </pre>
     */
    public org.spin.grpc.util.ProductPrice getProductPrice(org.spin.grpc.util.GetProductPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_PRICE, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List Product Price
     * </pre>
     */
    public org.spin.grpc.util.ListProductPriceResponse listProductPrice(org.spin.grpc.util.ListProductPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_PRODUCT_PRICE, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Create Order
     * </pre>
     */
    public org.spin.grpc.util.Order createOrder(org.spin.grpc.util.CreateOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ORDER, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Delete Order
     * </pre>
     */
    public org.spin.grpc.util.Empty deleteOrder(org.spin.grpc.util.DeleteOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ORDER, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Create Order Line
     * </pre>
     */
    public org.spin.grpc.util.OrderLine createOrderLine(org.spin.grpc.util.CreateOrderLineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ORDER_LINE, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Delete Order Line
     * </pre>
     */
    public org.spin.grpc.util.Empty deleteOrderLine(org.spin.grpc.util.DeleteOrderLineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ORDER_LINE, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Update Order Line
     * </pre>
     */
    public org.spin.grpc.util.OrderLine updateOrderLine(org.spin.grpc.util.UpdateOrderLineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ORDER_LINE, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Get a Order
     * </pre>
     */
    public org.spin.grpc.util.Order getOrder(org.spin.grpc.util.GetOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ORDER, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List Orders
     * </pre>
     */
    public org.spin.grpc.util.ListOrdersResponse listOrders(org.spin.grpc.util.ListOrdersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_ORDERS, getCallOptions(), request);
    }

    /**
     * <pre>
     *	List Order Lines
     * </pre>
     */
    public org.spin.grpc.util.ListOrderLinesResponse listOrderLines(org.spin.grpc.util.ListOrderLinesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_ORDER_LINES, getCallOptions(), request);
    }

    /**
     * <pre>
     *	Get a Key Layout
     * </pre>
     */
    public org.spin.grpc.util.KeyLayout getKeyLayout(org.spin.grpc.util.GetKeyLayoutRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_KEY_LAYOUT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *	POS Service used for ADempiere integration 
   * </pre>
   */
  public static final class StoreFutureStub extends io.grpc.stub.AbstractStub<StoreFutureStub> {
    private StoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *	Get POS Definition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.PointOfSales> getPointOfSales(
        org.spin.grpc.util.PointOfSalesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_POINT_OF_SALES, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List Point of Sales
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListPointOfSalesResponse> listPointOfSales(
        org.spin.grpc.util.ListPointOfSalesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_POINT_OF_SALES, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Get Product Price from Code / UPC / Name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ProductPrice> getProductPrice(
        org.spin.grpc.util.GetProductPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_PRICE, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List Product Price
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListProductPriceResponse> listProductPrice(
        org.spin.grpc.util.ListProductPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_PRODUCT_PRICE, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Create Order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Order> createOrder(
        org.spin.grpc.util.CreateOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ORDER, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Delete Order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Empty> deleteOrder(
        org.spin.grpc.util.DeleteOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ORDER, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Create Order Line
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.OrderLine> createOrderLine(
        org.spin.grpc.util.CreateOrderLineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ORDER_LINE, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Delete Order Line
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Empty> deleteOrderLine(
        org.spin.grpc.util.DeleteOrderLineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ORDER_LINE, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Update Order Line
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.OrderLine> updateOrderLine(
        org.spin.grpc.util.UpdateOrderLineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ORDER_LINE, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Get a Order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.Order> getOrder(
        org.spin.grpc.util.GetOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ORDER, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List Orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListOrdersResponse> listOrders(
        org.spin.grpc.util.ListOrdersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_ORDERS, getCallOptions()), request);
    }

    /**
     * <pre>
     *	List Order Lines
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.ListOrderLinesResponse> listOrderLines(
        org.spin.grpc.util.ListOrderLinesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_ORDER_LINES, getCallOptions()), request);
    }

    /**
     * <pre>
     *	Get a Key Layout
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.spin.grpc.util.KeyLayout> getKeyLayout(
        org.spin.grpc.util.GetKeyLayoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_KEY_LAYOUT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POINT_OF_SALES = 0;
  private static final int METHODID_LIST_POINT_OF_SALES = 1;
  private static final int METHODID_GET_PRODUCT_PRICE = 2;
  private static final int METHODID_LIST_PRODUCT_PRICE = 3;
  private static final int METHODID_CREATE_ORDER = 4;
  private static final int METHODID_DELETE_ORDER = 5;
  private static final int METHODID_CREATE_ORDER_LINE = 6;
  private static final int METHODID_DELETE_ORDER_LINE = 7;
  private static final int METHODID_UPDATE_ORDER_LINE = 8;
  private static final int METHODID_GET_ORDER = 9;
  private static final int METHODID_LIST_ORDERS = 10;
  private static final int METHODID_LIST_ORDER_LINES = 11;
  private static final int METHODID_GET_KEY_LAYOUT = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POINT_OF_SALES:
          serviceImpl.getPointOfSales((org.spin.grpc.util.PointOfSalesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.PointOfSales>) responseObserver);
          break;
        case METHODID_LIST_POINT_OF_SALES:
          serviceImpl.listPointOfSales((org.spin.grpc.util.ListPointOfSalesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListPointOfSalesResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_PRICE:
          serviceImpl.getProductPrice((org.spin.grpc.util.GetProductPriceRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ProductPrice>) responseObserver);
          break;
        case METHODID_LIST_PRODUCT_PRICE:
          serviceImpl.listProductPrice((org.spin.grpc.util.ListProductPriceRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListProductPriceResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((org.spin.grpc.util.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Order>) responseObserver);
          break;
        case METHODID_DELETE_ORDER:
          serviceImpl.deleteOrder((org.spin.grpc.util.DeleteOrderRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty>) responseObserver);
          break;
        case METHODID_CREATE_ORDER_LINE:
          serviceImpl.createOrderLine((org.spin.grpc.util.CreateOrderLineRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.OrderLine>) responseObserver);
          break;
        case METHODID_DELETE_ORDER_LINE:
          serviceImpl.deleteOrderLine((org.spin.grpc.util.DeleteOrderLineRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER_LINE:
          serviceImpl.updateOrderLine((org.spin.grpc.util.UpdateOrderLineRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.OrderLine>) responseObserver);
          break;
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((org.spin.grpc.util.GetOrderRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.Order>) responseObserver);
          break;
        case METHODID_LIST_ORDERS:
          serviceImpl.listOrders((org.spin.grpc.util.ListOrdersRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrdersResponse>) responseObserver);
          break;
        case METHODID_LIST_ORDER_LINES:
          serviceImpl.listOrderLines((org.spin.grpc.util.ListOrderLinesRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.ListOrderLinesResponse>) responseObserver);
          break;
        case METHODID_GET_KEY_LAYOUT:
          serviceImpl.getKeyLayout((org.spin.grpc.util.GetKeyLayoutRequest) request,
              (io.grpc.stub.StreamObserver<org.spin.grpc.util.KeyLayout>) responseObserver);
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

  private static final class StoreDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.spin.grpc.util.ADempierePOS.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreDescriptorSupplier())
              .addMethod(METHOD_GET_POINT_OF_SALES)
              .addMethod(METHOD_LIST_POINT_OF_SALES)
              .addMethod(METHOD_GET_PRODUCT_PRICE)
              .addMethod(METHOD_LIST_PRODUCT_PRICE)
              .addMethod(METHOD_CREATE_ORDER)
              .addMethod(METHOD_DELETE_ORDER)
              .addMethod(METHOD_CREATE_ORDER_LINE)
              .addMethod(METHOD_DELETE_ORDER_LINE)
              .addMethod(METHOD_UPDATE_ORDER_LINE)
              .addMethod(METHOD_GET_ORDER)
              .addMethod(METHOD_LIST_ORDERS)
              .addMethod(METHOD_LIST_ORDER_LINES)
              .addMethod(METHOD_GET_KEY_LAYOUT)
              .build();
        }
      }
    }
    return result;
  }
}
