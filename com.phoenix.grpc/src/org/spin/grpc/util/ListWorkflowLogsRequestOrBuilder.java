// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListWorkflowLogsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListWorkflowLogsRequest)
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
   * <code>int32 page_size = 4;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 5;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 5;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}