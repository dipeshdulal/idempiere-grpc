// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public interface ReferenceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dictionary.ReferenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.dictionary.ApplicationRequest applicationRequest = 1;</code>
   */
  boolean hasApplicationRequest();
  /**
   * <code>.dictionary.ApplicationRequest applicationRequest = 1;</code>
   */
  org.spin.grpc.util.ApplicationRequest getApplicationRequest();
  /**
   * <code>.dictionary.ApplicationRequest applicationRequest = 1;</code>
   */
  org.spin.grpc.util.ApplicationRequestOrBuilder getApplicationRequestOrBuilder();

  /**
   * <code>string referenceUuid = 2;</code>
   */
  java.lang.String getReferenceUuid();
  /**
   * <code>string referenceUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getReferenceUuidBytes();

  /**
   * <pre>
   * TableName + ColumnName assumed that it is Table Direct
   * </pre>
   *
   * <code>string columnName = 3;</code>
   */
  java.lang.String getColumnName();
  /**
   * <pre>
   * TableName + ColumnName assumed that it is Table Direct
   * </pre>
   *
   * <code>string columnName = 3;</code>
   */
  com.google.protobuf.ByteString
      getColumnNameBytes();
}