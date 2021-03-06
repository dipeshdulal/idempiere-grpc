// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	Dashboards List
 * </pre>
 *
 * Protobuf type {@code data.ListDashboardsResponse}
 */
public  final class ListDashboardsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListDashboardsResponse)
    ListDashboardsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDashboardsResponse.newBuilder() to construct.
  private ListDashboardsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDashboardsResponse() {
    recordCount_ = 0L;
    dashboards_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDashboardsResponse(
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
              dashboards_ = new java.util.ArrayList<org.spin.grpc.util.Dashboard>();
              mutable_bitField0_ |= 0x00000002;
            }
            dashboards_.add(
                input.readMessage(org.spin.grpc.util.Dashboard.parser(), extensionRegistry));
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
        dashboards_ = java.util.Collections.unmodifiableList(dashboards_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListDashboardsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListDashboardsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListDashboardsResponse.class, org.spin.grpc.util.ListDashboardsResponse.Builder.class);
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

  public static final int DASHBOARDS_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.Dashboard> dashboards_;
  /**
   * <code>repeated .data.Dashboard dashboards = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.Dashboard> getDashboardsList() {
    return dashboards_;
  }
  /**
   * <code>repeated .data.Dashboard dashboards = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.DashboardOrBuilder> 
      getDashboardsOrBuilderList() {
    return dashboards_;
  }
  /**
   * <code>repeated .data.Dashboard dashboards = 2;</code>
   */
  public int getDashboardsCount() {
    return dashboards_.size();
  }
  /**
   * <code>repeated .data.Dashboard dashboards = 2;</code>
   */
  public org.spin.grpc.util.Dashboard getDashboards(int index) {
    return dashboards_.get(index);
  }
  /**
   * <code>repeated .data.Dashboard dashboards = 2;</code>
   */
  public org.spin.grpc.util.DashboardOrBuilder getDashboardsOrBuilder(
      int index) {
    return dashboards_.get(index);
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
    for (int i = 0; i < dashboards_.size(); i++) {
      output.writeMessage(2, dashboards_.get(i));
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
    for (int i = 0; i < dashboards_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, dashboards_.get(i));
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
    if (!(obj instanceof org.spin.grpc.util.ListDashboardsResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListDashboardsResponse other = (org.spin.grpc.util.ListDashboardsResponse) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getDashboardsList()
        .equals(other.getDashboardsList());
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
    if (getDashboardsCount() > 0) {
      hash = (37 * hash) + DASHBOARDS_FIELD_NUMBER;
      hash = (53 * hash) + getDashboardsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListDashboardsResponse parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ListDashboardsResponse prototype) {
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
   *	Dashboards List
   * </pre>
   *
   * Protobuf type {@code data.ListDashboardsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListDashboardsResponse)
      org.spin.grpc.util.ListDashboardsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListDashboardsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListDashboardsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListDashboardsResponse.class, org.spin.grpc.util.ListDashboardsResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListDashboardsResponse.newBuilder()
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
        getDashboardsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (dashboardsBuilder_ == null) {
        dashboards_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        dashboardsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListDashboardsResponse_descriptor;
    }

    public org.spin.grpc.util.ListDashboardsResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ListDashboardsResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ListDashboardsResponse build() {
      org.spin.grpc.util.ListDashboardsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListDashboardsResponse buildPartial() {
      org.spin.grpc.util.ListDashboardsResponse result = new org.spin.grpc.util.ListDashboardsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (dashboardsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          dashboards_ = java.util.Collections.unmodifiableList(dashboards_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.dashboards_ = dashboards_;
      } else {
        result.dashboards_ = dashboardsBuilder_.build();
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
      if (other instanceof org.spin.grpc.util.ListDashboardsResponse) {
        return mergeFrom((org.spin.grpc.util.ListDashboardsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListDashboardsResponse other) {
      if (other == org.spin.grpc.util.ListDashboardsResponse.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (dashboardsBuilder_ == null) {
        if (!other.dashboards_.isEmpty()) {
          if (dashboards_.isEmpty()) {
            dashboards_ = other.dashboards_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDashboardsIsMutable();
            dashboards_.addAll(other.dashboards_);
          }
          onChanged();
        }
      } else {
        if (!other.dashboards_.isEmpty()) {
          if (dashboardsBuilder_.isEmpty()) {
            dashboardsBuilder_.dispose();
            dashboardsBuilder_ = null;
            dashboards_ = other.dashboards_;
            bitField0_ = (bitField0_ & ~0x00000002);
            dashboardsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDashboardsFieldBuilder() : null;
          } else {
            dashboardsBuilder_.addAllMessages(other.dashboards_);
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
      org.spin.grpc.util.ListDashboardsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListDashboardsResponse) e.getUnfinishedMessage();
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

    private java.util.List<org.spin.grpc.util.Dashboard> dashboards_ =
      java.util.Collections.emptyList();
    private void ensureDashboardsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        dashboards_ = new java.util.ArrayList<org.spin.grpc.util.Dashboard>(dashboards_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.Dashboard, org.spin.grpc.util.Dashboard.Builder, org.spin.grpc.util.DashboardOrBuilder> dashboardsBuilder_;

    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.Dashboard> getDashboardsList() {
      if (dashboardsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dashboards_);
      } else {
        return dashboardsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public int getDashboardsCount() {
      if (dashboardsBuilder_ == null) {
        return dashboards_.size();
      } else {
        return dashboardsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public org.spin.grpc.util.Dashboard getDashboards(int index) {
      if (dashboardsBuilder_ == null) {
        return dashboards_.get(index);
      } else {
        return dashboardsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder setDashboards(
        int index, org.spin.grpc.util.Dashboard value) {
      if (dashboardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDashboardsIsMutable();
        dashboards_.set(index, value);
        onChanged();
      } else {
        dashboardsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder setDashboards(
        int index, org.spin.grpc.util.Dashboard.Builder builderForValue) {
      if (dashboardsBuilder_ == null) {
        ensureDashboardsIsMutable();
        dashboards_.set(index, builderForValue.build());
        onChanged();
      } else {
        dashboardsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder addDashboards(org.spin.grpc.util.Dashboard value) {
      if (dashboardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDashboardsIsMutable();
        dashboards_.add(value);
        onChanged();
      } else {
        dashboardsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder addDashboards(
        int index, org.spin.grpc.util.Dashboard value) {
      if (dashboardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDashboardsIsMutable();
        dashboards_.add(index, value);
        onChanged();
      } else {
        dashboardsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder addDashboards(
        org.spin.grpc.util.Dashboard.Builder builderForValue) {
      if (dashboardsBuilder_ == null) {
        ensureDashboardsIsMutable();
        dashboards_.add(builderForValue.build());
        onChanged();
      } else {
        dashboardsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder addDashboards(
        int index, org.spin.grpc.util.Dashboard.Builder builderForValue) {
      if (dashboardsBuilder_ == null) {
        ensureDashboardsIsMutable();
        dashboards_.add(index, builderForValue.build());
        onChanged();
      } else {
        dashboardsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder addAllDashboards(
        java.lang.Iterable<? extends org.spin.grpc.util.Dashboard> values) {
      if (dashboardsBuilder_ == null) {
        ensureDashboardsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dashboards_);
        onChanged();
      } else {
        dashboardsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder clearDashboards() {
      if (dashboardsBuilder_ == null) {
        dashboards_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        dashboardsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public Builder removeDashboards(int index) {
      if (dashboardsBuilder_ == null) {
        ensureDashboardsIsMutable();
        dashboards_.remove(index);
        onChanged();
      } else {
        dashboardsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public org.spin.grpc.util.Dashboard.Builder getDashboardsBuilder(
        int index) {
      return getDashboardsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public org.spin.grpc.util.DashboardOrBuilder getDashboardsOrBuilder(
        int index) {
      if (dashboardsBuilder_ == null) {
        return dashboards_.get(index);  } else {
        return dashboardsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.DashboardOrBuilder> 
         getDashboardsOrBuilderList() {
      if (dashboardsBuilder_ != null) {
        return dashboardsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dashboards_);
      }
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public org.spin.grpc.util.Dashboard.Builder addDashboardsBuilder() {
      return getDashboardsFieldBuilder().addBuilder(
          org.spin.grpc.util.Dashboard.getDefaultInstance());
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public org.spin.grpc.util.Dashboard.Builder addDashboardsBuilder(
        int index) {
      return getDashboardsFieldBuilder().addBuilder(
          index, org.spin.grpc.util.Dashboard.getDefaultInstance());
    }
    /**
     * <code>repeated .data.Dashboard dashboards = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.Dashboard.Builder> 
         getDashboardsBuilderList() {
      return getDashboardsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.Dashboard, org.spin.grpc.util.Dashboard.Builder, org.spin.grpc.util.DashboardOrBuilder> 
        getDashboardsFieldBuilder() {
      if (dashboardsBuilder_ == null) {
        dashboardsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.Dashboard, org.spin.grpc.util.Dashboard.Builder, org.spin.grpc.util.DashboardOrBuilder>(
                dashboards_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        dashboards_ = null;
      }
      return dashboardsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:data.ListDashboardsResponse)
  }

  // @@protoc_insertion_point(class_scope:data.ListDashboardsResponse)
  private static final org.spin.grpc.util.ListDashboardsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListDashboardsResponse();
  }

  public static org.spin.grpc.util.ListDashboardsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDashboardsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDashboardsResponse>() {
    public ListDashboardsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListDashboardsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDashboardsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDashboardsResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListDashboardsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

