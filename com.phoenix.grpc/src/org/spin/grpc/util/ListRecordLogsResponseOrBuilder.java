// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListRecordLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListRecordLogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.RecordLog recordLogs = 2;</code>
   */
  java.util.List<org.spin.grpc.util.RecordLog> 
      getRecordLogsList();
  /**
   * <code>repeated .data.RecordLog recordLogs = 2;</code>
   */
  org.spin.grpc.util.RecordLog getRecordLogs(int index);
  /**
   * <code>repeated .data.RecordLog recordLogs = 2;</code>
   */
  int getRecordLogsCount();
  /**
   * <code>repeated .data.RecordLog recordLogs = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.RecordLogOrBuilder> 
      getRecordLogsOrBuilderList();
  /**
   * <code>repeated .data.RecordLog recordLogs = 2;</code>
   */
  org.spin.grpc.util.RecordLogOrBuilder getRecordLogsOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 3;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
