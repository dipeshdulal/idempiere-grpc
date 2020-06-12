// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Access for Column
 * </pre>
 *
 * Protobuf type {@code access.ColumnAccess}
 */
public  final class ColumnAccess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:access.ColumnAccess)
    ColumnAccessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ColumnAccess.newBuilder() to construct.
  private ColumnAccess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ColumnAccess() {
    tableName_ = "";
    columnName_ = "";
    isExclude_ = false;
    isReadOnly_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ColumnAccess(
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

            tableName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            columnName_ = s;
            break;
          }
          case 24: {

            isExclude_ = input.readBool();
            break;
          }
          case 32: {

            isReadOnly_ = input.readBool();
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
    return org.spin.grpc.util.ADempiereAccess.internal_static_access_ColumnAccess_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereAccess.internal_static_access_ColumnAccess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ColumnAccess.class, org.spin.grpc.util.ColumnAccess.Builder.class);
  }

  public static final int TABLENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   * <code>string tableName = 1;</code>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <code>string tableName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMNNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object columnName_;
  /**
   * <code>string columnName = 2;</code>
   */
  public java.lang.String getColumnName() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      columnName_ = s;
      return s;
    }
  }
  /**
   * <code>string columnName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getColumnNameBytes() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      columnName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISEXCLUDE_FIELD_NUMBER = 3;
  private boolean isExclude_;
  /**
   * <code>bool isExclude = 3;</code>
   */
  public boolean getIsExclude() {
    return isExclude_;
  }

  public static final int ISREADONLY_FIELD_NUMBER = 4;
  private boolean isReadOnly_;
  /**
   * <code>bool isReadOnly = 4;</code>
   */
  public boolean getIsReadOnly() {
    return isReadOnly_;
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
    if (!getTableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    if (!getColumnNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, columnName_);
    }
    if (isExclude_ != false) {
      output.writeBool(3, isExclude_);
    }
    if (isReadOnly_ != false) {
      output.writeBool(4, isReadOnly_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
    }
    if (!getColumnNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, columnName_);
    }
    if (isExclude_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isExclude_);
    }
    if (isReadOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isReadOnly_);
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
    if (!(obj instanceof org.spin.grpc.util.ColumnAccess)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ColumnAccess other = (org.spin.grpc.util.ColumnAccess) obj;

    boolean result = true;
    result = result && getTableName()
        .equals(other.getTableName());
    result = result && getColumnName()
        .equals(other.getColumnName());
    result = result && (getIsExclude()
        == other.getIsExclude());
    result = result && (getIsReadOnly()
        == other.getIsReadOnly());
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
    hash = (37 * hash) + TABLENAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    hash = (37 * hash) + COLUMNNAME_FIELD_NUMBER;
    hash = (53 * hash) + getColumnName().hashCode();
    hash = (37 * hash) + ISEXCLUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsExclude());
    hash = (37 * hash) + ISREADONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReadOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ColumnAccess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ColumnAccess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ColumnAccess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ColumnAccess parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ColumnAccess prototype) {
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
   * Access for Column
   * </pre>
   *
   * Protobuf type {@code access.ColumnAccess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:access.ColumnAccess)
      org.spin.grpc.util.ColumnAccessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereAccess.internal_static_access_ColumnAccess_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereAccess.internal_static_access_ColumnAccess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ColumnAccess.class, org.spin.grpc.util.ColumnAccess.Builder.class);
    }

    // Construct using org.spin.grpc.util.ColumnAccess.newBuilder()
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
      tableName_ = "";

      columnName_ = "";

      isExclude_ = false;

      isReadOnly_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereAccess.internal_static_access_ColumnAccess_descriptor;
    }

    public org.spin.grpc.util.ColumnAccess getDefaultInstanceForType() {
      return org.spin.grpc.util.ColumnAccess.getDefaultInstance();
    }

    public org.spin.grpc.util.ColumnAccess build() {
      org.spin.grpc.util.ColumnAccess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ColumnAccess buildPartial() {
      org.spin.grpc.util.ColumnAccess result = new org.spin.grpc.util.ColumnAccess(this);
      result.tableName_ = tableName_;
      result.columnName_ = columnName_;
      result.isExclude_ = isExclude_;
      result.isReadOnly_ = isReadOnly_;
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
      if (other instanceof org.spin.grpc.util.ColumnAccess) {
        return mergeFrom((org.spin.grpc.util.ColumnAccess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ColumnAccess other) {
      if (other == org.spin.grpc.util.ColumnAccess.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (!other.getColumnName().isEmpty()) {
        columnName_ = other.columnName_;
        onChanged();
      }
      if (other.getIsExclude() != false) {
        setIsExclude(other.getIsExclude());
      }
      if (other.getIsReadOnly() != false) {
        setIsReadOnly(other.getIsReadOnly());
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
      org.spin.grpc.util.ColumnAccess parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ColumnAccess) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tableName_ = "";
    /**
     * <code>string tableName = 1;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tableName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tableName = 1;</code>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tableName = 1;</code>
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>string tableName = 1;</code>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tableName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object columnName_ = "";
    /**
     * <code>string columnName = 2;</code>
     */
    public java.lang.String getColumnName() {
      java.lang.Object ref = columnName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        columnName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string columnName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getColumnNameBytes() {
      java.lang.Object ref = columnName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        columnName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string columnName = 2;</code>
     */
    public Builder setColumnName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      columnName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string columnName = 2;</code>
     */
    public Builder clearColumnName() {
      
      columnName_ = getDefaultInstance().getColumnName();
      onChanged();
      return this;
    }
    /**
     * <code>string columnName = 2;</code>
     */
    public Builder setColumnNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      columnName_ = value;
      onChanged();
      return this;
    }

    private boolean isExclude_ ;
    /**
     * <code>bool isExclude = 3;</code>
     */
    public boolean getIsExclude() {
      return isExclude_;
    }
    /**
     * <code>bool isExclude = 3;</code>
     */
    public Builder setIsExclude(boolean value) {
      
      isExclude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isExclude = 3;</code>
     */
    public Builder clearIsExclude() {
      
      isExclude_ = false;
      onChanged();
      return this;
    }

    private boolean isReadOnly_ ;
    /**
     * <code>bool isReadOnly = 4;</code>
     */
    public boolean getIsReadOnly() {
      return isReadOnly_;
    }
    /**
     * <code>bool isReadOnly = 4;</code>
     */
    public Builder setIsReadOnly(boolean value) {
      
      isReadOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isReadOnly = 4;</code>
     */
    public Builder clearIsReadOnly() {
      
      isReadOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:access.ColumnAccess)
  }

  // @@protoc_insertion_point(class_scope:access.ColumnAccess)
  private static final org.spin.grpc.util.ColumnAccess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ColumnAccess();
  }

  public static org.spin.grpc.util.ColumnAccess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ColumnAccess>
      PARSER = new com.google.protobuf.AbstractParser<ColumnAccess>() {
    public ColumnAccess parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ColumnAccess(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ColumnAccess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ColumnAccess> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ColumnAccess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

