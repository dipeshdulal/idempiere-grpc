// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListDocumentStatusesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListDocumentStatusesRequest)
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
   * <code>string recordUuid = 4;</code>
   */
  java.lang.String getRecordUuid();
  /**
   * <code>string recordUuid = 4;</code>
   */
  com.google.protobuf.ByteString
      getRecordUuidBytes();

  /**
   * <code>string documentStatus = 5;</code>
   */
  java.lang.String getDocumentStatus();
  /**
   * <code>string documentStatus = 5;</code>
   */
  com.google.protobuf.ByteString
      getDocumentStatusBytes();

  /**
   * <code>int32 page_size = 6;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 7;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 7;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
