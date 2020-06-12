// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface PendingDocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.PendingDocument)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string windowUuid = 1;</code>
   */
  java.lang.String getWindowUuid();
  /**
   * <code>string windowUuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getWindowUuidBytes();

  /**
   * <code>string formUuid = 2;</code>
   */
  java.lang.String getFormUuid();
  /**
   * <code>string formUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getFormUuidBytes();

  /**
   * <code>string documentName = 3;</code>
   */
  java.lang.String getDocumentName();
  /**
   * <code>string documentName = 3;</code>
   */
  com.google.protobuf.ByteString
      getDocumentNameBytes();

  /**
   * <code>string documentDescription = 4;</code>
   */
  java.lang.String getDocumentDescription();
  /**
   * <code>string documentDescription = 4;</code>
   */
  com.google.protobuf.ByteString
      getDocumentDescriptionBytes();

  /**
   * <code>int32 sequence = 5;</code>
   */
  int getSequence();

  /**
   * <code>int64 recordCount = 6;</code>
   */
  long getRecordCount();

  /**
   * <pre>
   * Query
   * </pre>
   *
   * <code>.data.Criteria criteria = 7;</code>
   */
  boolean hasCriteria();
  /**
   * <pre>
   * Query
   * </pre>
   *
   * <code>.data.Criteria criteria = 7;</code>
   */
  org.spin.grpc.util.Criteria getCriteria();
  /**
   * <pre>
   * Query
   * </pre>
   *
   * <code>.data.Criteria criteria = 7;</code>
   */
  org.spin.grpc.util.CriteriaOrBuilder getCriteriaOrBuilder();
}