// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListRecentItemsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListRecentItemsRequest)
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
   * <code>string userUuid = 2;</code>
   */
  java.lang.String getUserUuid();
  /**
   * <code>string userUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserUuidBytes();

  /**
   * <code>string roleUuid = 3;</code>
   */
  java.lang.String getRoleUuid();
  /**
   * <code>string roleUuid = 3;</code>
   */
  com.google.protobuf.ByteString
      getRoleUuidBytes();

  /**
   * <code>bool currentSession = 4;</code>
   */
  boolean getCurrentSession();

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
