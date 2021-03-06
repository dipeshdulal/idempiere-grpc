// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base_data_type.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	Resource reference
 * </pre>
 *
 * Protobuf type {@code data.ResourceReference}
 */
public  final class ResourceReference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ResourceReference)
    ResourceReferenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceReference.newBuilder() to construct.
  private ResourceReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceReference() {
    resourceUuid_ = "";
    fileName_ = "";
    description_ = "";
    textMsg_ = "";
    contentType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResourceReference(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceUuid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fileName_ = s;
            break;
          }
          case 26: {
            org.spin.grpc.util.Decimal.Builder subBuilder = null;
            if (fileSize_ != null) {
              subBuilder = fileSize_.toBuilder();
            }
            fileSize_ = input.readMessage(org.spin.grpc.util.Decimal.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fileSize_);
              fileSize_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            textMsg_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            contentType_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereBase.internal_static_data_ResourceReference_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereBase.internal_static_data_ResourceReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ResourceReference.class, org.spin.grpc.util.ResourceReference.Builder.class);
  }

  public static final int RESOURCEUUID_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceUuid_;
  /**
   * <code>string resourceUuid = 1;</code>
   */
  public java.lang.String getResourceUuid() {
    java.lang.Object ref = resourceUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceUuid_ = s;
      return s;
    }
  }
  /**
   * <code>string resourceUuid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceUuidBytes() {
    java.lang.Object ref = resourceUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string fileName = 2;</code>
   */
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string fileName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILESIZE_FIELD_NUMBER = 3;
  private org.spin.grpc.util.Decimal fileSize_;
  /**
   * <code>.data.Decimal fileSize = 3;</code>
   */
  public boolean hasFileSize() {
    return fileSize_ != null;
  }
  /**
   * <code>.data.Decimal fileSize = 3;</code>
   */
  public org.spin.grpc.util.Decimal getFileSize() {
    return fileSize_ == null ? org.spin.grpc.util.Decimal.getDefaultInstance() : fileSize_;
  }
  /**
   * <code>.data.Decimal fileSize = 3;</code>
   */
  public org.spin.grpc.util.DecimalOrBuilder getFileSizeOrBuilder() {
    return getFileSize();
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 4;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEXTMSG_FIELD_NUMBER = 5;
  private volatile java.lang.Object textMsg_;
  /**
   * <code>string textMsg = 5;</code>
   */
  public java.lang.String getTextMsg() {
    java.lang.Object ref = textMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      textMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string textMsg = 5;</code>
   */
  public com.google.protobuf.ByteString
      getTextMsgBytes() {
    java.lang.Object ref = textMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      textMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENTTYPE_FIELD_NUMBER = 6;
  private volatile java.lang.Object contentType_;
  /**
   * <code>string contentType = 6;</code>
   */
  public java.lang.String getContentType() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentType_ = s;
      return s;
    }
  }
  /**
   * <code>string contentType = 6;</code>
   */
  public com.google.protobuf.ByteString
      getContentTypeBytes() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contentType_ = b;
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
    if (!getResourceUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceUuid_);
    }
    if (!getFileNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileName_);
    }
    if (fileSize_ != null) {
      output.writeMessage(3, getFileSize());
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    if (!getTextMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, textMsg_);
    }
    if (!getContentTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, contentType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceUuid_);
    }
    if (!getFileNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileName_);
    }
    if (fileSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFileSize());
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
    }
    if (!getTextMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, textMsg_);
    }
    if (!getContentTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, contentType_);
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
    if (!(obj instanceof org.spin.grpc.util.ResourceReference)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ResourceReference other = (org.spin.grpc.util.ResourceReference) obj;

    boolean result = true;
    result = result && getResourceUuid()
        .equals(other.getResourceUuid());
    result = result && getFileName()
        .equals(other.getFileName());
    result = result && (hasFileSize() == other.hasFileSize());
    if (hasFileSize()) {
      result = result && getFileSize()
          .equals(other.getFileSize());
    }
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && getTextMsg()
        .equals(other.getTextMsg());
    result = result && getContentType()
        .equals(other.getContentType());
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
    hash = (37 * hash) + RESOURCEUUID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceUuid().hashCode();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    if (hasFileSize()) {
      hash = (37 * hash) + FILESIZE_FIELD_NUMBER;
      hash = (53 * hash) + getFileSize().hashCode();
    }
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + TEXTMSG_FIELD_NUMBER;
    hash = (53 * hash) + getTextMsg().hashCode();
    hash = (37 * hash) + CONTENTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ResourceReference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ResourceReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ResourceReference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ResourceReference parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ResourceReference prototype) {
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
   *	Resource reference
   * </pre>
   *
   * Protobuf type {@code data.ResourceReference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ResourceReference)
      org.spin.grpc.util.ResourceReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereBase.internal_static_data_ResourceReference_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereBase.internal_static_data_ResourceReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ResourceReference.class, org.spin.grpc.util.ResourceReference.Builder.class);
    }

    // Construct using org.spin.grpc.util.ResourceReference.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      resourceUuid_ = "";

      fileName_ = "";

      if (fileSizeBuilder_ == null) {
        fileSize_ = null;
      } else {
        fileSize_ = null;
        fileSizeBuilder_ = null;
      }
      description_ = "";

      textMsg_ = "";

      contentType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereBase.internal_static_data_ResourceReference_descriptor;
    }

    public org.spin.grpc.util.ResourceReference getDefaultInstanceForType() {
      return org.spin.grpc.util.ResourceReference.getDefaultInstance();
    }

    public org.spin.grpc.util.ResourceReference build() {
      org.spin.grpc.util.ResourceReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ResourceReference buildPartial() {
      org.spin.grpc.util.ResourceReference result = new org.spin.grpc.util.ResourceReference(this);
      result.resourceUuid_ = resourceUuid_;
      result.fileName_ = fileName_;
      if (fileSizeBuilder_ == null) {
        result.fileSize_ = fileSize_;
      } else {
        result.fileSize_ = fileSizeBuilder_.build();
      }
      result.description_ = description_;
      result.textMsg_ = textMsg_;
      result.contentType_ = contentType_;
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
      if (other instanceof org.spin.grpc.util.ResourceReference) {
        return mergeFrom((org.spin.grpc.util.ResourceReference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ResourceReference other) {
      if (other == org.spin.grpc.util.ResourceReference.getDefaultInstance()) return this;
      if (!other.getResourceUuid().isEmpty()) {
        resourceUuid_ = other.resourceUuid_;
        onChanged();
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        onChanged();
      }
      if (other.hasFileSize()) {
        mergeFileSize(other.getFileSize());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getTextMsg().isEmpty()) {
        textMsg_ = other.textMsg_;
        onChanged();
      }
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
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
      org.spin.grpc.util.ResourceReference parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ResourceReference) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceUuid_ = "";
    /**
     * <code>string resourceUuid = 1;</code>
     */
    public java.lang.String getResourceUuid() {
      java.lang.Object ref = resourceUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resourceUuid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceUuidBytes() {
      java.lang.Object ref = resourceUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resourceUuid = 1;</code>
     */
    public Builder setResourceUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resourceUuid = 1;</code>
     */
    public Builder clearResourceUuid() {
      
      resourceUuid_ = getDefaultInstance().getResourceUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string resourceUuid = 1;</code>
     */
    public Builder setResourceUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string fileName = 2;</code>
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fileName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fileName = 2;</code>
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 2;</code>
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 2;</code>
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
      onChanged();
      return this;
    }

    private org.spin.grpc.util.Decimal fileSize_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.Decimal, org.spin.grpc.util.Decimal.Builder, org.spin.grpc.util.DecimalOrBuilder> fileSizeBuilder_;
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    public boolean hasFileSize() {
      return fileSizeBuilder_ != null || fileSize_ != null;
    }
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    public org.spin.grpc.util.Decimal getFileSize() {
      if (fileSizeBuilder_ == null) {
        return fileSize_ == null ? org.spin.grpc.util.Decimal.getDefaultInstance() : fileSize_;
      } else {
        return fileSizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    public Builder setFileSize(org.spin.grpc.util.Decimal value) {
      if (fileSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fileSize_ = value;
        onChanged();
      } else {
        fileSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    public Builder setFileSize(
        org.spin.grpc.util.Decimal.Builder builderForValue) {
      if (fileSizeBuilder_ == null) {
        fileSize_ = builderForValue.build();
        onChanged();
      } else {
        fileSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    public Builder mergeFileSize(org.spin.grpc.util.Decimal value) {
      if (fileSizeBuilder_ == null) {
        if (fileSize_ != null) {
          fileSize_ =
            org.spin.grpc.util.Decimal.newBuilder(fileSize_).mergeFrom(value).buildPartial();
        } else {
          fileSize_ = value;
        }
        onChanged();
      } else {
        fileSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    public Builder clearFileSize() {
      if (fileSizeBuilder_ == null) {
        fileSize_ = null;
        onChanged();
      } else {
        fileSize_ = null;
        fileSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    public org.spin.grpc.util.Decimal.Builder getFileSizeBuilder() {
      
      onChanged();
      return getFileSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    public org.spin.grpc.util.DecimalOrBuilder getFileSizeOrBuilder() {
      if (fileSizeBuilder_ != null) {
        return fileSizeBuilder_.getMessageOrBuilder();
      } else {
        return fileSize_ == null ?
            org.spin.grpc.util.Decimal.getDefaultInstance() : fileSize_;
      }
    }
    /**
     * <code>.data.Decimal fileSize = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.Decimal, org.spin.grpc.util.Decimal.Builder, org.spin.grpc.util.DecimalOrBuilder> 
        getFileSizeFieldBuilder() {
      if (fileSizeBuilder_ == null) {
        fileSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.spin.grpc.util.Decimal, org.spin.grpc.util.Decimal.Builder, org.spin.grpc.util.DecimalOrBuilder>(
                getFileSize(),
                getParentForChildren(),
                isClean());
        fileSize_ = null;
      }
      return fileSizeBuilder_;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 4;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object textMsg_ = "";
    /**
     * <code>string textMsg = 5;</code>
     */
    public java.lang.String getTextMsg() {
      java.lang.Object ref = textMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        textMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string textMsg = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTextMsgBytes() {
      java.lang.Object ref = textMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        textMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string textMsg = 5;</code>
     */
    public Builder setTextMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      textMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string textMsg = 5;</code>
     */
    public Builder clearTextMsg() {
      
      textMsg_ = getDefaultInstance().getTextMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string textMsg = 5;</code>
     */
    public Builder setTextMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      textMsg_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object contentType_ = "";
    /**
     * <code>string contentType = 6;</code>
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string contentType = 6;</code>
     */
    public com.google.protobuf.ByteString
        getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string contentType = 6;</code>
     */
    public Builder setContentType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      contentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string contentType = 6;</code>
     */
    public Builder clearContentType() {
      
      contentType_ = getDefaultInstance().getContentType();
      onChanged();
      return this;
    }
    /**
     * <code>string contentType = 6;</code>
     */
    public Builder setContentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      contentType_ = value;
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


    // @@protoc_insertion_point(builder_scope:data.ResourceReference)
  }

  // @@protoc_insertion_point(class_scope:data.ResourceReference)
  private static final org.spin.grpc.util.ResourceReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ResourceReference();
  }

  public static org.spin.grpc.util.ResourceReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceReference>
      PARSER = new com.google.protobuf.AbstractParser<ResourceReference>() {
    public ResourceReference parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResourceReference(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResourceReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceReference> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ResourceReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

