// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface DataSourceParameterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.DataSourceParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Parameter identifier.
   * </pre>
   *
   * <code>string param_id = 1;</code>
   */
  java.lang.String getParamId();
  /**
   *
   *
   * <pre>
   * Parameter identifier.
   * </pre>
   *
   * <code>string param_id = 1;</code>
   */
  com.google.protobuf.ByteString getParamIdBytes();

  /**
   *
   *
   * <pre>
   * Parameter display name in the user interface.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Parameter display name in the user interface.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Parameter description.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Parameter description.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Parameter type.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceParameter.Type type = 4;</code>
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Parameter type.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceParameter.Type type = 4;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter.Type getType();

  /**
   *
   *
   * <pre>
   * Is parameter required.
   * </pre>
   *
   * <code>bool required = 5;</code>
   */
  boolean getRequired();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>bool repeated = 6;</code>
   */
  boolean getRepeated();

  /**
   *
   *
   * <pre>
   * Regular expression which can be used for parameter validation.
   * </pre>
   *
   * <code>string validation_regex = 7;</code>
   */
  java.lang.String getValidationRegex();
  /**
   *
   *
   * <pre>
   * Regular expression which can be used for parameter validation.
   * </pre>
   *
   * <code>string validation_regex = 7;</code>
   */
  com.google.protobuf.ByteString getValidationRegexBytes();

  /**
   *
   *
   * <pre>
   * All possible values for the parameter.
   * </pre>
   *
   * <code>repeated string allowed_values = 8;</code>
   */
  java.util.List<java.lang.String> getAllowedValuesList();
  /**
   *
   *
   * <pre>
   * All possible values for the parameter.
   * </pre>
   *
   * <code>repeated string allowed_values = 8;</code>
   */
  int getAllowedValuesCount();
  /**
   *
   *
   * <pre>
   * All possible values for the parameter.
   * </pre>
   *
   * <code>repeated string allowed_values = 8;</code>
   */
  java.lang.String getAllowedValues(int index);
  /**
   *
   *
   * <pre>
   * All possible values for the parameter.
   * </pre>
   *
   * <code>repeated string allowed_values = 8;</code>
   */
  com.google.protobuf.ByteString getAllowedValuesBytes(int index);

  /**
   *
   *
   * <pre>
   * For integer and double values specifies minimum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 9;</code>
   */
  boolean hasMinValue();
  /**
   *
   *
   * <pre>
   * For integer and double values specifies minimum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 9;</code>
   */
  com.google.protobuf.DoubleValue getMinValue();
  /**
   *
   *
   * <pre>
   * For integer and double values specifies minimum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 9;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getMinValueOrBuilder();

  /**
   *
   *
   * <pre>
   * For integer and double values specifies maxminum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 10;</code>
   */
  boolean hasMaxValue();
  /**
   *
   *
   * <pre>
   * For integer and double values specifies maxminum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 10;</code>
   */
  com.google.protobuf.DoubleValue getMaxValue();
  /**
   *
   *
   * <pre>
   * For integer and double values specifies maxminum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 10;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getMaxValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter> getFieldsList();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter getFields(int index);
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.DataSourceParameterOrBuilder>
      getFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameterOrBuilder getFieldsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Description of the requirements for this field, in case the user input does
   * not fulfill the regex pattern or min/max values.
   * </pre>
   *
   * <code>string validation_description = 12;</code>
   */
  java.lang.String getValidationDescription();
  /**
   *
   *
   * <pre>
   * Description of the requirements for this field, in case the user input does
   * not fulfill the regex pattern or min/max values.
   * </pre>
   *
   * <code>string validation_description = 12;</code>
   */
  com.google.protobuf.ByteString getValidationDescriptionBytes();

  /**
   *
   *
   * <pre>
   * URL to a help document to further explain the naming requirements.
   * </pre>
   *
   * <code>string validation_help_url = 13;</code>
   */
  java.lang.String getValidationHelpUrl();
  /**
   *
   *
   * <pre>
   * URL to a help document to further explain the naming requirements.
   * </pre>
   *
   * <code>string validation_help_url = 13;</code>
   */
  com.google.protobuf.ByteString getValidationHelpUrlBytes();

  /**
   *
   *
   * <pre>
   * Cannot be changed after initial creation.
   * </pre>
   *
   * <code>bool immutable = 14;</code>
   */
  boolean getImmutable();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>bool recurse = 15;</code>
   */
  boolean getRecurse();
}
