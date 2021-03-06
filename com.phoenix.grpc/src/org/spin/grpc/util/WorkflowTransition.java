// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

/**
 * <pre>
 *	Workflow Transition
 * </pre>
 *
 * Protobuf type {@code data.WorkflowTransition}
 */
public  final class WorkflowTransition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.WorkflowTransition)
    WorkflowTransitionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkflowTransition.newBuilder() to construct.
  private WorkflowTransition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkflowTransition() {
    nodeNextUuid_ = "";
    description_ = "";
    isStdUserWorkflow_ = false;
    sequence_ = 0;
    workflowConditions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkflowTransition(
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

            nodeNextUuid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 24: {

            isStdUserWorkflow_ = input.readBool();
            break;
          }
          case 32: {

            sequence_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              workflowConditions_ = new java.util.ArrayList<org.spin.grpc.util.WorkflowCondition>();
              mutable_bitField0_ |= 0x00000010;
            }
            workflowConditions_.add(
                input.readMessage(org.spin.grpc.util.WorkflowCondition.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        workflowConditions_ = java.util.Collections.unmodifiableList(workflowConditions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_WorkflowTransition_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_WorkflowTransition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.WorkflowTransition.class, org.spin.grpc.util.WorkflowTransition.Builder.class);
  }

  private int bitField0_;
  public static final int NODENEXTUUID_FIELD_NUMBER = 1;
  private volatile java.lang.Object nodeNextUuid_;
  /**
   * <code>string nodeNextUuid = 1;</code>
   */
  public java.lang.String getNodeNextUuid() {
    java.lang.Object ref = nodeNextUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nodeNextUuid_ = s;
      return s;
    }
  }
  /**
   * <code>string nodeNextUuid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNodeNextUuidBytes() {
    java.lang.Object ref = nodeNextUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nodeNextUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 2;</code>
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
   * <code>string description = 2;</code>
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

  public static final int ISSTDUSERWORKFLOW_FIELD_NUMBER = 3;
  private boolean isStdUserWorkflow_;
  /**
   * <code>bool isStdUserWorkflow = 3;</code>
   */
  public boolean getIsStdUserWorkflow() {
    return isStdUserWorkflow_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 4;
  private int sequence_;
  /**
   * <code>int32 sequence = 4;</code>
   */
  public int getSequence() {
    return sequence_;
  }

  public static final int WORKFLOWCONDITIONS_FIELD_NUMBER = 5;
  private java.util.List<org.spin.grpc.util.WorkflowCondition> workflowConditions_;
  /**
   * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
   */
  public java.util.List<org.spin.grpc.util.WorkflowCondition> getWorkflowConditionsList() {
    return workflowConditions_;
  }
  /**
   * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.WorkflowConditionOrBuilder> 
      getWorkflowConditionsOrBuilderList() {
    return workflowConditions_;
  }
  /**
   * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
   */
  public int getWorkflowConditionsCount() {
    return workflowConditions_.size();
  }
  /**
   * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
   */
  public org.spin.grpc.util.WorkflowCondition getWorkflowConditions(int index) {
    return workflowConditions_.get(index);
  }
  /**
   * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
   */
  public org.spin.grpc.util.WorkflowConditionOrBuilder getWorkflowConditionsOrBuilder(
      int index) {
    return workflowConditions_.get(index);
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
    if (!getNodeNextUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nodeNextUuid_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (isStdUserWorkflow_ != false) {
      output.writeBool(3, isStdUserWorkflow_);
    }
    if (sequence_ != 0) {
      output.writeInt32(4, sequence_);
    }
    for (int i = 0; i < workflowConditions_.size(); i++) {
      output.writeMessage(5, workflowConditions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNodeNextUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nodeNextUuid_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (isStdUserWorkflow_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isStdUserWorkflow_);
    }
    if (sequence_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, sequence_);
    }
    for (int i = 0; i < workflowConditions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, workflowConditions_.get(i));
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
    if (!(obj instanceof org.spin.grpc.util.WorkflowTransition)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.WorkflowTransition other = (org.spin.grpc.util.WorkflowTransition) obj;

    boolean result = true;
    result = result && getNodeNextUuid()
        .equals(other.getNodeNextUuid());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && (getIsStdUserWorkflow()
        == other.getIsStdUserWorkflow());
    result = result && (getSequence()
        == other.getSequence());
    result = result && getWorkflowConditionsList()
        .equals(other.getWorkflowConditionsList());
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
    hash = (37 * hash) + NODENEXTUUID_FIELD_NUMBER;
    hash = (53 * hash) + getNodeNextUuid().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + ISSTDUSERWORKFLOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsStdUserWorkflow());
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + getSequence();
    if (getWorkflowConditionsCount() > 0) {
      hash = (37 * hash) + WORKFLOWCONDITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkflowConditionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.WorkflowTransition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.WorkflowTransition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.WorkflowTransition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.WorkflowTransition parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.WorkflowTransition prototype) {
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
   *	Workflow Transition
   * </pre>
   *
   * Protobuf type {@code data.WorkflowTransition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.WorkflowTransition)
      org.spin.grpc.util.WorkflowTransitionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_WorkflowTransition_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_WorkflowTransition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.WorkflowTransition.class, org.spin.grpc.util.WorkflowTransition.Builder.class);
    }

    // Construct using org.spin.grpc.util.WorkflowTransition.newBuilder()
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
        getWorkflowConditionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      nodeNextUuid_ = "";

      description_ = "";

      isStdUserWorkflow_ = false;

      sequence_ = 0;

      if (workflowConditionsBuilder_ == null) {
        workflowConditions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        workflowConditionsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_WorkflowTransition_descriptor;
    }

    public org.spin.grpc.util.WorkflowTransition getDefaultInstanceForType() {
      return org.spin.grpc.util.WorkflowTransition.getDefaultInstance();
    }

    public org.spin.grpc.util.WorkflowTransition build() {
      org.spin.grpc.util.WorkflowTransition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.WorkflowTransition buildPartial() {
      org.spin.grpc.util.WorkflowTransition result = new org.spin.grpc.util.WorkflowTransition(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.nodeNextUuid_ = nodeNextUuid_;
      result.description_ = description_;
      result.isStdUserWorkflow_ = isStdUserWorkflow_;
      result.sequence_ = sequence_;
      if (workflowConditionsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          workflowConditions_ = java.util.Collections.unmodifiableList(workflowConditions_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.workflowConditions_ = workflowConditions_;
      } else {
        result.workflowConditions_ = workflowConditionsBuilder_.build();
      }
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
      if (other instanceof org.spin.grpc.util.WorkflowTransition) {
        return mergeFrom((org.spin.grpc.util.WorkflowTransition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.WorkflowTransition other) {
      if (other == org.spin.grpc.util.WorkflowTransition.getDefaultInstance()) return this;
      if (!other.getNodeNextUuid().isEmpty()) {
        nodeNextUuid_ = other.nodeNextUuid_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getIsStdUserWorkflow() != false) {
        setIsStdUserWorkflow(other.getIsStdUserWorkflow());
      }
      if (other.getSequence() != 0) {
        setSequence(other.getSequence());
      }
      if (workflowConditionsBuilder_ == null) {
        if (!other.workflowConditions_.isEmpty()) {
          if (workflowConditions_.isEmpty()) {
            workflowConditions_ = other.workflowConditions_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureWorkflowConditionsIsMutable();
            workflowConditions_.addAll(other.workflowConditions_);
          }
          onChanged();
        }
      } else {
        if (!other.workflowConditions_.isEmpty()) {
          if (workflowConditionsBuilder_.isEmpty()) {
            workflowConditionsBuilder_.dispose();
            workflowConditionsBuilder_ = null;
            workflowConditions_ = other.workflowConditions_;
            bitField0_ = (bitField0_ & ~0x00000010);
            workflowConditionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWorkflowConditionsFieldBuilder() : null;
          } else {
            workflowConditionsBuilder_.addAllMessages(other.workflowConditions_);
          }
        }
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
      org.spin.grpc.util.WorkflowTransition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.WorkflowTransition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object nodeNextUuid_ = "";
    /**
     * <code>string nodeNextUuid = 1;</code>
     */
    public java.lang.String getNodeNextUuid() {
      java.lang.Object ref = nodeNextUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nodeNextUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nodeNextUuid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNodeNextUuidBytes() {
      java.lang.Object ref = nodeNextUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nodeNextUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nodeNextUuid = 1;</code>
     */
    public Builder setNodeNextUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nodeNextUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nodeNextUuid = 1;</code>
     */
    public Builder clearNodeNextUuid() {
      
      nodeNextUuid_ = getDefaultInstance().getNodeNextUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string nodeNextUuid = 1;</code>
     */
    public Builder setNodeNextUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nodeNextUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2;</code>
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
     * <code>string description = 2;</code>
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
     * <code>string description = 2;</code>
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
     * <code>string description = 2;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
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

    private boolean isStdUserWorkflow_ ;
    /**
     * <code>bool isStdUserWorkflow = 3;</code>
     */
    public boolean getIsStdUserWorkflow() {
      return isStdUserWorkflow_;
    }
    /**
     * <code>bool isStdUserWorkflow = 3;</code>
     */
    public Builder setIsStdUserWorkflow(boolean value) {
      
      isStdUserWorkflow_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isStdUserWorkflow = 3;</code>
     */
    public Builder clearIsStdUserWorkflow() {
      
      isStdUserWorkflow_ = false;
      onChanged();
      return this;
    }

    private int sequence_ ;
    /**
     * <code>int32 sequence = 4;</code>
     */
    public int getSequence() {
      return sequence_;
    }
    /**
     * <code>int32 sequence = 4;</code>
     */
    public Builder setSequence(int value) {
      
      sequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 sequence = 4;</code>
     */
    public Builder clearSequence() {
      
      sequence_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<org.spin.grpc.util.WorkflowCondition> workflowConditions_ =
      java.util.Collections.emptyList();
    private void ensureWorkflowConditionsIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        workflowConditions_ = new java.util.ArrayList<org.spin.grpc.util.WorkflowCondition>(workflowConditions_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.WorkflowCondition, org.spin.grpc.util.WorkflowCondition.Builder, org.spin.grpc.util.WorkflowConditionOrBuilder> workflowConditionsBuilder_;

    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public java.util.List<org.spin.grpc.util.WorkflowCondition> getWorkflowConditionsList() {
      if (workflowConditionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(workflowConditions_);
      } else {
        return workflowConditionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public int getWorkflowConditionsCount() {
      if (workflowConditionsBuilder_ == null) {
        return workflowConditions_.size();
      } else {
        return workflowConditionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public org.spin.grpc.util.WorkflowCondition getWorkflowConditions(int index) {
      if (workflowConditionsBuilder_ == null) {
        return workflowConditions_.get(index);
      } else {
        return workflowConditionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder setWorkflowConditions(
        int index, org.spin.grpc.util.WorkflowCondition value) {
      if (workflowConditionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowConditionsIsMutable();
        workflowConditions_.set(index, value);
        onChanged();
      } else {
        workflowConditionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder setWorkflowConditions(
        int index, org.spin.grpc.util.WorkflowCondition.Builder builderForValue) {
      if (workflowConditionsBuilder_ == null) {
        ensureWorkflowConditionsIsMutable();
        workflowConditions_.set(index, builderForValue.build());
        onChanged();
      } else {
        workflowConditionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder addWorkflowConditions(org.spin.grpc.util.WorkflowCondition value) {
      if (workflowConditionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowConditionsIsMutable();
        workflowConditions_.add(value);
        onChanged();
      } else {
        workflowConditionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder addWorkflowConditions(
        int index, org.spin.grpc.util.WorkflowCondition value) {
      if (workflowConditionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowConditionsIsMutable();
        workflowConditions_.add(index, value);
        onChanged();
      } else {
        workflowConditionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder addWorkflowConditions(
        org.spin.grpc.util.WorkflowCondition.Builder builderForValue) {
      if (workflowConditionsBuilder_ == null) {
        ensureWorkflowConditionsIsMutable();
        workflowConditions_.add(builderForValue.build());
        onChanged();
      } else {
        workflowConditionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder addWorkflowConditions(
        int index, org.spin.grpc.util.WorkflowCondition.Builder builderForValue) {
      if (workflowConditionsBuilder_ == null) {
        ensureWorkflowConditionsIsMutable();
        workflowConditions_.add(index, builderForValue.build());
        onChanged();
      } else {
        workflowConditionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder addAllWorkflowConditions(
        java.lang.Iterable<? extends org.spin.grpc.util.WorkflowCondition> values) {
      if (workflowConditionsBuilder_ == null) {
        ensureWorkflowConditionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, workflowConditions_);
        onChanged();
      } else {
        workflowConditionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder clearWorkflowConditions() {
      if (workflowConditionsBuilder_ == null) {
        workflowConditions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        workflowConditionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public Builder removeWorkflowConditions(int index) {
      if (workflowConditionsBuilder_ == null) {
        ensureWorkflowConditionsIsMutable();
        workflowConditions_.remove(index);
        onChanged();
      } else {
        workflowConditionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public org.spin.grpc.util.WorkflowCondition.Builder getWorkflowConditionsBuilder(
        int index) {
      return getWorkflowConditionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public org.spin.grpc.util.WorkflowConditionOrBuilder getWorkflowConditionsOrBuilder(
        int index) {
      if (workflowConditionsBuilder_ == null) {
        return workflowConditions_.get(index);  } else {
        return workflowConditionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.WorkflowConditionOrBuilder> 
         getWorkflowConditionsOrBuilderList() {
      if (workflowConditionsBuilder_ != null) {
        return workflowConditionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(workflowConditions_);
      }
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public org.spin.grpc.util.WorkflowCondition.Builder addWorkflowConditionsBuilder() {
      return getWorkflowConditionsFieldBuilder().addBuilder(
          org.spin.grpc.util.WorkflowCondition.getDefaultInstance());
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public org.spin.grpc.util.WorkflowCondition.Builder addWorkflowConditionsBuilder(
        int index) {
      return getWorkflowConditionsFieldBuilder().addBuilder(
          index, org.spin.grpc.util.WorkflowCondition.getDefaultInstance());
    }
    /**
     * <code>repeated .data.WorkflowCondition workflowConditions = 5;</code>
     */
    public java.util.List<org.spin.grpc.util.WorkflowCondition.Builder> 
         getWorkflowConditionsBuilderList() {
      return getWorkflowConditionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.WorkflowCondition, org.spin.grpc.util.WorkflowCondition.Builder, org.spin.grpc.util.WorkflowConditionOrBuilder> 
        getWorkflowConditionsFieldBuilder() {
      if (workflowConditionsBuilder_ == null) {
        workflowConditionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.WorkflowCondition, org.spin.grpc.util.WorkflowCondition.Builder, org.spin.grpc.util.WorkflowConditionOrBuilder>(
                workflowConditions_,
                ((bitField0_ & 0x00000010) == 0x00000010),
                getParentForChildren(),
                isClean());
        workflowConditions_ = null;
      }
      return workflowConditionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:data.WorkflowTransition)
  }

  // @@protoc_insertion_point(class_scope:data.WorkflowTransition)
  private static final org.spin.grpc.util.WorkflowTransition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.WorkflowTransition();
  }

  public static org.spin.grpc.util.WorkflowTransition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowTransition>
      PARSER = new com.google.protobuf.AbstractParser<WorkflowTransition>() {
    public WorkflowTransition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorkflowTransition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkflowTransition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowTransition> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.WorkflowTransition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

