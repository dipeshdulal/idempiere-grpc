// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Request for download resource reference
 * </pre>
 *
 * Protobuf type {@code data.GetResourceReferenceRequest}
 */
public  final class GetResourceReferenceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.GetResourceReferenceRequest)
    GetResourceReferenceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetResourceReferenceRequest.newBuilder() to construct.
  private GetResourceReferenceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetResourceReferenceRequest() {
    imageId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetResourceReferenceRequest(
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
            org.spin.grpc.util.ClientRequest.Builder subBuilder = null;
            if (clientRequest_ != null) {
              subBuilder = clientRequest_.toBuilder();
            }
            clientRequest_ = input.readMessage(org.spin.grpc.util.ClientRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientRequest_);
              clientRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            imageId_ = input.readInt32();
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
    return org.spin.grpc.util.ADempiereData.internal_static_data_GetResourceReferenceRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_GetResourceReferenceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.GetResourceReferenceRequest.class, org.spin.grpc.util.GetResourceReferenceRequest.Builder.class);
  }

  public static final int CLIENTREQUEST_FIELD_NUMBER = 1;
  private org.spin.grpc.util.ClientRequest clientRequest_;
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  public boolean hasClientRequest() {
    return clientRequest_ != null;
  }
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  public org.spin.grpc.util.ClientRequest getClientRequest() {
    return clientRequest_ == null ? org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
  }
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  public org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder() {
    return getClientRequest();
  }

  public static final int IMAGEID_FIELD_NUMBER = 2;
  private int imageId_;
  /**
   * <code>int32 imageId = 2;</code>
   */
  public int getImageId() {
    return imageId_;
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
    if (clientRequest_ != null) {
      output.writeMessage(1, getClientRequest());
    }
    if (imageId_ != 0) {
      output.writeInt32(2, imageId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClientRequest());
    }
    if (imageId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, imageId_);
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
    if (!(obj instanceof org.spin.grpc.util.GetResourceReferenceRequest)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.GetResourceReferenceRequest other = (org.spin.grpc.util.GetResourceReferenceRequest) obj;

    boolean result = true;
    result = result && (hasClientRequest() == other.hasClientRequest());
    if (hasClientRequest()) {
      result = result && getClientRequest()
          .equals(other.getClientRequest());
    }
    result = result && (getImageId()
        == other.getImageId());
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
    if (hasClientRequest()) {
      hash = (37 * hash) + CLIENTREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getClientRequest().hashCode();
    }
    hash = (37 * hash) + IMAGEID_FIELD_NUMBER;
    hash = (53 * hash) + getImageId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.GetResourceReferenceRequest parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.GetResourceReferenceRequest prototype) {
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
   * Request for download resource reference
   * </pre>
   *
   * Protobuf type {@code data.GetResourceReferenceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.GetResourceReferenceRequest)
      org.spin.grpc.util.GetResourceReferenceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_GetResourceReferenceRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_GetResourceReferenceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.GetResourceReferenceRequest.class, org.spin.grpc.util.GetResourceReferenceRequest.Builder.class);
    }

    // Construct using org.spin.grpc.util.GetResourceReferenceRequest.newBuilder()
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
      if (clientRequestBuilder_ == null) {
        clientRequest_ = null;
      } else {
        clientRequest_ = null;
        clientRequestBuilder_ = null;
      }
      imageId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_GetResourceReferenceRequest_descriptor;
    }

    public org.spin.grpc.util.GetResourceReferenceRequest getDefaultInstanceForType() {
      return org.spin.grpc.util.GetResourceReferenceRequest.getDefaultInstance();
    }

    public org.spin.grpc.util.GetResourceReferenceRequest build() {
      org.spin.grpc.util.GetResourceReferenceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.GetResourceReferenceRequest buildPartial() {
      org.spin.grpc.util.GetResourceReferenceRequest result = new org.spin.grpc.util.GetResourceReferenceRequest(this);
      if (clientRequestBuilder_ == null) {
        result.clientRequest_ = clientRequest_;
      } else {
        result.clientRequest_ = clientRequestBuilder_.build();
      }
      result.imageId_ = imageId_;
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
      if (other instanceof org.spin.grpc.util.GetResourceReferenceRequest) {
        return mergeFrom((org.spin.grpc.util.GetResourceReferenceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.GetResourceReferenceRequest other) {
      if (other == org.spin.grpc.util.GetResourceReferenceRequest.getDefaultInstance()) return this;
      if (other.hasClientRequest()) {
        mergeClientRequest(other.getClientRequest());
      }
      if (other.getImageId() != 0) {
        setImageId(other.getImageId());
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
      org.spin.grpc.util.GetResourceReferenceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.GetResourceReferenceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.spin.grpc.util.ClientRequest clientRequest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder> clientRequestBuilder_;
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public boolean hasClientRequest() {
      return clientRequestBuilder_ != null || clientRequest_ != null;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public org.spin.grpc.util.ClientRequest getClientRequest() {
      if (clientRequestBuilder_ == null) {
        return clientRequest_ == null ? org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
      } else {
        return clientRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public Builder setClientRequest(org.spin.grpc.util.ClientRequest value) {
      if (clientRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientRequest_ = value;
        onChanged();
      } else {
        clientRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public Builder setClientRequest(
        org.spin.grpc.util.ClientRequest.Builder builderForValue) {
      if (clientRequestBuilder_ == null) {
        clientRequest_ = builderForValue.build();
        onChanged();
      } else {
        clientRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public Builder mergeClientRequest(org.spin.grpc.util.ClientRequest value) {
      if (clientRequestBuilder_ == null) {
        if (clientRequest_ != null) {
          clientRequest_ =
            org.spin.grpc.util.ClientRequest.newBuilder(clientRequest_).mergeFrom(value).buildPartial();
        } else {
          clientRequest_ = value;
        }
        onChanged();
      } else {
        clientRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public Builder clearClientRequest() {
      if (clientRequestBuilder_ == null) {
        clientRequest_ = null;
        onChanged();
      } else {
        clientRequest_ = null;
        clientRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public org.spin.grpc.util.ClientRequest.Builder getClientRequestBuilder() {
      
      onChanged();
      return getClientRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder() {
      if (clientRequestBuilder_ != null) {
        return clientRequestBuilder_.getMessageOrBuilder();
      } else {
        return clientRequest_ == null ?
            org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
      }
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder> 
        getClientRequestFieldBuilder() {
      if (clientRequestBuilder_ == null) {
        clientRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder>(
                getClientRequest(),
                getParentForChildren(),
                isClean());
        clientRequest_ = null;
      }
      return clientRequestBuilder_;
    }

    private int imageId_ ;
    /**
     * <code>int32 imageId = 2;</code>
     */
    public int getImageId() {
      return imageId_;
    }
    /**
     * <code>int32 imageId = 2;</code>
     */
    public Builder setImageId(int value) {
      
      imageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 imageId = 2;</code>
     */
    public Builder clearImageId() {
      
      imageId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:data.GetResourceReferenceRequest)
  }

  // @@protoc_insertion_point(class_scope:data.GetResourceReferenceRequest)
  private static final org.spin.grpc.util.GetResourceReferenceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.GetResourceReferenceRequest();
  }

  public static org.spin.grpc.util.GetResourceReferenceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetResourceReferenceRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetResourceReferenceRequest>() {
    public GetResourceReferenceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetResourceReferenceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetResourceReferenceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetResourceReferenceRequest> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.GetResourceReferenceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
