// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: point_of_sales.proto

package org.spin.grpc.util;

public interface ListProductPriceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListProductPriceRequest)
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
   * <code>string searchValue = 2;</code>
   */
  java.lang.String getSearchValue();
  /**
   * <code>string searchValue = 2;</code>
   */
  com.google.protobuf.ByteString
      getSearchValueBytes();

  /**
   * <code>string priceListUuid = 3;</code>
   */
  java.lang.String getPriceListUuid();
  /**
   * <code>string priceListUuid = 3;</code>
   */
  com.google.protobuf.ByteString
      getPriceListUuidBytes();

  /**
   * <code>string businessPartnerUuid = 4;</code>
   */
  java.lang.String getBusinessPartnerUuid();
  /**
   * <code>string businessPartnerUuid = 4;</code>
   */
  com.google.protobuf.ByteString
      getBusinessPartnerUuidBytes();

  /**
   * <code>string warehouseUuid = 5;</code>
   */
  java.lang.String getWarehouseUuid();
  /**
   * <code>string warehouseUuid = 5;</code>
   */
  com.google.protobuf.ByteString
      getWarehouseUuidBytes();

  /**
   * <code>int64 validFrom = 6;</code>
   */
  long getValidFrom();

  /**
   * <code>int32 page_size = 7;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 8;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 8;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
