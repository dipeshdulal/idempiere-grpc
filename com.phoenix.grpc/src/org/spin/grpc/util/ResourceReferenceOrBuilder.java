// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base_data_type.proto

package org.spin.grpc.util;

public interface ResourceReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ResourceReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string resourceUuid = 1;</code>
   */
  java.lang.String getResourceUuid();
  /**
   * <code>string resourceUuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceUuidBytes();

  /**
   * <code>string fileName = 2;</code>
   */
  java.lang.String getFileName();
  /**
   * <code>string fileName = 2;</code>
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>.data.Decimal fileSize = 3;</code>
   */
  boolean hasFileSize();
  /**
   * <code>.data.Decimal fileSize = 3;</code>
   */
  org.spin.grpc.util.Decimal getFileSize();
  /**
   * <code>.data.Decimal fileSize = 3;</code>
   */
  org.spin.grpc.util.DecimalOrBuilder getFileSizeOrBuilder();

  /**
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string textMsg = 5;</code>
   */
  java.lang.String getTextMsg();
  /**
   * <code>string textMsg = 5;</code>
   */
  com.google.protobuf.ByteString
      getTextMsgBytes();

  /**
   * <code>string contentType = 6;</code>
   */
  java.lang.String getContentType();
  /**
   * <code>string contentType = 6;</code>
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();
}
