// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface WorkflowEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.WorkflowEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nodeUuid = 1;</code>
   */
  java.lang.String getNodeUuid();
  /**
   * <code>string nodeUuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getNodeUuidBytes();

  /**
   * <code>string nodeName = 2;</code>
   */
  java.lang.String getNodeName();
  /**
   * <code>string nodeName = 2;</code>
   */
  com.google.protobuf.ByteString
      getNodeNameBytes();

  /**
   * <code>int32 recordId = 3;</code>
   */
  int getRecordId();

  /**
   * <code>string tableName = 4;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>string tableName = 4;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>string userUuid = 5;</code>
   */
  java.lang.String getUserUuid();
  /**
   * <code>string userUuid = 5;</code>
   */
  com.google.protobuf.ByteString
      getUserUuidBytes();

  /**
   * <code>string userName = 6;</code>
   */
  java.lang.String getUserName();
  /**
   * <code>string userName = 6;</code>
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string responsibleUuid = 7;</code>
   */
  java.lang.String getResponsibleUuid();
  /**
   * <code>string responsibleUuid = 7;</code>
   */
  com.google.protobuf.ByteString
      getResponsibleUuidBytes();

  /**
   * <code>string responsibleName = 8;</code>
   */
  java.lang.String getResponsibleName();
  /**
   * <code>string responsibleName = 8;</code>
   */
  com.google.protobuf.ByteString
      getResponsibleNameBytes();

  /**
   * <code>string textMessage = 9;</code>
   */
  java.lang.String getTextMessage();
  /**
   * <code>string textMessage = 9;</code>
   */
  com.google.protobuf.ByteString
      getTextMessageBytes();

  /**
   * <code>int64 timeElapsed = 10;</code>
   */
  long getTimeElapsed();

  /**
   * <code>string attributeName = 11;</code>
   */
  java.lang.String getAttributeName();
  /**
   * <code>string attributeName = 11;</code>
   */
  com.google.protobuf.ByteString
      getAttributeNameBytes();

  /**
   * <code>string oldValue = 12;</code>
   */
  java.lang.String getOldValue();
  /**
   * <code>string oldValue = 12;</code>
   */
  com.google.protobuf.ByteString
      getOldValueBytes();

  /**
   * <code>string newValue = 13;</code>
   */
  java.lang.String getNewValue();
  /**
   * <code>string newValue = 13;</code>
   */
  com.google.protobuf.ByteString
      getNewValueBytes();

  /**
   * <code>.data.WorkflowEvent.WorkflowState workflowState = 14;</code>
   */
  int getWorkflowStateValue();
  /**
   * <code>.data.WorkflowEvent.WorkflowState workflowState = 14;</code>
   */
  org.spin.grpc.util.WorkflowEvent.WorkflowState getWorkflowState();

  /**
   * <code>.data.WorkflowEvent.EventType eventType = 15;</code>
   */
  int getEventTypeValue();
  /**
   * <code>.data.WorkflowEvent.EventType eventType = 15;</code>
   */
  org.spin.grpc.util.WorkflowEvent.EventType getEventType();

  /**
   * <code>int64 logDate = 16;</code>
   */
  long getLogDate();
}
