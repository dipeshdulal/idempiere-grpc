// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public interface ValidationRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dictionary.ValidationRuleRequest)
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
   * <code>string validationRuleUuid = 2;</code>
   */
  java.lang.String getValidationRuleUuid();
  /**
   * <code>string validationRuleUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getValidationRuleUuidBytes();
}