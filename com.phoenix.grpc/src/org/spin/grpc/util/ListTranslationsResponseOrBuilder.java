// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListTranslationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListTranslationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.Translation translations = 2;</code>
   */
  java.util.List<org.spin.grpc.util.Translation> 
      getTranslationsList();
  /**
   * <code>repeated .data.Translation translations = 2;</code>
   */
  org.spin.grpc.util.Translation getTranslations(int index);
  /**
   * <code>repeated .data.Translation translations = 2;</code>
   */
  int getTranslationsCount();
  /**
   * <code>repeated .data.Translation translations = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.TranslationOrBuilder> 
      getTranslationsOrBuilderList();
  /**
   * <code>repeated .data.Translation translations = 2;</code>
   */
  org.spin.grpc.util.TranslationOrBuilder getTranslationsOrBuilder(
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
