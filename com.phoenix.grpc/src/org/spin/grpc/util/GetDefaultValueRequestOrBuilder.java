// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface GetDefaultValueRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.GetDefaultValueRequest)
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
   * <pre>
   * Query
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Query
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  com.google.protobuf.ByteString
      getQueryBytes();
}
