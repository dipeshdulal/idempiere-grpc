// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base_data_type.proto

package org.spin.grpc.util;

public interface TranslationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.Translation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string language = 1;</code>
   */
  java.lang.String getLanguage();
  /**
   * <code>string language = 1;</code>
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <code>string translationUuid = 2;</code>
   */
  java.lang.String getTranslationUuid();
  /**
   * <code>string translationUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getTranslationUuidBytes();

  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */
  int getValuesCount();
  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */
  boolean containsValues(
      java.lang.String key);
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.spin.grpc.util.Value>
  getValues();
  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */
  java.util.Map<java.lang.String, org.spin.grpc.util.Value>
  getValuesMap();
  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */

  org.spin.grpc.util.Value getValuesOrDefault(
      java.lang.String key,
      org.spin.grpc.util.Value defaultValue);
  /**
   * <code>map&lt;string, .data.Value&gt; values = 3;</code>
   */

  org.spin.grpc.util.Value getValuesOrThrow(
      java.lang.String key);
}