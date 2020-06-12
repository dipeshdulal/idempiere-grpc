// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: point_of_sales.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	List Orders Response
 * </pre>
 *
 * Protobuf type {@code data.ListOrdersResponse}
 */
public  final class ListOrdersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListOrdersResponse)
    ListOrdersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOrdersResponse.newBuilder() to construct.
  private ListOrdersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOrdersResponse() {
    recordCount_ = 0L;
    orders_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListOrdersResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            recordCount_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              orders_ = new java.util.ArrayList<org.spin.grpc.util.Order>();
              mutable_bitField0_ |= 0x00000002;
            }
            orders_.add(
                input.readMessage(org.spin.grpc.util.Order.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        orders_ = java.util.Collections.unmodifiableList(orders_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempierePOS.internal_static_data_ListOrdersResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempierePOS.internal_static_data_ListOrdersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListOrdersResponse.class, org.spin.grpc.util.ListOrdersResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RECORDCOUNT_FIELD_NUMBER = 1;
  private long recordCount_;
  /**
   * <code>int64 recordCount = 1;</code>
   */
  public long getRecordCount() {
    return recordCount_;
  }

  public static final int ORDERS_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.Order> orders_;
  /**
   * <code>repeated .data.Order orders = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.Order> getOrdersList() {
    return orders_;
  }
  /**
   * <code>repeated .data.Order orders = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.OrderOrBuilder> 
      getOrdersOrBuilderList() {
    return orders_;
  }
  /**
   * <code>repeated .data.Order orders = 2;</code>
   */
  public int getOrdersCount() {
    return orders_.size();
  }
  /**
   * <code>repeated .data.Order orders = 2;</code>
   */
  public org.spin.grpc.util.Order getOrders(int index) {
    return orders_.get(index);
  }
  /**
   * <code>repeated .data.Order orders = 2;</code>
   */
  public org.spin.grpc.util.OrderOrBuilder getOrdersOrBuilder(
      int index) {
    return orders_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 3;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (recordCount_ != 0L) {
      output.writeInt64(1, recordCount_);
    }
    for (int i = 0; i < orders_.size(); i++) {
      output.writeMessage(2, orders_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recordCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, recordCount_);
    }
    for (int i = 0; i < orders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, orders_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.spin.grpc.util.ListOrdersResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListOrdersResponse other = (org.spin.grpc.util.ListOrdersResponse) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getOrdersList()
        .equals(other.getOrdersList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RECORDCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRecordCount());
    if (getOrdersCount() > 0) {
      hash = (37 * hash) + ORDERS_FIELD_NUMBER;
      hash = (53 * hash) + getOrdersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListOrdersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListOrdersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.spin.grpc.util.ListOrdersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *	List Orders Response
   * </pre>
   *
   * Protobuf type {@code data.ListOrdersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListOrdersResponse)
      org.spin.grpc.util.ListOrdersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempierePOS.internal_static_data_ListOrdersResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempierePOS.internal_static_data_ListOrdersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListOrdersResponse.class, org.spin.grpc.util.ListOrdersResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListOrdersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getOrdersFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        ordersBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempierePOS.internal_static_data_ListOrdersResponse_descriptor;
    }

    public org.spin.grpc.util.ListOrdersResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ListOrdersResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ListOrdersResponse build() {
      org.spin.grpc.util.ListOrdersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListOrdersResponse buildPartial() {
      org.spin.grpc.util.ListOrdersResponse result = new org.spin.grpc.util.ListOrdersResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (ordersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          orders_ = java.util.Collections.unmodifiableList(orders_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.orders_ = orders_;
      } else {
        result.orders_ = ordersBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.spin.grpc.util.ListOrdersResponse) {
        return mergeFrom((org.spin.grpc.util.ListOrdersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListOrdersResponse other) {
      if (other == org.spin.grpc.util.ListOrdersResponse.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (ordersBuilder_ == null) {
        if (!other.orders_.isEmpty()) {
          if (orders_.isEmpty()) {
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOrdersIsMutable();
            orders_.addAll(other.orders_);
          }
          onChanged();
        }
      } else {
        if (!other.orders_.isEmpty()) {
          if (ordersBuilder_.isEmpty()) {
            ordersBuilder_.dispose();
            ordersBuilder_ = null;
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000002);
            ordersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrdersFieldBuilder() : null;
          } else {
            ordersBuilder_.addAllMessages(other.orders_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.spin.grpc.util.ListOrdersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListOrdersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long recordCount_ ;
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public long getRecordCount() {
      return recordCount_;
    }
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public Builder setRecordCount(long value) {
      
      recordCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 recordCount = 1;</code>
     */
    public Builder clearRecordCount() {
      
      recordCount_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<org.spin.grpc.util.Order> orders_ =
      java.util.Collections.emptyList();
    private void ensureOrdersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        orders_ = new java.util.ArrayList<org.spin.grpc.util.Order>(orders_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.Order, org.spin.grpc.util.Order.Builder, org.spin.grpc.util.OrderOrBuilder> ordersBuilder_;

    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.Order> getOrdersList() {
      if (ordersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orders_);
      } else {
        return ordersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public int getOrdersCount() {
      if (ordersBuilder_ == null) {
        return orders_.size();
      } else {
        return ordersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public org.spin.grpc.util.Order getOrders(int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);
      } else {
        return ordersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder setOrders(
        int index, org.spin.grpc.util.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.set(index, value);
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder setOrders(
        int index, org.spin.grpc.util.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.set(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder addOrders(org.spin.grpc.util.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder addOrders(
        int index, org.spin.grpc.util.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(index, value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder addOrders(
        org.spin.grpc.util.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder addOrders(
        int index, org.spin.grpc.util.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder addAllOrders(
        java.lang.Iterable<? extends org.spin.grpc.util.Order> values) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, orders_);
        onChanged();
      } else {
        ordersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder clearOrders() {
      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        ordersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public Builder removeOrders(int index) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.remove(index);
        onChanged();
      } else {
        ordersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public org.spin.grpc.util.Order.Builder getOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public org.spin.grpc.util.OrderOrBuilder getOrdersOrBuilder(
        int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);  } else {
        return ordersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.OrderOrBuilder> 
         getOrdersOrBuilderList() {
      if (ordersBuilder_ != null) {
        return ordersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orders_);
      }
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public org.spin.grpc.util.Order.Builder addOrdersBuilder() {
      return getOrdersFieldBuilder().addBuilder(
          org.spin.grpc.util.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public org.spin.grpc.util.Order.Builder addOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().addBuilder(
          index, org.spin.grpc.util.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .data.Order orders = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.Order.Builder> 
         getOrdersBuilderList() {
      return getOrdersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.Order, org.spin.grpc.util.Order.Builder, org.spin.grpc.util.OrderOrBuilder> 
        getOrdersFieldBuilder() {
      if (ordersBuilder_ == null) {
        ordersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.Order, org.spin.grpc.util.Order.Builder, org.spin.grpc.util.OrderOrBuilder>(
                orders_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        orders_ = null;
      }
      return ordersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 3;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:data.ListOrdersResponse)
  }

  // @@protoc_insertion_point(class_scope:data.ListOrdersResponse)
  private static final org.spin.grpc.util.ListOrdersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListOrdersResponse();
  }

  public static org.spin.grpc.util.ListOrdersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOrdersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListOrdersResponse>() {
    public ListOrdersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListOrdersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListOrdersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOrdersResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListOrdersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
