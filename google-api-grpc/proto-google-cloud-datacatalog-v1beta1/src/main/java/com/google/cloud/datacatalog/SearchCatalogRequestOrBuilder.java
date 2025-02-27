// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface SearchCatalogRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.SearchCatalogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The scope of this search request.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SearchCatalogRequest.Scope scope = 6;</code>
   */
  boolean hasScope();
  /**
   *
   *
   * <pre>
   * Required. The scope of this search request.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SearchCatalogRequest.Scope scope = 6;</code>
   */
  com.google.cloud.datacatalog.SearchCatalogRequest.Scope getScope();
  /**
   *
   *
   * <pre>
   * Required. The scope of this search request.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SearchCatalogRequest.Scope scope = 6;</code>
   */
  com.google.cloud.datacatalog.SearchCatalogRequest.ScopeOrBuilder getScopeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The query string in search query syntax. The query must be
   * non-empty.
   * Query strings can be simple as "x" or more qualified as:
   * * name:x
   * * column:x
   * * description:y
   * Note: Query tokens need to have a minimum of 3 characters for substring
   * matching to work correctly. See [Data Catalog Search
   * Syntax](/data-catalog/docs/how-to/search-reference) for more information.
   * </pre>
   *
   * <code>string query = 1;</code>
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The query string in search query syntax. The query must be
   * non-empty.
   * Query strings can be simple as "x" or more qualified as:
   * * name:x
   * * column:x
   * * description:y
   * Note: Query tokens need to have a minimum of 3 characters for substring
   * matching to work correctly. See [Data Catalog Search
   * Syntax](/data-catalog/docs/how-to/search-reference) for more information.
   * </pre>
   *
   * <code>string query = 1;</code>
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Number of results in the search page. If &lt;=0 then defaults to 10. Max limit
   * for page_size is 1000. Throws an invalid argument for page_size &gt; 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional pagination token returned in an earlier
   * [SearchCatalogResponse.next_page_token][google.cloud.datacatalog.v1beta1.DataCatalog.SearchCatalogResponse.next_page_token];
   * indicates that this is a continuation of a prior
   * [SearchCatalog][google.cloud.datacatalog.v1beta1.DataCatalog.SearchCatalog]
   * call, and that the system should return the next page of data. If empty
   * then the first page is returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional pagination token returned in an earlier
   * [SearchCatalogResponse.next_page_token][google.cloud.datacatalog.v1beta1.DataCatalog.SearchCatalogResponse.next_page_token];
   * indicates that this is a continuation of a prior
   * [SearchCatalog][google.cloud.datacatalog.v1beta1.DataCatalog.SearchCatalog]
   * call, and that the system should return the next page of data. If empty
   * then the first page is returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Specifies the ordering of results, currently supported case-sensitive
   * choices are:
   * &lt;ul&gt;
   *   &lt;li&gt; relevance &lt;/li&gt;
   *   &lt;li&gt; last_access_timestamp [asc|desc], defaults to descending if not
   *   specified, &lt;/li&gt;
   *   &lt;li&gt; last_modified_timestamp [asc|desc], defaults to descending if not
   *   specified, &lt;/li&gt;
   *   &lt;li&gt; title [asc|desc], defaults to ascending if not specified. &lt;/li&gt;
   * &lt;/ul&gt;
   * </pre>
   *
   * <code>string order_by = 5;</code>
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Specifies the ordering of results, currently supported case-sensitive
   * choices are:
   * &lt;ul&gt;
   *   &lt;li&gt; relevance &lt;/li&gt;
   *   &lt;li&gt; last_access_timestamp [asc|desc], defaults to descending if not
   *   specified, &lt;/li&gt;
   *   &lt;li&gt; last_modified_timestamp [asc|desc], defaults to descending if not
   *   specified, &lt;/li&gt;
   *   &lt;li&gt; title [asc|desc], defaults to ascending if not specified. &lt;/li&gt;
   * &lt;/ul&gt;
   * </pre>
   *
   * <code>string order_by = 5;</code>
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
