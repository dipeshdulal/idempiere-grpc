// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: point_of_sales.proto

package org.spin.grpc.util;

public interface ListOrdersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListOrdersRequest)
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
   * <code>string posUuid = 2;</code>
   */
  java.lang.String getPosUuid();
  /**
   * <code>string posUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getPosUuidBytes();

  /**
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
