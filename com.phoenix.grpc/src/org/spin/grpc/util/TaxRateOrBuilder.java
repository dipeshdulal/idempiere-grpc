// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core_functionality.proto

package org.spin.grpc.util;

public interface TaxRateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.TaxRate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>int32 id = 2;</code>
   */
  int getId();

  /**
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

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
   * <code>string taxIndicator = 5;</code>
   */
  java.lang.String getTaxIndicator();
  /**
   * <code>string taxIndicator = 5;</code>
   */
  com.google.protobuf.ByteString
      getTaxIndicatorBytes();

  /**
   * <code>.data.Decimal rate = 6;</code>
   */
  boolean hasRate();
  /**
   * <code>.data.Decimal rate = 6;</code>
   */
  org.spin.grpc.util.Decimal getRate();
  /**
   * <code>.data.Decimal rate = 6;</code>
   */
  org.spin.grpc.util.DecimalOrBuilder getRateOrBuilder();
}
