// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enrollment.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Reset Password Response
 * </pre>
 *
 * Protobuf type {@code enrollment.ActivateUserResponse}
 */
public  final class ActivateUserResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:enrollment.ActivateUserResponse)
    ActivateUserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActivateUserResponse.newBuilder() to construct.
  private ActivateUserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActivateUserResponse() {
    responseType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ActivateUserResponse(
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
            int rawValue = input.readEnum();

            responseType_ = rawValue;
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
    return org.spin.grpc.util.Enrollment.internal_static_enrollment_ActivateUserResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.Enrollment.internal_static_enrollment_ActivateUserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ActivateUserResponse.class, org.spin.grpc.util.ActivateUserResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code enrollment.ActivateUserResponse.ResponseType}
   */
  public enum ResponseType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OK = 0;</code>
     */
    OK(0),
    /**
     * <code>TOKEN_NOT_FOUND = 2;</code>
     */
    TOKEN_NOT_FOUND(2),
    /**
     * <code>ERROR = 3;</code>
     */
    ERROR(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;
    /**
     * <code>TOKEN_NOT_FOUND = 2;</code>
     */
    public static final int TOKEN_NOT_FOUND_VALUE = 2;
    /**
     * <code>ERROR = 3;</code>
     */
    public static final int ERROR_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResponseType valueOf(int value) {
      return forNumber(value);
    }

    public static ResponseType forNumber(int value) {
      switch (value) {
        case 0: return OK;
        case 2: return TOKEN_NOT_FOUND;
        case 3: return ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResponseType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResponseType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResponseType>() {
            public ResponseType findValueByNumber(int number) {
              return ResponseType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.spin.grpc.util.ActivateUserResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResponseType[] VALUES = values();

    public static ResponseType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ResponseType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:enrollment.ActivateUserResponse.ResponseType)
  }

  public static final int RESPONSETYPE_FIELD_NUMBER = 1;
  private int responseType_;
  /**
   * <code>.enrollment.ActivateUserResponse.ResponseType responseType = 1;</code>
   */
  public int getResponseTypeValue() {
    return responseType_;
  }
  /**
   * <code>.enrollment.ActivateUserResponse.ResponseType responseType = 1;</code>
   */
  public org.spin.grpc.util.ActivateUserResponse.ResponseType getResponseType() {
    org.spin.grpc.util.ActivateUserResponse.ResponseType result = org.spin.grpc.util.ActivateUserResponse.ResponseType.valueOf(responseType_);
    return result == null ? org.spin.grpc.util.ActivateUserResponse.ResponseType.UNRECOGNIZED : result;
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
    if (responseType_ != org.spin.grpc.util.ActivateUserResponse.ResponseType.OK.getNumber()) {
      output.writeEnum(1, responseType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseType_ != org.spin.grpc.util.ActivateUserResponse.ResponseType.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, responseType_);
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
    if (!(obj instanceof org.spin.grpc.util.ActivateUserResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ActivateUserResponse other = (org.spin.grpc.util.ActivateUserResponse) obj;

    boolean result = true;
    result = result && responseType_ == other.responseType_;
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
    hash = (37 * hash) + RESPONSETYPE_FIELD_NUMBER;
    hash = (53 * hash) + responseType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ActivateUserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ActivateUserResponse parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ActivateUserResponse prototype) {
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
   * Reset Password Response
   * </pre>
   *
   * Protobuf type {@code enrollment.ActivateUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:enrollment.ActivateUserResponse)
      org.spin.grpc.util.ActivateUserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.Enrollment.internal_static_enrollment_ActivateUserResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.Enrollment.internal_static_enrollment_ActivateUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ActivateUserResponse.class, org.spin.grpc.util.ActivateUserResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ActivateUserResponse.newBuilder()
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
      responseType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.Enrollment.internal_static_enrollment_ActivateUserResponse_descriptor;
    }

    public org.spin.grpc.util.ActivateUserResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ActivateUserResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ActivateUserResponse build() {
      org.spin.grpc.util.ActivateUserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ActivateUserResponse buildPartial() {
      org.spin.grpc.util.ActivateUserResponse result = new org.spin.grpc.util.ActivateUserResponse(this);
      result.responseType_ = responseType_;
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
      if (other instanceof org.spin.grpc.util.ActivateUserResponse) {
        return mergeFrom((org.spin.grpc.util.ActivateUserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ActivateUserResponse other) {
      if (other == org.spin.grpc.util.ActivateUserResponse.getDefaultInstance()) return this;
      if (other.responseType_ != 0) {
        setResponseTypeValue(other.getResponseTypeValue());
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
      org.spin.grpc.util.ActivateUserResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ActivateUserResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int responseType_ = 0;
    /**
     * <code>.enrollment.ActivateUserResponse.ResponseType responseType = 1;</code>
     */
    public int getResponseTypeValue() {
      return responseType_;
    }
    /**
     * <code>.enrollment.ActivateUserResponse.ResponseType responseType = 1;</code>
     */
    public Builder setResponseTypeValue(int value) {
      responseType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.enrollment.ActivateUserResponse.ResponseType responseType = 1;</code>
     */
    public org.spin.grpc.util.ActivateUserResponse.ResponseType getResponseType() {
      org.spin.grpc.util.ActivateUserResponse.ResponseType result = org.spin.grpc.util.ActivateUserResponse.ResponseType.valueOf(responseType_);
      return result == null ? org.spin.grpc.util.ActivateUserResponse.ResponseType.UNRECOGNIZED : result;
    }
    /**
     * <code>.enrollment.ActivateUserResponse.ResponseType responseType = 1;</code>
     */
    public Builder setResponseType(org.spin.grpc.util.ActivateUserResponse.ResponseType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      responseType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.enrollment.ActivateUserResponse.ResponseType responseType = 1;</code>
     */
    public Builder clearResponseType() {
      
      responseType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:enrollment.ActivateUserResponse)
  }

  // @@protoc_insertion_point(class_scope:enrollment.ActivateUserResponse)
  private static final org.spin.grpc.util.ActivateUserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ActivateUserResponse();
  }

  public static org.spin.grpc.util.ActivateUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActivateUserResponse>
      PARSER = new com.google.protobuf.AbstractParser<ActivateUserResponse>() {
    public ActivateUserResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivateUserResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ActivateUserResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActivateUserResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ActivateUserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

