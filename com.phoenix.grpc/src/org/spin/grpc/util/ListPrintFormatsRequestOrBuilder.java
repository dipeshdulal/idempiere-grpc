// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListPrintFormatsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListPrintFormatsRequest)
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
   * <code>string reportViewUuid = 3;</code>
   */
  java.lang.String getReportViewUuid();
  /**
   * <code>string reportViewUuid = 3;</code>
   */
  com.google.protobuf.ByteString
      getReportViewUuidBytes();

  /**
   * <code>string processUuid = 4;</code>
   */
  java.lang.String getProcessUuid();
  /**
   * <code>string processUuid = 4;</code>
   */
  com.google.protobuf.ByteString
      getProcessUuidBytes();

  /**
   * <code>int32 page_size = 5;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 6;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 6;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
