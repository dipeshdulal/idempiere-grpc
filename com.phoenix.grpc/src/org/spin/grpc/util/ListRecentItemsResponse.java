// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	Recent Items List
 * </pre>
 *
 * Protobuf type {@code data.ListRecentItemsResponse}
 */
public  final class ListRecentItemsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListRecentItemsResponse)
    ListRecentItemsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListRecentItemsResponse.newBuilder() to construct.
  private ListRecentItemsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRecentItemsResponse() {
    recordCount_ = 0L;
    recentItems_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListRecentItemsResponse(
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
              recentItems_ = new java.util.ArrayList<org.spin.grpc.util.RecentItem>();
              mutable_bitField0_ |= 0x00000002;
            }
            recentItems_.add(
                input.readMessage(org.spin.grpc.util.RecentItem.parser(), extensionRegistry));
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
        recentItems_ = java.util.Collections.unmodifiableList(recentItems_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListRecentItemsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListRecentItemsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListRecentItemsResponse.class, org.spin.grpc.util.ListRecentItemsResponse.Builder.class);
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

  public static final int RECENTITEMS_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.RecentItem> recentItems_;
  /**
   * <code>repeated .data.RecentItem recentItems = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.RecentItem> getRecentItemsList() {
    return recentItems_;
  }
  /**
   * <code>repeated .data.RecentItem recentItems = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.RecentItemOrBuilder> 
      getRecentItemsOrBuilderList() {
    return recentItems_;
  }
  /**
   * <code>repeated .data.RecentItem recentItems = 2;</code>
   */
  public int getRecentItemsCount() {
    return recentItems_.size();
  }
  /**
   * <code>repeated .data.RecentItem recentItems = 2;</code>
   */
  public org.spin.grpc.util.RecentItem getRecentItems(int index) {
    return recentItems_.get(index);
  }
  /**
   * <code>repeated .data.RecentItem recentItems = 2;</code>
   */
  public org.spin.grpc.util.RecentItemOrBuilder getRecentItemsOrBuilder(
      int index) {
    return recentItems_.get(index);
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
    for (int i = 0; i < recentItems_.size(); i++) {
      output.writeMessage(2, recentItems_.get(i));
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
    for (int i = 0; i < recentItems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, recentItems_.get(i));
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
    if (!(obj instanceof org.spin.grpc.util.ListRecentItemsResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListRecentItemsResponse other = (org.spin.grpc.util.ListRecentItemsResponse) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getRecentItemsList()
        .equals(other.getRecentItemsList());
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
    if (getRecentItemsCount() > 0) {
      hash = (37 * hash) + RECENTITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getRecentItemsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListRecentItemsResponse parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ListRecentItemsResponse prototype) {
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
   *	Recent Items List
   * </pre>
   *
   * Protobuf type {@code data.ListRecentItemsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListRecentItemsResponse)
      org.spin.grpc.util.ListRecentItemsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListRecentItemsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListRecentItemsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListRecentItemsResponse.class, org.spin.grpc.util.ListRecentItemsResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListRecentItemsResponse.newBuilder()
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
        getRecentItemsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (recentItemsBuilder_ == null) {
        recentItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        recentItemsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListRecentItemsResponse_descriptor;
    }

    public org.spin.grpc.util.ListRecentItemsResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ListRecentItemsResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ListRecentItemsResponse build() {
      org.spin.grpc.util.ListRecentItemsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListRecentItemsResponse buildPartial() {
      org.spin.grpc.util.ListRecentItemsResponse result = new org.spin.grpc.util.ListRecentItemsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (recentItemsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          recentItems_ = java.util.Collections.unmodifiableList(recentItems_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.recentItems_ = recentItems_;
      } else {
        result.recentItems_ = recentItemsBuilder_.build();
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
      if (other instanceof org.spin.grpc.util.ListRecentItemsResponse) {
        return mergeFrom((org.spin.grpc.util.ListRecentItemsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListRecentItemsResponse other) {
      if (other == org.spin.grpc.util.ListRecentItemsResponse.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (recentItemsBuilder_ == null) {
        if (!other.recentItems_.isEmpty()) {
          if (recentItems_.isEmpty()) {
            recentItems_ = other.recentItems_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRecentItemsIsMutable();
            recentItems_.addAll(other.recentItems_);
          }
          onChanged();
        }
      } else {
        if (!other.recentItems_.isEmpty()) {
          if (recentItemsBuilder_.isEmpty()) {
            recentItemsBuilder_.dispose();
            recentItemsBuilder_ = null;
            recentItems_ = other.recentItems_;
            bitField0_ = (bitField0_ & ~0x00000002);
            recentItemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecentItemsFieldBuilder() : null;
          } else {
            recentItemsBuilder_.addAllMessages(other.recentItems_);
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
      org.spin.grpc.util.ListRecentItemsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListRecentItemsResponse) e.getUnfinishedMessage();
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

    private java.util.List<org.spin.grpc.util.RecentItem> recentItems_ =
      java.util.Collections.emptyList();
    private void ensureRecentItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        recentItems_ = new java.util.ArrayList<org.spin.grpc.util.RecentItem>(recentItems_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.RecentItem, org.spin.grpc.util.RecentItem.Builder, org.spin.grpc.util.RecentItemOrBuilder> recentItemsBuilder_;

    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.RecentItem> getRecentItemsList() {
      if (recentItemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(recentItems_);
      } else {
        return recentItemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public int getRecentItemsCount() {
      if (recentItemsBuilder_ == null) {
        return recentItems_.size();
      } else {
        return recentItemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public org.spin.grpc.util.RecentItem getRecentItems(int index) {
      if (recentItemsBuilder_ == null) {
        return recentItems_.get(index);
      } else {
        return recentItemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder setRecentItems(
        int index, org.spin.grpc.util.RecentItem value) {
      if (recentItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecentItemsIsMutable();
        recentItems_.set(index, value);
        onChanged();
      } else {
        recentItemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder setRecentItems(
        int index, org.spin.grpc.util.RecentItem.Builder builderForValue) {
      if (recentItemsBuilder_ == null) {
        ensureRecentItemsIsMutable();
        recentItems_.set(index, builderForValue.build());
        onChanged();
      } else {
        recentItemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder addRecentItems(org.spin.grpc.util.RecentItem value) {
      if (recentItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecentItemsIsMutable();
        recentItems_.add(value);
        onChanged();
      } else {
        recentItemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder addRecentItems(
        int index, org.spin.grpc.util.RecentItem value) {
      if (recentItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecentItemsIsMutable();
        recentItems_.add(index, value);
        onChanged();
      } else {
        recentItemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder addRecentItems(
        org.spin.grpc.util.RecentItem.Builder builderForValue) {
      if (recentItemsBuilder_ == null) {
        ensureRecentItemsIsMutable();
        recentItems_.add(builderForValue.build());
        onChanged();
      } else {
        recentItemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder addRecentItems(
        int index, org.spin.grpc.util.RecentItem.Builder builderForValue) {
      if (recentItemsBuilder_ == null) {
        ensureRecentItemsIsMutable();
        recentItems_.add(index, builderForValue.build());
        onChanged();
      } else {
        recentItemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder addAllRecentItems(
        java.lang.Iterable<? extends org.spin.grpc.util.RecentItem> values) {
      if (recentItemsBuilder_ == null) {
        ensureRecentItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, recentItems_);
        onChanged();
      } else {
        recentItemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder clearRecentItems() {
      if (recentItemsBuilder_ == null) {
        recentItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        recentItemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public Builder removeRecentItems(int index) {
      if (recentItemsBuilder_ == null) {
        ensureRecentItemsIsMutable();
        recentItems_.remove(index);
        onChanged();
      } else {
        recentItemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public org.spin.grpc.util.RecentItem.Builder getRecentItemsBuilder(
        int index) {
      return getRecentItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public org.spin.grpc.util.RecentItemOrBuilder getRecentItemsOrBuilder(
        int index) {
      if (recentItemsBuilder_ == null) {
        return recentItems_.get(index);  } else {
        return recentItemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.RecentItemOrBuilder> 
         getRecentItemsOrBuilderList() {
      if (recentItemsBuilder_ != null) {
        return recentItemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(recentItems_);
      }
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public org.spin.grpc.util.RecentItem.Builder addRecentItemsBuilder() {
      return getRecentItemsFieldBuilder().addBuilder(
          org.spin.grpc.util.RecentItem.getDefaultInstance());
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public org.spin.grpc.util.RecentItem.Builder addRecentItemsBuilder(
        int index) {
      return getRecentItemsFieldBuilder().addBuilder(
          index, org.spin.grpc.util.RecentItem.getDefaultInstance());
    }
    /**
     * <code>repeated .data.RecentItem recentItems = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.RecentItem.Builder> 
         getRecentItemsBuilderList() {
      return getRecentItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.RecentItem, org.spin.grpc.util.RecentItem.Builder, org.spin.grpc.util.RecentItemOrBuilder> 
        getRecentItemsFieldBuilder() {
      if (recentItemsBuilder_ == null) {
        recentItemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.RecentItem, org.spin.grpc.util.RecentItem.Builder, org.spin.grpc.util.RecentItemOrBuilder>(
                recentItems_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        recentItems_ = null;
      }
      return recentItemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:data.ListRecentItemsResponse)
  }

  // @@protoc_insertion_point(class_scope:data.ListRecentItemsResponse)
  private static final org.spin.grpc.util.ListRecentItemsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListRecentItemsResponse();
  }

  public static org.spin.grpc.util.ListRecentItemsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRecentItemsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListRecentItemsResponse>() {
    public ListRecentItemsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListRecentItemsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListRecentItemsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRecentItemsResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListRecentItemsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

