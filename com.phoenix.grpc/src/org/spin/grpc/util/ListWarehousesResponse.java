// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core_functionality.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	Lost Warehouses Response
 * </pre>
 *
 * Protobuf type {@code data.ListWarehousesResponse}
 */
public  final class ListWarehousesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListWarehousesResponse)
    ListWarehousesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListWarehousesResponse.newBuilder() to construct.
  private ListWarehousesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListWarehousesResponse() {
    recordCount_ = 0L;
    warehouses_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListWarehousesResponse(
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
              warehouses_ = new java.util.ArrayList<org.spin.grpc.util.Warehouse>();
              mutable_bitField0_ |= 0x00000002;
            }
            warehouses_.add(
                input.readMessage(org.spin.grpc.util.Warehouse.parser(), extensionRegistry));
            break;
          }
          case 34: {
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
        warehouses_ = java.util.Collections.unmodifiableList(warehouses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListWarehousesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListWarehousesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListWarehousesResponse.class, org.spin.grpc.util.ListWarehousesResponse.Builder.class);
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

  public static final int WAREHOUSES_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.Warehouse> warehouses_;
  /**
   * <code>repeated .data.Warehouse warehouses = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.Warehouse> getWarehousesList() {
    return warehouses_;
  }
  /**
   * <code>repeated .data.Warehouse warehouses = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.WarehouseOrBuilder> 
      getWarehousesOrBuilderList() {
    return warehouses_;
  }
  /**
   * <code>repeated .data.Warehouse warehouses = 2;</code>
   */
  public int getWarehousesCount() {
    return warehouses_.size();
  }
  /**
   * <code>repeated .data.Warehouse warehouses = 2;</code>
   */
  public org.spin.grpc.util.Warehouse getWarehouses(int index) {
    return warehouses_.get(index);
  }
  /**
   * <code>repeated .data.Warehouse warehouses = 2;</code>
   */
  public org.spin.grpc.util.WarehouseOrBuilder getWarehousesOrBuilder(
      int index) {
    return warehouses_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 4;</code>
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
   * <code>string next_page_token = 4;</code>
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
    for (int i = 0; i < warehouses_.size(); i++) {
      output.writeMessage(2, warehouses_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nextPageToken_);
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
    for (int i = 0; i < warehouses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, warehouses_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nextPageToken_);
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
    if (!(obj instanceof org.spin.grpc.util.ListWarehousesResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListWarehousesResponse other = (org.spin.grpc.util.ListWarehousesResponse) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getWarehousesList()
        .equals(other.getWarehousesList());
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
    if (getWarehousesCount() > 0) {
      hash = (37 * hash) + WAREHOUSES_FIELD_NUMBER;
      hash = (53 * hash) + getWarehousesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListWarehousesResponse parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ListWarehousesResponse prototype) {
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
   *	Lost Warehouses Response
   * </pre>
   *
   * Protobuf type {@code data.ListWarehousesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListWarehousesResponse)
      org.spin.grpc.util.ListWarehousesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListWarehousesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListWarehousesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListWarehousesResponse.class, org.spin.grpc.util.ListWarehousesResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListWarehousesResponse.newBuilder()
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
        getWarehousesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (warehousesBuilder_ == null) {
        warehouses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        warehousesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListWarehousesResponse_descriptor;
    }

    public org.spin.grpc.util.ListWarehousesResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ListWarehousesResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ListWarehousesResponse build() {
      org.spin.grpc.util.ListWarehousesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListWarehousesResponse buildPartial() {
      org.spin.grpc.util.ListWarehousesResponse result = new org.spin.grpc.util.ListWarehousesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (warehousesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          warehouses_ = java.util.Collections.unmodifiableList(warehouses_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.warehouses_ = warehouses_;
      } else {
        result.warehouses_ = warehousesBuilder_.build();
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
      if (other instanceof org.spin.grpc.util.ListWarehousesResponse) {
        return mergeFrom((org.spin.grpc.util.ListWarehousesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListWarehousesResponse other) {
      if (other == org.spin.grpc.util.ListWarehousesResponse.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (warehousesBuilder_ == null) {
        if (!other.warehouses_.isEmpty()) {
          if (warehouses_.isEmpty()) {
            warehouses_ = other.warehouses_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureWarehousesIsMutable();
            warehouses_.addAll(other.warehouses_);
          }
          onChanged();
        }
      } else {
        if (!other.warehouses_.isEmpty()) {
          if (warehousesBuilder_.isEmpty()) {
            warehousesBuilder_.dispose();
            warehousesBuilder_ = null;
            warehouses_ = other.warehouses_;
            bitField0_ = (bitField0_ & ~0x00000002);
            warehousesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWarehousesFieldBuilder() : null;
          } else {
            warehousesBuilder_.addAllMessages(other.warehouses_);
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
      org.spin.grpc.util.ListWarehousesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListWarehousesResponse) e.getUnfinishedMessage();
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

    private java.util.List<org.spin.grpc.util.Warehouse> warehouses_ =
      java.util.Collections.emptyList();
    private void ensureWarehousesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        warehouses_ = new java.util.ArrayList<org.spin.grpc.util.Warehouse>(warehouses_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.Warehouse, org.spin.grpc.util.Warehouse.Builder, org.spin.grpc.util.WarehouseOrBuilder> warehousesBuilder_;

    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.Warehouse> getWarehousesList() {
      if (warehousesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(warehouses_);
      } else {
        return warehousesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public int getWarehousesCount() {
      if (warehousesBuilder_ == null) {
        return warehouses_.size();
      } else {
        return warehousesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public org.spin.grpc.util.Warehouse getWarehouses(int index) {
      if (warehousesBuilder_ == null) {
        return warehouses_.get(index);
      } else {
        return warehousesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder setWarehouses(
        int index, org.spin.grpc.util.Warehouse value) {
      if (warehousesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarehousesIsMutable();
        warehouses_.set(index, value);
        onChanged();
      } else {
        warehousesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder setWarehouses(
        int index, org.spin.grpc.util.Warehouse.Builder builderForValue) {
      if (warehousesBuilder_ == null) {
        ensureWarehousesIsMutable();
        warehouses_.set(index, builderForValue.build());
        onChanged();
      } else {
        warehousesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder addWarehouses(org.spin.grpc.util.Warehouse value) {
      if (warehousesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarehousesIsMutable();
        warehouses_.add(value);
        onChanged();
      } else {
        warehousesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder addWarehouses(
        int index, org.spin.grpc.util.Warehouse value) {
      if (warehousesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarehousesIsMutable();
        warehouses_.add(index, value);
        onChanged();
      } else {
        warehousesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder addWarehouses(
        org.spin.grpc.util.Warehouse.Builder builderForValue) {
      if (warehousesBuilder_ == null) {
        ensureWarehousesIsMutable();
        warehouses_.add(builderForValue.build());
        onChanged();
      } else {
        warehousesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder addWarehouses(
        int index, org.spin.grpc.util.Warehouse.Builder builderForValue) {
      if (warehousesBuilder_ == null) {
        ensureWarehousesIsMutable();
        warehouses_.add(index, builderForValue.build());
        onChanged();
      } else {
        warehousesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder addAllWarehouses(
        java.lang.Iterable<? extends org.spin.grpc.util.Warehouse> values) {
      if (warehousesBuilder_ == null) {
        ensureWarehousesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, warehouses_);
        onChanged();
      } else {
        warehousesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder clearWarehouses() {
      if (warehousesBuilder_ == null) {
        warehouses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        warehousesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public Builder removeWarehouses(int index) {
      if (warehousesBuilder_ == null) {
        ensureWarehousesIsMutable();
        warehouses_.remove(index);
        onChanged();
      } else {
        warehousesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public org.spin.grpc.util.Warehouse.Builder getWarehousesBuilder(
        int index) {
      return getWarehousesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public org.spin.grpc.util.WarehouseOrBuilder getWarehousesOrBuilder(
        int index) {
      if (warehousesBuilder_ == null) {
        return warehouses_.get(index);  } else {
        return warehousesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.WarehouseOrBuilder> 
         getWarehousesOrBuilderList() {
      if (warehousesBuilder_ != null) {
        return warehousesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(warehouses_);
      }
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public org.spin.grpc.util.Warehouse.Builder addWarehousesBuilder() {
      return getWarehousesFieldBuilder().addBuilder(
          org.spin.grpc.util.Warehouse.getDefaultInstance());
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public org.spin.grpc.util.Warehouse.Builder addWarehousesBuilder(
        int index) {
      return getWarehousesFieldBuilder().addBuilder(
          index, org.spin.grpc.util.Warehouse.getDefaultInstance());
    }
    /**
     * <code>repeated .data.Warehouse warehouses = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.Warehouse.Builder> 
         getWarehousesBuilderList() {
      return getWarehousesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.Warehouse, org.spin.grpc.util.Warehouse.Builder, org.spin.grpc.util.WarehouseOrBuilder> 
        getWarehousesFieldBuilder() {
      if (warehousesBuilder_ == null) {
        warehousesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.Warehouse, org.spin.grpc.util.Warehouse.Builder, org.spin.grpc.util.WarehouseOrBuilder>(
                warehouses_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        warehouses_ = null;
      }
      return warehousesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 4;</code>
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
     * <code>string next_page_token = 4;</code>
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
     * <code>string next_page_token = 4;</code>
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
     * <code>string next_page_token = 4;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:data.ListWarehousesResponse)
  }

  // @@protoc_insertion_point(class_scope:data.ListWarehousesResponse)
  private static final org.spin.grpc.util.ListWarehousesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListWarehousesResponse();
  }

  public static org.spin.grpc.util.ListWarehousesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWarehousesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListWarehousesResponse>() {
    public ListWarehousesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListWarehousesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListWarehousesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWarehousesResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListWarehousesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

