// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	Print Format List
 * </pre>
 *
 * Protobuf type {@code data.ListPrintFormatsResponse}
 */
public  final class ListPrintFormatsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListPrintFormatsResponse)
    ListPrintFormatsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPrintFormatsResponse.newBuilder() to construct.
  private ListPrintFormatsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPrintFormatsResponse() {
    recordCount_ = 0L;
    printFormats_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListPrintFormatsResponse(
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
              printFormats_ = new java.util.ArrayList<org.spin.grpc.util.PrintFormat>();
              mutable_bitField0_ |= 0x00000002;
            }
            printFormats_.add(
                input.readMessage(org.spin.grpc.util.PrintFormat.parser(), extensionRegistry));
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
        printFormats_ = java.util.Collections.unmodifiableList(printFormats_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListPrintFormatsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_ListPrintFormatsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListPrintFormatsResponse.class, org.spin.grpc.util.ListPrintFormatsResponse.Builder.class);
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

  public static final int PRINTFORMATS_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.PrintFormat> printFormats_;
  /**
   * <code>repeated .data.PrintFormat printFormats = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.PrintFormat> getPrintFormatsList() {
    return printFormats_;
  }
  /**
   * <code>repeated .data.PrintFormat printFormats = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.PrintFormatOrBuilder> 
      getPrintFormatsOrBuilderList() {
    return printFormats_;
  }
  /**
   * <code>repeated .data.PrintFormat printFormats = 2;</code>
   */
  public int getPrintFormatsCount() {
    return printFormats_.size();
  }
  /**
   * <code>repeated .data.PrintFormat printFormats = 2;</code>
   */
  public org.spin.grpc.util.PrintFormat getPrintFormats(int index) {
    return printFormats_.get(index);
  }
  /**
   * <code>repeated .data.PrintFormat printFormats = 2;</code>
   */
  public org.spin.grpc.util.PrintFormatOrBuilder getPrintFormatsOrBuilder(
      int index) {
    return printFormats_.get(index);
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
    for (int i = 0; i < printFormats_.size(); i++) {
      output.writeMessage(2, printFormats_.get(i));
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
    for (int i = 0; i < printFormats_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, printFormats_.get(i));
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
    if (!(obj instanceof org.spin.grpc.util.ListPrintFormatsResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListPrintFormatsResponse other = (org.spin.grpc.util.ListPrintFormatsResponse) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getPrintFormatsList()
        .equals(other.getPrintFormatsList());
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
    if (getPrintFormatsCount() > 0) {
      hash = (37 * hash) + PRINTFORMATS_FIELD_NUMBER;
      hash = (53 * hash) + getPrintFormatsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListPrintFormatsResponse parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ListPrintFormatsResponse prototype) {
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
   *	Print Format List
   * </pre>
   *
   * Protobuf type {@code data.ListPrintFormatsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListPrintFormatsResponse)
      org.spin.grpc.util.ListPrintFormatsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListPrintFormatsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListPrintFormatsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListPrintFormatsResponse.class, org.spin.grpc.util.ListPrintFormatsResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListPrintFormatsResponse.newBuilder()
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
        getPrintFormatsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (printFormatsBuilder_ == null) {
        printFormats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        printFormatsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_ListPrintFormatsResponse_descriptor;
    }

    public org.spin.grpc.util.ListPrintFormatsResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ListPrintFormatsResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ListPrintFormatsResponse build() {
      org.spin.grpc.util.ListPrintFormatsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListPrintFormatsResponse buildPartial() {
      org.spin.grpc.util.ListPrintFormatsResponse result = new org.spin.grpc.util.ListPrintFormatsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (printFormatsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          printFormats_ = java.util.Collections.unmodifiableList(printFormats_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.printFormats_ = printFormats_;
      } else {
        result.printFormats_ = printFormatsBuilder_.build();
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
      if (other instanceof org.spin.grpc.util.ListPrintFormatsResponse) {
        return mergeFrom((org.spin.grpc.util.ListPrintFormatsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListPrintFormatsResponse other) {
      if (other == org.spin.grpc.util.ListPrintFormatsResponse.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (printFormatsBuilder_ == null) {
        if (!other.printFormats_.isEmpty()) {
          if (printFormats_.isEmpty()) {
            printFormats_ = other.printFormats_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePrintFormatsIsMutable();
            printFormats_.addAll(other.printFormats_);
          }
          onChanged();
        }
      } else {
        if (!other.printFormats_.isEmpty()) {
          if (printFormatsBuilder_.isEmpty()) {
            printFormatsBuilder_.dispose();
            printFormatsBuilder_ = null;
            printFormats_ = other.printFormats_;
            bitField0_ = (bitField0_ & ~0x00000002);
            printFormatsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPrintFormatsFieldBuilder() : null;
          } else {
            printFormatsBuilder_.addAllMessages(other.printFormats_);
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
      org.spin.grpc.util.ListPrintFormatsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListPrintFormatsResponse) e.getUnfinishedMessage();
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

    private java.util.List<org.spin.grpc.util.PrintFormat> printFormats_ =
      java.util.Collections.emptyList();
    private void ensurePrintFormatsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        printFormats_ = new java.util.ArrayList<org.spin.grpc.util.PrintFormat>(printFormats_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.PrintFormat, org.spin.grpc.util.PrintFormat.Builder, org.spin.grpc.util.PrintFormatOrBuilder> printFormatsBuilder_;

    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.PrintFormat> getPrintFormatsList() {
      if (printFormatsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(printFormats_);
      } else {
        return printFormatsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public int getPrintFormatsCount() {
      if (printFormatsBuilder_ == null) {
        return printFormats_.size();
      } else {
        return printFormatsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public org.spin.grpc.util.PrintFormat getPrintFormats(int index) {
      if (printFormatsBuilder_ == null) {
        return printFormats_.get(index);
      } else {
        return printFormatsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder setPrintFormats(
        int index, org.spin.grpc.util.PrintFormat value) {
      if (printFormatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePrintFormatsIsMutable();
        printFormats_.set(index, value);
        onChanged();
      } else {
        printFormatsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder setPrintFormats(
        int index, org.spin.grpc.util.PrintFormat.Builder builderForValue) {
      if (printFormatsBuilder_ == null) {
        ensurePrintFormatsIsMutable();
        printFormats_.set(index, builderForValue.build());
        onChanged();
      } else {
        printFormatsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder addPrintFormats(org.spin.grpc.util.PrintFormat value) {
      if (printFormatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePrintFormatsIsMutable();
        printFormats_.add(value);
        onChanged();
      } else {
        printFormatsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder addPrintFormats(
        int index, org.spin.grpc.util.PrintFormat value) {
      if (printFormatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePrintFormatsIsMutable();
        printFormats_.add(index, value);
        onChanged();
      } else {
        printFormatsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder addPrintFormats(
        org.spin.grpc.util.PrintFormat.Builder builderForValue) {
      if (printFormatsBuilder_ == null) {
        ensurePrintFormatsIsMutable();
        printFormats_.add(builderForValue.build());
        onChanged();
      } else {
        printFormatsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder addPrintFormats(
        int index, org.spin.grpc.util.PrintFormat.Builder builderForValue) {
      if (printFormatsBuilder_ == null) {
        ensurePrintFormatsIsMutable();
        printFormats_.add(index, builderForValue.build());
        onChanged();
      } else {
        printFormatsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder addAllPrintFormats(
        java.lang.Iterable<? extends org.spin.grpc.util.PrintFormat> values) {
      if (printFormatsBuilder_ == null) {
        ensurePrintFormatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, printFormats_);
        onChanged();
      } else {
        printFormatsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder clearPrintFormats() {
      if (printFormatsBuilder_ == null) {
        printFormats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        printFormatsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public Builder removePrintFormats(int index) {
      if (printFormatsBuilder_ == null) {
        ensurePrintFormatsIsMutable();
        printFormats_.remove(index);
        onChanged();
      } else {
        printFormatsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public org.spin.grpc.util.PrintFormat.Builder getPrintFormatsBuilder(
        int index) {
      return getPrintFormatsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public org.spin.grpc.util.PrintFormatOrBuilder getPrintFormatsOrBuilder(
        int index) {
      if (printFormatsBuilder_ == null) {
        return printFormats_.get(index);  } else {
        return printFormatsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.PrintFormatOrBuilder> 
         getPrintFormatsOrBuilderList() {
      if (printFormatsBuilder_ != null) {
        return printFormatsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(printFormats_);
      }
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public org.spin.grpc.util.PrintFormat.Builder addPrintFormatsBuilder() {
      return getPrintFormatsFieldBuilder().addBuilder(
          org.spin.grpc.util.PrintFormat.getDefaultInstance());
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public org.spin.grpc.util.PrintFormat.Builder addPrintFormatsBuilder(
        int index) {
      return getPrintFormatsFieldBuilder().addBuilder(
          index, org.spin.grpc.util.PrintFormat.getDefaultInstance());
    }
    /**
     * <code>repeated .data.PrintFormat printFormats = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.PrintFormat.Builder> 
         getPrintFormatsBuilderList() {
      return getPrintFormatsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.PrintFormat, org.spin.grpc.util.PrintFormat.Builder, org.spin.grpc.util.PrintFormatOrBuilder> 
        getPrintFormatsFieldBuilder() {
      if (printFormatsBuilder_ == null) {
        printFormatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.PrintFormat, org.spin.grpc.util.PrintFormat.Builder, org.spin.grpc.util.PrintFormatOrBuilder>(
                printFormats_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        printFormats_ = null;
      }
      return printFormatsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:data.ListPrintFormatsResponse)
  }

  // @@protoc_insertion_point(class_scope:data.ListPrintFormatsResponse)
  private static final org.spin.grpc.util.ListPrintFormatsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListPrintFormatsResponse();
  }

  public static org.spin.grpc.util.ListPrintFormatsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPrintFormatsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPrintFormatsResponse>() {
    public ListPrintFormatsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListPrintFormatsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListPrintFormatsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPrintFormatsResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListPrintFormatsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

