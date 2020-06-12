// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Recent Item
 * </pre>
 *
 * Protobuf type {@code data.Favorite}
 */
public  final class Favorite extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.Favorite)
    FavoriteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Favorite.newBuilder() to construct.
  private Favorite(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Favorite() {
    menuUuid_ = "";
    menuName_ = "";
    menuDescription_ = "";
    referenceUuid_ = "";
    action_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Favorite(
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

            menuUuid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            menuName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            menuDescription_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            referenceUuid_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            action_ = s;
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
    return org.spin.grpc.util.ADempiereData.internal_static_data_Favorite_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_Favorite_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.Favorite.class, org.spin.grpc.util.Favorite.Builder.class);
  }

  public static final int MENUUUID_FIELD_NUMBER = 1;
  private volatile java.lang.Object menuUuid_;
  /**
   * <code>string menuUuid = 1;</code>
   */
  public java.lang.String getMenuUuid() {
    java.lang.Object ref = menuUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      menuUuid_ = s;
      return s;
    }
  }
  /**
   * <code>string menuUuid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMenuUuidBytes() {
    java.lang.Object ref = menuUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      menuUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MENUNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object menuName_;
  /**
   * <code>string menuName = 2;</code>
   */
  public java.lang.String getMenuName() {
    java.lang.Object ref = menuName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      menuName_ = s;
      return s;
    }
  }
  /**
   * <code>string menuName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMenuNameBytes() {
    java.lang.Object ref = menuName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      menuName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MENUDESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object menuDescription_;
  /**
   * <code>string menuDescription = 3;</code>
   */
  public java.lang.String getMenuDescription() {
    java.lang.Object ref = menuDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      menuDescription_ = s;
      return s;
    }
  }
  /**
   * <code>string menuDescription = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMenuDescriptionBytes() {
    java.lang.Object ref = menuDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      menuDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCEUUID_FIELD_NUMBER = 4;
  private volatile java.lang.Object referenceUuid_;
  /**
   * <code>string referenceUuid = 4;</code>
   */
  public java.lang.String getReferenceUuid() {
    java.lang.Object ref = referenceUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceUuid_ = s;
      return s;
    }
  }
  /**
   * <code>string referenceUuid = 4;</code>
   */
  public com.google.protobuf.ByteString
      getReferenceUuidBytes() {
    java.lang.Object ref = referenceUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 5;
  private volatile java.lang.Object action_;
  /**
   * <code>string action = 5;</code>
   */
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   * <code>string action = 5;</code>
   */
  public com.google.protobuf.ByteString
      getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      action_ = b;
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
    if (!getMenuUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, menuUuid_);
    }
    if (!getMenuNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, menuName_);
    }
    if (!getMenuDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, menuDescription_);
    }
    if (!getReferenceUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, referenceUuid_);
    }
    if (!getActionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, action_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMenuUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, menuUuid_);
    }
    if (!getMenuNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, menuName_);
    }
    if (!getMenuDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, menuDescription_);
    }
    if (!getReferenceUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, referenceUuid_);
    }
    if (!getActionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, action_);
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
    if (!(obj instanceof org.spin.grpc.util.Favorite)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.Favorite other = (org.spin.grpc.util.Favorite) obj;

    boolean result = true;
    result = result && getMenuUuid()
        .equals(other.getMenuUuid());
    result = result && getMenuName()
        .equals(other.getMenuName());
    result = result && getMenuDescription()
        .equals(other.getMenuDescription());
    result = result && getReferenceUuid()
        .equals(other.getReferenceUuid());
    result = result && getAction()
        .equals(other.getAction());
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
    hash = (37 * hash) + MENUUUID_FIELD_NUMBER;
    hash = (53 * hash) + getMenuUuid().hashCode();
    hash = (37 * hash) + MENUNAME_FIELD_NUMBER;
    hash = (53 * hash) + getMenuName().hashCode();
    hash = (37 * hash) + MENUDESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getMenuDescription().hashCode();
    hash = (37 * hash) + REFERENCEUUID_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceUuid().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.Favorite parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.Favorite parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.Favorite parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.Favorite parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.Favorite parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.Favorite parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.Favorite parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.Favorite parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.Favorite parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.Favorite parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.Favorite parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.Favorite parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.Favorite prototype) {
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
   * Recent Item
   * </pre>
   *
   * Protobuf type {@code data.Favorite}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.Favorite)
      org.spin.grpc.util.FavoriteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_Favorite_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_Favorite_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.Favorite.class, org.spin.grpc.util.Favorite.Builder.class);
    }

    // Construct using org.spin.grpc.util.Favorite.newBuilder()
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
      menuUuid_ = "";

      menuName_ = "";

      menuDescription_ = "";

      referenceUuid_ = "";

      action_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_Favorite_descriptor;
    }

    public org.spin.grpc.util.Favorite getDefaultInstanceForType() {
      return org.spin.grpc.util.Favorite.getDefaultInstance();
    }

    public org.spin.grpc.util.Favorite build() {
      org.spin.grpc.util.Favorite result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.Favorite buildPartial() {
      org.spin.grpc.util.Favorite result = new org.spin.grpc.util.Favorite(this);
      result.menuUuid_ = menuUuid_;
      result.menuName_ = menuName_;
      result.menuDescription_ = menuDescription_;
      result.referenceUuid_ = referenceUuid_;
      result.action_ = action_;
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
      if (other instanceof org.spin.grpc.util.Favorite) {
        return mergeFrom((org.spin.grpc.util.Favorite)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.Favorite other) {
      if (other == org.spin.grpc.util.Favorite.getDefaultInstance()) return this;
      if (!other.getMenuUuid().isEmpty()) {
        menuUuid_ = other.menuUuid_;
        onChanged();
      }
      if (!other.getMenuName().isEmpty()) {
        menuName_ = other.menuName_;
        onChanged();
      }
      if (!other.getMenuDescription().isEmpty()) {
        menuDescription_ = other.menuDescription_;
        onChanged();
      }
      if (!other.getReferenceUuid().isEmpty()) {
        referenceUuid_ = other.referenceUuid_;
        onChanged();
      }
      if (!other.getAction().isEmpty()) {
        action_ = other.action_;
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
      org.spin.grpc.util.Favorite parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.Favorite) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object menuUuid_ = "";
    /**
     * <code>string menuUuid = 1;</code>
     */
    public java.lang.String getMenuUuid() {
      java.lang.Object ref = menuUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        menuUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string menuUuid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMenuUuidBytes() {
      java.lang.Object ref = menuUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        menuUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string menuUuid = 1;</code>
     */
    public Builder setMenuUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      menuUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string menuUuid = 1;</code>
     */
    public Builder clearMenuUuid() {
      
      menuUuid_ = getDefaultInstance().getMenuUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string menuUuid = 1;</code>
     */
    public Builder setMenuUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      menuUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object menuName_ = "";
    /**
     * <code>string menuName = 2;</code>
     */
    public java.lang.String getMenuName() {
      java.lang.Object ref = menuName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        menuName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string menuName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMenuNameBytes() {
      java.lang.Object ref = menuName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        menuName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string menuName = 2;</code>
     */
    public Builder setMenuName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      menuName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string menuName = 2;</code>
     */
    public Builder clearMenuName() {
      
      menuName_ = getDefaultInstance().getMenuName();
      onChanged();
      return this;
    }
    /**
     * <code>string menuName = 2;</code>
     */
    public Builder setMenuNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      menuName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object menuDescription_ = "";
    /**
     * <code>string menuDescription = 3;</code>
     */
    public java.lang.String getMenuDescription() {
      java.lang.Object ref = menuDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        menuDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string menuDescription = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMenuDescriptionBytes() {
      java.lang.Object ref = menuDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        menuDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string menuDescription = 3;</code>
     */
    public Builder setMenuDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      menuDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string menuDescription = 3;</code>
     */
    public Builder clearMenuDescription() {
      
      menuDescription_ = getDefaultInstance().getMenuDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string menuDescription = 3;</code>
     */
    public Builder setMenuDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      menuDescription_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object referenceUuid_ = "";
    /**
     * <code>string referenceUuid = 4;</code>
     */
    public java.lang.String getReferenceUuid() {
      java.lang.Object ref = referenceUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string referenceUuid = 4;</code>
     */
    public com.google.protobuf.ByteString
        getReferenceUuidBytes() {
      java.lang.Object ref = referenceUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string referenceUuid = 4;</code>
     */
    public Builder setReferenceUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string referenceUuid = 4;</code>
     */
    public Builder clearReferenceUuid() {
      
      referenceUuid_ = getDefaultInstance().getReferenceUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string referenceUuid = 4;</code>
     */
    public Builder setReferenceUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      referenceUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object action_ = "";
    /**
     * <code>string action = 5;</code>
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string action = 5;</code>
     */
    public com.google.protobuf.ByteString
        getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string action = 5;</code>
     */
    public Builder setAction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string action = 5;</code>
     */
    public Builder clearAction() {
      
      action_ = getDefaultInstance().getAction();
      onChanged();
      return this;
    }
    /**
     * <code>string action = 5;</code>
     */
    public Builder setActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      action_ = value;
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


    // @@protoc_insertion_point(builder_scope:data.Favorite)
  }

  // @@protoc_insertion_point(class_scope:data.Favorite)
  private static final org.spin.grpc.util.Favorite DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.Favorite();
  }

  public static org.spin.grpc.util.Favorite getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Favorite>
      PARSER = new com.google.protobuf.AbstractParser<Favorite>() {
    public Favorite parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Favorite(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Favorite> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Favorite> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.Favorite getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

