// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core_functionality.proto

package org.spin.grpc.util;

public interface CountryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.Country)
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
   * <code>string countryCode = 3;</code>
   */
  java.lang.String getCountryCode();
  /**
   * <code>string countryCode = 3;</code>
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 5;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>bool hasRegion = 6;</code>
   */
  boolean getHasRegion();

  /**
   * <code>string regionName = 7;</code>
   */
  java.lang.String getRegionName();
  /**
   * <code>string regionName = 7;</code>
   */
  com.google.protobuf.ByteString
      getRegionNameBytes();

  /**
   * <code>string displaySequence = 8;</code>
   */
  java.lang.String getDisplaySequence();
  /**
   * <code>string displaySequence = 8;</code>
   */
  com.google.protobuf.ByteString
      getDisplaySequenceBytes();

  /**
   * <code>bool isAddressLinesReverse = 9;</code>
   */
  boolean getIsAddressLinesReverse();

  /**
   * <code>string captureSequence = 10;</code>
   */
  java.lang.String getCaptureSequence();
  /**
   * <code>string captureSequence = 10;</code>
   */
  com.google.protobuf.ByteString
      getCaptureSequenceBytes();

  /**
   * <code>string displaySequenceLocal = 11;</code>
   */
  java.lang.String getDisplaySequenceLocal();
  /**
   * <code>string displaySequenceLocal = 11;</code>
   */
  com.google.protobuf.ByteString
      getDisplaySequenceLocalBytes();

  /**
   * <code>bool isAddressLinesLocalReverse = 12;</code>
   */
  boolean getIsAddressLinesLocalReverse();

  /**
   * <code>string expressionPostal = 13;</code>
   */
  java.lang.String getExpressionPostal();
  /**
   * <code>string expressionPostal = 13;</code>
   */
  com.google.protobuf.ByteString
      getExpressionPostalBytes();

  /**
   * <code>bool hasPostalAdd = 14;</code>
   */
  boolean getHasPostalAdd();

  /**
   * <code>string expressionPhone = 15;</code>
   */
  java.lang.String getExpressionPhone();
  /**
   * <code>string expressionPhone = 15;</code>
   */
  com.google.protobuf.ByteString
      getExpressionPhoneBytes();

  /**
   * <code>string mediaSize = 16;</code>
   */
  java.lang.String getMediaSize();
  /**
   * <code>string mediaSize = 16;</code>
   */
  com.google.protobuf.ByteString
      getMediaSizeBytes();

  /**
   * <code>string expressionBankRoutingNo = 17;</code>
   */
  java.lang.String getExpressionBankRoutingNo();
  /**
   * <code>string expressionBankRoutingNo = 17;</code>
   */
  com.google.protobuf.ByteString
      getExpressionBankRoutingNoBytes();

  /**
   * <code>string expressionBankAccountNo = 18;</code>
   */
  java.lang.String getExpressionBankAccountNo();
  /**
   * <code>string expressionBankAccountNo = 18;</code>
   */
  com.google.protobuf.ByteString
      getExpressionBankAccountNoBytes();

  /**
   * <code>string language = 19;</code>
   */
  java.lang.String getLanguage();
  /**
   * <code>string language = 19;</code>
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <code>bool allowCitiesOutOfList = 20;</code>
   */
  boolean getAllowCitiesOutOfList();

  /**
   * <code>bool isPostcodeLookup = 21;</code>
   */
  boolean getIsPostcodeLookup();

  /**
   * <code>.data.Currency currency = 22;</code>
   */
  boolean hasCurrency();
  /**
   * <code>.data.Currency currency = 22;</code>
   */
  org.spin.grpc.util.Currency getCurrency();
  /**
   * <code>.data.Currency currency = 22;</code>
   */
  org.spin.grpc.util.CurrencyOrBuilder getCurrencyOrBuilder();
}
