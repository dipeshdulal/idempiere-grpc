// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface WorkflowConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.WorkflowCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 sequence = 1;</code>
   */
  int getSequence();

  /**
   * <code>string columnName = 2;</code>
   */
  java.lang.String getColumnName();
  /**
   * <code>string columnName = 2;</code>
   */
  com.google.protobuf.ByteString
      getColumnNameBytes();

  /**
   * <code>string value = 3;</code>
   */
  java.lang.String getValue();
  /**
   * <code>string value = 3;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>.data.WorkflowCondition.ConditionType conditionType = 4;</code>
   */
  int getConditionTypeValue();
  /**
   * <code>.data.WorkflowCondition.ConditionType conditionType = 4;</code>
   */
  org.spin.grpc.util.WorkflowCondition.ConditionType getConditionType();

  /**
   * <code>.data.WorkflowCondition.Operation operation = 5;</code>
   */
  int getOperationValue();
  /**
   * <code>.data.WorkflowCondition.Operation operation = 5;</code>
   */
  org.spin.grpc.util.WorkflowCondition.Operation getOperation();
}
