// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: business.proto

package org.spin.grpc.util;

public interface ListFavoritesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListFavoritesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 recordCount = 1;</code>
   */
  long getRecordCount();

  /**
   * <code>repeated .data.Favorite favorites = 2;</code>
   */
  java.util.List<org.spin.grpc.util.Favorite> 
      getFavoritesList();
  /**
   * <code>repeated .data.Favorite favorites = 2;</code>
   */
  org.spin.grpc.util.Favorite getFavorites(int index);
  /**
   * <code>repeated .data.Favorite favorites = 2;</code>
   */
  int getFavoritesCount();
  /**
   * <code>repeated .data.Favorite favorites = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.FavoriteOrBuilder> 
      getFavoritesOrBuilderList();
  /**
   * <code>repeated .data.Favorite favorites = 2;</code>
   */
  org.spin.grpc.util.FavoriteOrBuilder getFavoritesOrBuilder(
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