// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	Report View List
 * </pre>
 *
 * Protobuf type {@code data.ListReportViewsResponse}
 */
public  final class ListReportViewsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListReportViewsResponse)
    ListReportViewsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListReportViewsResponse.newBuilder() to construct.
  private ListReportViewsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListReportViewsResponse() {
    recordCount_ = 0L;
    reportViews_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListReportViewsResponse(
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
              reportViews_ = new java.util.ArrayList<org.spin.grpc.util.ReportView>();
              mutable_bitField0_ |= 0x00000002;
            }
            reportViews_.add(
                input.readMessage(org.spin.grpc.util.ReportView.parser(), extensionRegistry));
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
        reportViews_ = java.util.Collections.unmodifiableList(reportViews_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListReportViewsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListReportViewsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListReportViewsResponse.class, org.spin.grpc.util.ListReportViewsResponse.Builder.class);
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

  public static final int REPORTVIEWS_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.ReportView> reportViews_;
  /**
   * <code>repeated .data.ReportView reportViews = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.ReportView> getReportViewsList() {
    return reportViews_;
  }
  /**
   * <code>repeated .data.ReportView reportViews = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.ReportViewOrBuilder> 
      getReportViewsOrBuilderList() {
    return reportViews_;
  }
  /**
   * <code>repeated .data.ReportView reportViews = 2;</code>
   */
  public int getReportViewsCount() {
    return reportViews_.size();
  }
  /**
   * <code>repeated .data.ReportView reportViews = 2;</code>
   */
  public org.spin.grpc.util.ReportView getReportViews(int index) {
    return reportViews_.get(index);
  }
  /**
   * <code>repeated .data.ReportView reportViews = 2;</code>
   */
  public org.spin.grpc.util.ReportViewOrBuilder getReportViewsOrBuilder(
      int index) {
    return reportViews_.get(index);
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
    for (int i = 0; i < reportViews_.size(); i++) {
      output.writeMessage(2, reportViews_.get(i));
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
    for (int i = 0; i < reportViews_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, reportViews_.get(i));
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
    if (!(obj instanceof org.spin.grpc.util.ListReportViewsResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListReportViewsResponse other = (org.spin.grpc.util.ListReportViewsResponse) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getReportViewsList()
        .equals(other.getReportViewsList());
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
    if (getReportViewsCount() > 0) {
      hash = (37 * hash) + REPORTVIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getReportViewsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListReportViewsResponse parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ListReportViewsResponse prototype) {
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
   *	Report View List
   * </pre>
   *
   * Protobuf type {@code data.ListReportViewsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListReportViewsResponse)
      org.spin.grpc.util.ListReportViewsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListReportViewsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListReportViewsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListReportViewsResponse.class, org.spin.grpc.util.ListReportViewsResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListReportViewsResponse.newBuilder()
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
        getReportViewsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (reportViewsBuilder_ == null) {
        reportViews_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        reportViewsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListReportViewsResponse_descriptor;
    }

    public org.spin.grpc.util.ListReportViewsResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ListReportViewsResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ListReportViewsResponse build() {
      org.spin.grpc.util.ListReportViewsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListReportViewsResponse buildPartial() {
      org.spin.grpc.util.ListReportViewsResponse result = new org.spin.grpc.util.ListReportViewsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (reportViewsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          reportViews_ = java.util.Collections.unmodifiableList(reportViews_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.reportViews_ = reportViews_;
      } else {
        result.reportViews_ = reportViewsBuilder_.build();
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
      if (other instanceof org.spin.grpc.util.ListReportViewsResponse) {
        return mergeFrom((org.spin.grpc.util.ListReportViewsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListReportViewsResponse other) {
      if (other == org.spin.grpc.util.ListReportViewsResponse.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (reportViewsBuilder_ == null) {
        if (!other.reportViews_.isEmpty()) {
          if (reportViews_.isEmpty()) {
            reportViews_ = other.reportViews_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureReportViewsIsMutable();
            reportViews_.addAll(other.reportViews_);
          }
          onChanged();
        }
      } else {
        if (!other.reportViews_.isEmpty()) {
          if (reportViewsBuilder_.isEmpty()) {
            reportViewsBuilder_.dispose();
            reportViewsBuilder_ = null;
            reportViews_ = other.reportViews_;
            bitField0_ = (bitField0_ & ~0x00000002);
            reportViewsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReportViewsFieldBuilder() : null;
          } else {
            reportViewsBuilder_.addAllMessages(other.reportViews_);
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
      org.spin.grpc.util.ListReportViewsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListReportViewsResponse) e.getUnfinishedMessage();
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

    private java.util.List<org.spin.grpc.util.ReportView> reportViews_ =
      java.util.Collections.emptyList();
    private void ensureReportViewsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        reportViews_ = new java.util.ArrayList<org.spin.grpc.util.ReportView>(reportViews_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.ReportView, org.spin.grpc.util.ReportView.Builder, org.spin.grpc.util.ReportViewOrBuilder> reportViewsBuilder_;

    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.ReportView> getReportViewsList() {
      if (reportViewsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reportViews_);
      } else {
        return reportViewsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public int getReportViewsCount() {
      if (reportViewsBuilder_ == null) {
        return reportViews_.size();
      } else {
        return reportViewsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public org.spin.grpc.util.ReportView getReportViews(int index) {
      if (reportViewsBuilder_ == null) {
        return reportViews_.get(index);
      } else {
        return reportViewsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder setReportViews(
        int index, org.spin.grpc.util.ReportView value) {
      if (reportViewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportViewsIsMutable();
        reportViews_.set(index, value);
        onChanged();
      } else {
        reportViewsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder setReportViews(
        int index, org.spin.grpc.util.ReportView.Builder builderForValue) {
      if (reportViewsBuilder_ == null) {
        ensureReportViewsIsMutable();
        reportViews_.set(index, builderForValue.build());
        onChanged();
      } else {
        reportViewsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder addReportViews(org.spin.grpc.util.ReportView value) {
      if (reportViewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportViewsIsMutable();
        reportViews_.add(value);
        onChanged();
      } else {
        reportViewsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder addReportViews(
        int index, org.spin.grpc.util.ReportView value) {
      if (reportViewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportViewsIsMutable();
        reportViews_.add(index, value);
        onChanged();
      } else {
        reportViewsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder addReportViews(
        org.spin.grpc.util.ReportView.Builder builderForValue) {
      if (reportViewsBuilder_ == null) {
        ensureReportViewsIsMutable();
        reportViews_.add(builderForValue.build());
        onChanged();
      } else {
        reportViewsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder addReportViews(
        int index, org.spin.grpc.util.ReportView.Builder builderForValue) {
      if (reportViewsBuilder_ == null) {
        ensureReportViewsIsMutable();
        reportViews_.add(index, builderForValue.build());
        onChanged();
      } else {
        reportViewsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder addAllReportViews(
        java.lang.Iterable<? extends org.spin.grpc.util.ReportView> values) {
      if (reportViewsBuilder_ == null) {
        ensureReportViewsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reportViews_);
        onChanged();
      } else {
        reportViewsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder clearReportViews() {
      if (reportViewsBuilder_ == null) {
        reportViews_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        reportViewsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public Builder removeReportViews(int index) {
      if (reportViewsBuilder_ == null) {
        ensureReportViewsIsMutable();
        reportViews_.remove(index);
        onChanged();
      } else {
        reportViewsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public org.spin.grpc.util.ReportView.Builder getReportViewsBuilder(
        int index) {
      return getReportViewsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public org.spin.grpc.util.ReportViewOrBuilder getReportViewsOrBuilder(
        int index) {
      if (reportViewsBuilder_ == null) {
        return reportViews_.get(index);  } else {
        return reportViewsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.ReportViewOrBuilder> 
         getReportViewsOrBuilderList() {
      if (reportViewsBuilder_ != null) {
        return reportViewsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reportViews_);
      }
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public org.spin.grpc.util.ReportView.Builder addReportViewsBuilder() {
      return getReportViewsFieldBuilder().addBuilder(
          org.spin.grpc.util.ReportView.getDefaultInstance());
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public org.spin.grpc.util.ReportView.Builder addReportViewsBuilder(
        int index) {
      return getReportViewsFieldBuilder().addBuilder(
          index, org.spin.grpc.util.ReportView.getDefaultInstance());
    }
    /**
     * <code>repeated .data.ReportView reportViews = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.ReportView.Builder> 
         getReportViewsBuilderList() {
      return getReportViewsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.ReportView, org.spin.grpc.util.ReportView.Builder, org.spin.grpc.util.ReportViewOrBuilder> 
        getReportViewsFieldBuilder() {
      if (reportViewsBuilder_ == null) {
        reportViewsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.ReportView, org.spin.grpc.util.ReportView.Builder, org.spin.grpc.util.ReportViewOrBuilder>(
                reportViews_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        reportViews_ = null;
      }
      return reportViewsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:data.ListReportViewsResponse)
  }

  // @@protoc_insertion_point(class_scope:data.ListReportViewsResponse)
  private static final org.spin.grpc.util.ListReportViewsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListReportViewsResponse();
  }

  public static org.spin.grpc.util.ListReportViewsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListReportViewsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListReportViewsResponse>() {
    public ListReportViewsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListReportViewsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListReportViewsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListReportViewsResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListReportViewsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

