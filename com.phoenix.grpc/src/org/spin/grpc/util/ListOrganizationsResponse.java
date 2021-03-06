// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core_functionality.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	List Organizations Response
 * </pre>
 *
 * Protobuf type {@code data.ListOrganizationsResponse}
 */
public  final class ListOrganizationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ListOrganizationsResponse)
    ListOrganizationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOrganizationsResponse.newBuilder() to construct.
  private ListOrganizationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOrganizationsResponse() {
    recordCount_ = 0L;
    organizations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListOrganizationsResponse(
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
              organizations_ = new java.util.ArrayList<org.spin.grpc.util.Organization>();
              mutable_bitField0_ |= 0x00000002;
            }
            organizations_.add(
                input.readMessage(org.spin.grpc.util.Organization.parser(), extensionRegistry));
            break;
          }
          case 34: {
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
        organizations_ = java.util.Collections.unmodifiableList(organizations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListOrganizationsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListOrganizationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.ListOrganizationsResponse.class, org.spin.grpc.util.ListOrganizationsResponse.Builder.class);
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

  public static final int ORGANIZATIONS_FIELD_NUMBER = 2;
  private java.util.List<org.spin.grpc.util.Organization> organizations_;
  /**
   * <code>repeated .data.Organization organizations = 2;</code>
   */
  public java.util.List<org.spin.grpc.util.Organization> getOrganizationsList() {
    return organizations_;
  }
  /**
   * <code>repeated .data.Organization organizations = 2;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.OrganizationOrBuilder> 
      getOrganizationsOrBuilderList() {
    return organizations_;
  }
  /**
   * <code>repeated .data.Organization organizations = 2;</code>
   */
  public int getOrganizationsCount() {
    return organizations_.size();
  }
  /**
   * <code>repeated .data.Organization organizations = 2;</code>
   */
  public org.spin.grpc.util.Organization getOrganizations(int index) {
    return organizations_.get(index);
  }
  /**
   * <code>repeated .data.Organization organizations = 2;</code>
   */
  public org.spin.grpc.util.OrganizationOrBuilder getOrganizationsOrBuilder(
      int index) {
    return organizations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 4;</code>
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
   * <code>string next_page_token = 4;</code>
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
    for (int i = 0; i < organizations_.size(); i++) {
      output.writeMessage(2, organizations_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nextPageToken_);
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
    for (int i = 0; i < organizations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, organizations_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nextPageToken_);
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
    if (!(obj instanceof org.spin.grpc.util.ListOrganizationsResponse)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.ListOrganizationsResponse other = (org.spin.grpc.util.ListOrganizationsResponse) obj;

    boolean result = true;
    result = result && (getRecordCount()
        == other.getRecordCount());
    result = result && getOrganizationsList()
        .equals(other.getOrganizationsList());
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
    if (getOrganizationsCount() > 0) {
      hash = (37 * hash) + ORGANIZATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOrganizationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.ListOrganizationsResponse parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.ListOrganizationsResponse prototype) {
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
   *	List Organizations Response
   * </pre>
   *
   * Protobuf type {@code data.ListOrganizationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ListOrganizationsResponse)
      org.spin.grpc.util.ListOrganizationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListOrganizationsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListOrganizationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.ListOrganizationsResponse.class, org.spin.grpc.util.ListOrganizationsResponse.Builder.class);
    }

    // Construct using org.spin.grpc.util.ListOrganizationsResponse.newBuilder()
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
        getOrganizationsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      recordCount_ = 0L;

      if (organizationsBuilder_ == null) {
        organizations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        organizationsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereCoreFunctionality.internal_static_data_ListOrganizationsResponse_descriptor;
    }

    public org.spin.grpc.util.ListOrganizationsResponse getDefaultInstanceForType() {
      return org.spin.grpc.util.ListOrganizationsResponse.getDefaultInstance();
    }

    public org.spin.grpc.util.ListOrganizationsResponse build() {
      org.spin.grpc.util.ListOrganizationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.ListOrganizationsResponse buildPartial() {
      org.spin.grpc.util.ListOrganizationsResponse result = new org.spin.grpc.util.ListOrganizationsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.recordCount_ = recordCount_;
      if (organizationsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          organizations_ = java.util.Collections.unmodifiableList(organizations_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.organizations_ = organizations_;
      } else {
        result.organizations_ = organizationsBuilder_.build();
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
      if (other instanceof org.spin.grpc.util.ListOrganizationsResponse) {
        return mergeFrom((org.spin.grpc.util.ListOrganizationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.ListOrganizationsResponse other) {
      if (other == org.spin.grpc.util.ListOrganizationsResponse.getDefaultInstance()) return this;
      if (other.getRecordCount() != 0L) {
        setRecordCount(other.getRecordCount());
      }
      if (organizationsBuilder_ == null) {
        if (!other.organizations_.isEmpty()) {
          if (organizations_.isEmpty()) {
            organizations_ = other.organizations_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOrganizationsIsMutable();
            organizations_.addAll(other.organizations_);
          }
          onChanged();
        }
      } else {
        if (!other.organizations_.isEmpty()) {
          if (organizationsBuilder_.isEmpty()) {
            organizationsBuilder_.dispose();
            organizationsBuilder_ = null;
            organizations_ = other.organizations_;
            bitField0_ = (bitField0_ & ~0x00000002);
            organizationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrganizationsFieldBuilder() : null;
          } else {
            organizationsBuilder_.addAllMessages(other.organizations_);
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
      org.spin.grpc.util.ListOrganizationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.ListOrganizationsResponse) e.getUnfinishedMessage();
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

    private java.util.List<org.spin.grpc.util.Organization> organizations_ =
      java.util.Collections.emptyList();
    private void ensureOrganizationsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        organizations_ = new java.util.ArrayList<org.spin.grpc.util.Organization>(organizations_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.Organization, org.spin.grpc.util.Organization.Builder, org.spin.grpc.util.OrganizationOrBuilder> organizationsBuilder_;

    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.Organization> getOrganizationsList() {
      if (organizationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(organizations_);
      } else {
        return organizationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public int getOrganizationsCount() {
      if (organizationsBuilder_ == null) {
        return organizations_.size();
      } else {
        return organizationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public org.spin.grpc.util.Organization getOrganizations(int index) {
      if (organizationsBuilder_ == null) {
        return organizations_.get(index);
      } else {
        return organizationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder setOrganizations(
        int index, org.spin.grpc.util.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.set(index, value);
        onChanged();
      } else {
        organizationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder setOrganizations(
        int index, org.spin.grpc.util.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.set(index, builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder addOrganizations(org.spin.grpc.util.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.add(value);
        onChanged();
      } else {
        organizationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder addOrganizations(
        int index, org.spin.grpc.util.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.add(index, value);
        onChanged();
      } else {
        organizationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder addOrganizations(
        org.spin.grpc.util.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.add(builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder addOrganizations(
        int index, org.spin.grpc.util.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.add(index, builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder addAllOrganizations(
        java.lang.Iterable<? extends org.spin.grpc.util.Organization> values) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, organizations_);
        onChanged();
      } else {
        organizationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder clearOrganizations() {
      if (organizationsBuilder_ == null) {
        organizations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        organizationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public Builder removeOrganizations(int index) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.remove(index);
        onChanged();
      } else {
        organizationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public org.spin.grpc.util.Organization.Builder getOrganizationsBuilder(
        int index) {
      return getOrganizationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public org.spin.grpc.util.OrganizationOrBuilder getOrganizationsOrBuilder(
        int index) {
      if (organizationsBuilder_ == null) {
        return organizations_.get(index);  } else {
        return organizationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.OrganizationOrBuilder> 
         getOrganizationsOrBuilderList() {
      if (organizationsBuilder_ != null) {
        return organizationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(organizations_);
      }
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public org.spin.grpc.util.Organization.Builder addOrganizationsBuilder() {
      return getOrganizationsFieldBuilder().addBuilder(
          org.spin.grpc.util.Organization.getDefaultInstance());
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public org.spin.grpc.util.Organization.Builder addOrganizationsBuilder(
        int index) {
      return getOrganizationsFieldBuilder().addBuilder(
          index, org.spin.grpc.util.Organization.getDefaultInstance());
    }
    /**
     * <code>repeated .data.Organization organizations = 2;</code>
     */
    public java.util.List<org.spin.grpc.util.Organization.Builder> 
         getOrganizationsBuilderList() {
      return getOrganizationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.Organization, org.spin.grpc.util.Organization.Builder, org.spin.grpc.util.OrganizationOrBuilder> 
        getOrganizationsFieldBuilder() {
      if (organizationsBuilder_ == null) {
        organizationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.Organization, org.spin.grpc.util.Organization.Builder, org.spin.grpc.util.OrganizationOrBuilder>(
                organizations_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        organizations_ = null;
      }
      return organizationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 4;</code>
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
     * <code>string next_page_token = 4;</code>
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
     * <code>string next_page_token = 4;</code>
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
     * <code>string next_page_token = 4;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:data.ListOrganizationsResponse)
  }

  // @@protoc_insertion_point(class_scope:data.ListOrganizationsResponse)
  private static final org.spin.grpc.util.ListOrganizationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.ListOrganizationsResponse();
  }

  public static org.spin.grpc.util.ListOrganizationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOrganizationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListOrganizationsResponse>() {
    public ListOrganizationsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListOrganizationsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListOrganizationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOrganizationsResponse> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.ListOrganizationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

