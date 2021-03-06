// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base_data_type.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Translations Item
 * </pre>
 *
 * Protobuf type {@code data.Translation}
 */
public  final class Translation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.Translation)
    TranslationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Translation.newBuilder() to construct.
  private Translation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Translation() {
    language_ = "";
    translationUuid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Translation(
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

            language_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            translationUuid_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              values_ = com.google.protobuf.MapField.newMapField(
                  ValuesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<java.lang.String, org.spin.grpc.util.Value>
            values__ = input.readMessage(
                ValuesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            values_.getMutableMap().put(
                values__.getKey(), values__.getValue());
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
    return org.spin.grpc.util.ADempiereBase.internal_static_data_Translation_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetValues();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereBase.internal_static_data_Translation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.Translation.class, org.spin.grpc.util.Translation.Builder.class);
  }

  private int bitField0_;
  public static final int LANGUAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object language_;
  /**
   * <code>string language = 1;</code>
   */
  public java.lang.String getLanguage() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      language_ = s;
      return s;
    }
  }
  /**
   * <code>string language = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLanguageBytes() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      language_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSLATIONUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object translationUuid_;
  /**
   * <code>string translationUuid = 2;</code>
   */
  public java.lang.String getTranslationUuid() {
    java.lang.Object ref = translationUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      translationUuid_ = s;
      return s;
    }
  }
  /**
   * <code>string translationUuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTranslationUuidBytes() {
    java.lang.Object ref = translationUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      translationUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 3;
  private static final class ValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.spin.grpc.util.Value> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.spin.grpc.util.Value>newDefaultInstance(
                org.spin.grpc.util.ADempiereBase.internal_static_data_Translation_ValuesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.spin.grpc.util.Value.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, org.spin.grpc.util.Value> values_;
  private com.google.protobuf.MapField<java.lang.String, org.spin.grpc.util.Value>
  internalGetValues() {
    if (values_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValuesDefaultEntryHolder.defaultEntry);
    }
    return values_;
  }

  public int getValuesCount() {
    return internalGetValues().getMap().size();
  }
  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */

  public boolean containsValues(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetValues().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.spin.grpc.util.Value> getValues() {
    return getValuesMap();
  }
  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */

  public java.util.Map<java.lang.String, org.spin.grpc.util.Value> getValuesMap() {
    return internalGetValues().getMap();
  }
  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */

  public org.spin.grpc.util.Value getValuesOrDefault(
      java.lang.String key,
      org.spin.grpc.util.Value defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.spin.grpc.util.Value> map =
        internalGetValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */

  public org.spin.grpc.util.Value getValuesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.spin.grpc.util.Value> map =
        internalGetValues().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getLanguageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, language_);
    }
    if (!getTranslationUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, translationUuid_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetValues(),
        ValuesDefaultEntryHolder.defaultEntry,
        3);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLanguageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, language_);
    }
    if (!getTranslationUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, translationUuid_);
    }
    for (java.util.Map.Entry<java.lang.String, org.spin.grpc.util.Value> entry
         : internalGetValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.spin.grpc.util.Value>
      values__ = ValuesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, values__);
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
    if (!(obj instanceof org.spin.grpc.util.Translation)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.Translation other = (org.spin.grpc.util.Translation) obj;

    boolean result = true;
    result = result && getLanguage()
        .equals(other.getLanguage());
    result = result && getTranslationUuid()
        .equals(other.getTranslationUuid());
    result = result && internalGetValues().equals(
        other.internalGetValues());
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
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguage().hashCode();
    hash = (37 * hash) + TRANSLATIONUUID_FIELD_NUMBER;
    hash = (53 * hash) + getTranslationUuid().hashCode();
    if (!internalGetValues().getMap().isEmpty()) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetValues().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.Translation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.Translation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.Translation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.Translation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.Translation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.Translation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.Translation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.Translation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.Translation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.Translation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.Translation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.Translation parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.Translation prototype) {
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
   * Translations Item
   * </pre>
   *
   * Protobuf type {@code data.Translation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.Translation)
      org.spin.grpc.util.TranslationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereBase.internal_static_data_Translation_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereBase.internal_static_data_Translation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.Translation.class, org.spin.grpc.util.Translation.Builder.class);
    }

    // Construct using org.spin.grpc.util.Translation.newBuilder()
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
      language_ = "";

      translationUuid_ = "";

      internalGetMutableValues().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereBase.internal_static_data_Translation_descriptor;
    }

    public org.spin.grpc.util.Translation getDefaultInstanceForType() {
      return org.spin.grpc.util.Translation.getDefaultInstance();
    }

    public org.spin.grpc.util.Translation build() {
      org.spin.grpc.util.Translation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.Translation buildPartial() {
      org.spin.grpc.util.Translation result = new org.spin.grpc.util.Translation(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.language_ = language_;
      result.translationUuid_ = translationUuid_;
      result.values_ = internalGetValues();
      result.values_.makeImmutable();
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
      if (other instanceof org.spin.grpc.util.Translation) {
        return mergeFrom((org.spin.grpc.util.Translation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.Translation other) {
      if (other == org.spin.grpc.util.Translation.getDefaultInstance()) return this;
      if (!other.getLanguage().isEmpty()) {
        language_ = other.language_;
        onChanged();
      }
      if (!other.getTranslationUuid().isEmpty()) {
        translationUuid_ = other.translationUuid_;
        onChanged();
      }
      internalGetMutableValues().mergeFrom(
          other.internalGetValues());
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
      org.spin.grpc.util.Translation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.Translation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object language_ = "";
    /**
     * <code>string language = 1;</code>
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string language = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string language = 1;</code>
     */
    public Builder setLanguage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string language = 1;</code>
     */
    public Builder clearLanguage() {
      
      language_ = getDefaultInstance().getLanguage();
      onChanged();
      return this;
    }
    /**
     * <code>string language = 1;</code>
     */
    public Builder setLanguageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      language_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object translationUuid_ = "";
    /**
     * <code>string translationUuid = 2;</code>
     */
    public java.lang.String getTranslationUuid() {
      java.lang.Object ref = translationUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        translationUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string translationUuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTranslationUuidBytes() {
      java.lang.Object ref = translationUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        translationUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string translationUuid = 2;</code>
     */
    public Builder setTranslationUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      translationUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string translationUuid = 2;</code>
     */
    public Builder clearTranslationUuid() {
      
      translationUuid_ = getDefaultInstance().getTranslationUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string translationUuid = 2;</code>
     */
    public Builder setTranslationUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      translationUuid_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, org.spin.grpc.util.Value> values_;
    private com.google.protobuf.MapField<java.lang.String, org.spin.grpc.util.Value>
    internalGetValues() {
      if (values_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      return values_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.spin.grpc.util.Value>
    internalGetMutableValues() {
      onChanged();;
      if (values_ == null) {
        values_ = com.google.protobuf.MapField.newMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      if (!values_.isMutable()) {
        values_ = values_.copy();
      }
      return values_;
    }

    public int getValuesCount() {
      return internalGetValues().getMap().size();
    }
    /**
     * <code>map&lt;string, .data.Value&gt; values = 3;</code>
     */

    public boolean containsValues(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetValues().getMap().containsKey(key);
    }
    /**
     * Use {@link #getValuesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.spin.grpc.util.Value> getValues() {
      return getValuesMap();
    }
    /**
     * <code>map&lt;string, .data.Value&gt; values = 3;</code>
     */

    public java.util.Map<java.lang.String, org.spin.grpc.util.Value> getValuesMap() {
      return internalGetValues().getMap();
    }
    /**
     * <code>map&lt;string, .data.Value&gt; values = 3;</code>
     */

    public org.spin.grpc.util.Value getValuesOrDefault(
        java.lang.String key,
        org.spin.grpc.util.Value defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.spin.grpc.util.Value> map =
          internalGetValues().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .data.Value&gt; values = 3;</code>
     */

    public org.spin.grpc.util.Value getValuesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.spin.grpc.util.Value> map =
          internalGetValues().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearValues() {
      internalGetMutableValues().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .data.Value&gt; values = 3;</code>
     */

    public Builder removeValues(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableValues().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.spin.grpc.util.Value>
    getMutableValues() {
      return internalGetMutableValues().getMutableMap();
    }
    /**
     * <code>map&lt;string, .data.Value&gt; values = 3;</code>
     */
    public Builder putValues(
        java.lang.String key,
        org.spin.grpc.util.Value value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableValues().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .data.Value&gt; values = 3;</code>
     */

    public Builder putAllValues(
        java.util.Map<java.lang.String, org.spin.grpc.util.Value> values) {
      internalGetMutableValues().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:data.Translation)
  }

  // @@protoc_insertion_point(class_scope:data.Translation)
  private static final org.spin.grpc.util.Translation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.Translation();
  }

  public static org.spin.grpc.util.Translation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Translation>
      PARSER = new com.google.protobuf.AbstractParser<Translation>() {
    public Translation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Translation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Translation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Translation> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.Translation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

