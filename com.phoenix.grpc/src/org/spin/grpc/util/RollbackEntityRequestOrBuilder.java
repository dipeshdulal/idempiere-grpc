// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface RollbackEntityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.RollbackEntityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  boolean hasClientRequest();
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  org.spin.grpc.util.ClientRequest getClientRequest();
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder();

  /**
   * <code>string tableName = 2;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>string tableName = 2;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>int32 recordId = 3;</code>
   */
  int getRecordId();

  /**
   * <code>.data.RollbackEntityRequest.EventType eventType = 4;</code>
   */
  int getEventTypeValue();
  /**
   * <code>.data.RollbackEntityRequest.EventType eventType = 4;</code>
   */
  org.spin.grpc.util.RollbackEntityRequest.EventType getEventType();
}
