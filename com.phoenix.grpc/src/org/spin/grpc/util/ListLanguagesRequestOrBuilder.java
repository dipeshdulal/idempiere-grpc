// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core_functionality.proto

package org.spin.grpc.util;

public interface ListLanguagesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListLanguagesRequest)
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
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}