// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: point_of_sales.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Request for delete a order
 * </pre>
 *
 * Protobuf type {@code data.DeleteOrderLineRequest}
 */
public  final class DeleteOrderLineRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.DeleteOrderLineRequest)
    DeleteOrderLineRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteOrderLineRequest.newBuilder() to construct.
  private DeleteOrderLineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteOrderLineRequest() {
    orderLineUuid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteOrderLineRequest(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            orderLineUuid_ = s;
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
    return org.spin.grpc.util.ADempierePOS.internal_static_data_DeleteOrderLineRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempierePOS.internal_static_data_DeleteOrderLineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.DeleteOrderLineRequest.class, org.spin.grpc.util.DeleteOrderLineRequest.Builder.class);
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

  public static final int ORDERLINEUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object orderLineUuid_;
  /**
   * <code>string orderLineUuid = 2;</code>
   */
  public java.lang.String getOrderLineUuid() {
    java.lang.Object ref = orderLineUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderLineUuid_ = s;
      return s;
    }
  }
  /**
   * <code>string orderLineUuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOrderLineUuidBytes() {
    java.lang.Object ref = orderLineUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderLineUuid_ = b;
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
    if (clientRequest_ != null) {
      output.writeMessage(1, getClientRequest());
    }
    if (!getOrderLineUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orderLineUuid_);
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
    if (!getOrderLineUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orderLineUuid_);
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
    if (!(obj instanceof org.spin.grpc.util.DeleteOrderLineRequest)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.DeleteOrderLineRequest other = (org.spin.grpc.util.DeleteOrderLineRequest) obj;

    boolean result = true;
    result = result && (hasClientRequest() == other.hasClientRequest());
    if (hasClientRequest()) {
      result = result && getClientRequest()
          .equals(other.getClientRequest());
    }
    result = result && getOrderLineUuid()
        .equals(other.getOrderLineUuid());
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
    hash = (37 * hash) + ORDERLINEUUID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderLineUuid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.DeleteOrderLineRequest parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.DeleteOrderLineRequest prototype) {
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
   * Request for delete a order
   * </pre>
   *
   * Protobuf type {@code data.DeleteOrderLineRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.DeleteOrderLineRequest)
      org.spin.grpc.util.DeleteOrderLineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempierePOS.internal_static_data_DeleteOrderLineRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempierePOS.internal_static_data_DeleteOrderLineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.DeleteOrderLineRequest.class, org.spin.grpc.util.DeleteOrderLineRequest.Builder.class);
    }

    // Construct using org.spin.grpc.util.DeleteOrderLineRequest.newBuilder()
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
      orderLineUuid_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempierePOS.internal_static_data_DeleteOrderLineRequest_descriptor;
    }

    public org.spin.grpc.util.DeleteOrderLineRequest getDefaultInstanceForType() {
      return org.spin.grpc.util.DeleteOrderLineRequest.getDefaultInstance();
    }

    public org.spin.grpc.util.DeleteOrderLineRequest build() {
      org.spin.grpc.util.DeleteOrderLineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.DeleteOrderLineRequest buildPartial() {
      org.spin.grpc.util.DeleteOrderLineRequest result = new org.spin.grpc.util.DeleteOrderLineRequest(this);
      if (clientRequestBuilder_ == null) {
        result.clientRequest_ = clientRequest_;
      } else {
        result.clientRequest_ = clientRequestBuilder_.build();
      }
      result.orderLineUuid_ = orderLineUuid_;
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
      if (other instanceof org.spin.grpc.util.DeleteOrderLineRequest) {
        return mergeFrom((org.spin.grpc.util.DeleteOrderLineRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.DeleteOrderLineRequest other) {
      if (other == org.spin.grpc.util.DeleteOrderLineRequest.getDefaultInstance()) return this;
      if (other.hasClientRequest()) {
        mergeClientRequest(other.getClientRequest());
      }
      if (!other.getOrderLineUuid().isEmpty()) {
        orderLineUuid_ = other.orderLineUuid_;
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
      org.spin.grpc.util.DeleteOrderLineRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.DeleteOrderLineRequest) e.getUnfinishedMessage();
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

    private java.lang.Object orderLineUuid_ = "";
    /**
     * <code>string orderLineUuid = 2;</code>
     */
    public java.lang.String getOrderLineUuid() {
      java.lang.Object ref = orderLineUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderLineUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderLineUuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOrderLineUuidBytes() {
      java.lang.Object ref = orderLineUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderLineUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderLineUuid = 2;</code>
     */
    public Builder setOrderLineUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderLineUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderLineUuid = 2;</code>
     */
    public Builder clearOrderLineUuid() {
      
      orderLineUuid_ = getDefaultInstance().getOrderLineUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string orderLineUuid = 2;</code>
     */
    public Builder setOrderLineUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderLineUuid_ = value;
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


    // @@protoc_insertion_point(builder_scope:data.DeleteOrderLineRequest)
  }

  // @@protoc_insertion_point(class_scope:data.DeleteOrderLineRequest)
  private static final org.spin.grpc.util.DeleteOrderLineRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.DeleteOrderLineRequest();
  }

  public static org.spin.grpc.util.DeleteOrderLineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteOrderLineRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteOrderLineRequest>() {
    public DeleteOrderLineRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteOrderLineRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteOrderLineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteOrderLineRequest> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.DeleteOrderLineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

