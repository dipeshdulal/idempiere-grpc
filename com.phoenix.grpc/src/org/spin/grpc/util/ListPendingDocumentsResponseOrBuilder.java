// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListPendingDocumentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListPendingDocumentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.PendingDocument pendingDocuments = 2;</code>
   */
  java.util.List<org.spin.grpc.util.PendingDocument> 
      getPendingDocumentsList();
  /**
   * <code>repeated .data.PendingDocument pendingDocuments = 2;</code>
   */
  org.spin.grpc.util.PendingDocument getPendingDocuments(int index);
  /**
   * <code>repeated .data.PendingDocument pendingDocuments = 2;</code>
   */
  int getPendingDocumentsCount();
  /**
   * <code>repeated .data.PendingDocument pendingDocuments = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.PendingDocumentOrBuilder> 
      getPendingDocumentsOrBuilderList();
  /**
   * <code>repeated .data.PendingDocument pendingDocuments = 2;</code>
   */
  org.spin.grpc.util.PendingDocumentOrBuilder getPendingDocumentsOrBuilder(
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
