// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListChatEntriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListChatEntriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.ChatEntry chatEntries = 2;</code>
   */
  java.util.List<org.spin.grpc.util.ChatEntry> 
      getChatEntriesList();
  /**
   * <code>repeated .data.ChatEntry chatEntries = 2;</code>
   */
  org.spin.grpc.util.ChatEntry getChatEntries(int index);
  /**
   * <code>repeated .data.ChatEntry chatEntries = 2;</code>
   */
  int getChatEntriesCount();
  /**
   * <code>repeated .data.ChatEntry chatEntries = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.ChatEntryOrBuilder> 
      getChatEntriesOrBuilderList();
  /**
   * <code>repeated .data.ChatEntry chatEntries = 2;</code>
   */
  org.spin.grpc.util.ChatEntryOrBuilder getChatEntriesOrBuilder(
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
