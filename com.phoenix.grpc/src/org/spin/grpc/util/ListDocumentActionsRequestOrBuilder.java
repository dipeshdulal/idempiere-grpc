// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListDocumentActionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListDocumentActionsRequest)
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
   * <code>string documentAction = 6;</code>
   */
  java.lang.String getDocumentAction();
  /**
   * <code>string documentAction = 6;</code>
   */
  com.google.protobuf.ByteString
      getDocumentActionBytes();

  /**
   * <code>int32 page_size = 7;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 8;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 8;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}