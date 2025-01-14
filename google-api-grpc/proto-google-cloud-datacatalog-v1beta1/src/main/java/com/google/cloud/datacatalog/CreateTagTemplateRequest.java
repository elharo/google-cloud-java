// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

/**
 *
 *
 * <pre>
 * Request message for
 * [CreateTagTemplate][google.cloud.datacatalog.v1beta1.DataCatalog.CreateTagTemplate].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest}
 */
public final class CreateTagTemplateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest)
    CreateTagTemplateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTagTemplateRequest.newBuilder() to construct.
  private CreateTagTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTagTemplateRequest() {
    parent_ = "";
    tagTemplateId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateTagTemplateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.datacatalog.TagTemplate.Builder subBuilder = null;
              if (tagTemplate_ != null) {
                subBuilder = tagTemplate_.toBuilder();
              }
              tagTemplate_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.TagTemplate.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tagTemplate_);
                tagTemplate_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              tagTemplateId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_CreateTagTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_CreateTagTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.CreateTagTemplateRequest.class,
            com.google.cloud.datacatalog.CreateTagTemplateRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the project and the location this template is in.
   * Example: "projects/{project_id}/locations/{location}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the project and the location this template is in.
   * Example: "projects/{project_id}/locations/{location}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_TEMPLATE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object tagTemplateId_;
  /**
   *
   *
   * <pre>
   * Required. The id of the tag template to create.
   * </pre>
   *
   * <code>string tag_template_id = 3;</code>
   */
  public java.lang.String getTagTemplateId() {
    java.lang.Object ref = tagTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tagTemplateId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The id of the tag template to create.
   * </pre>
   *
   * <code>string tag_template_id = 3;</code>
   */
  public com.google.protobuf.ByteString getTagTemplateIdBytes() {
    java.lang.Object ref = tagTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tagTemplateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_TEMPLATE_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.TagTemplate tagTemplate_;
  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
   */
  public boolean hasTagTemplate() {
    return tagTemplate_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
   */
  public com.google.cloud.datacatalog.TagTemplate getTagTemplate() {
    return tagTemplate_ == null
        ? com.google.cloud.datacatalog.TagTemplate.getDefaultInstance()
        : tagTemplate_;
  }
  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
   */
  public com.google.cloud.datacatalog.TagTemplateOrBuilder getTagTemplateOrBuilder() {
    return getTagTemplate();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (tagTemplate_ != null) {
      output.writeMessage(2, getTagTemplate());
    }
    if (!getTagTemplateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tagTemplateId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (tagTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTagTemplate());
    }
    if (!getTagTemplateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tagTemplateId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datacatalog.CreateTagTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.CreateTagTemplateRequest other =
        (com.google.cloud.datacatalog.CreateTagTemplateRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getTagTemplateId().equals(other.getTagTemplateId())) return false;
    if (hasTagTemplate() != other.hasTagTemplate()) return false;
    if (hasTagTemplate()) {
      if (!getTagTemplate().equals(other.getTagTemplate())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + TAG_TEMPLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTagTemplateId().hashCode();
    if (hasTagTemplate()) {
      hash = (37 * hash) + TAG_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getTagTemplate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datacatalog.CreateTagTemplateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [CreateTagTemplate][google.cloud.datacatalog.v1beta1.DataCatalog.CreateTagTemplate].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest)
      com.google.cloud.datacatalog.CreateTagTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_CreateTagTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_CreateTagTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.CreateTagTemplateRequest.class,
              com.google.cloud.datacatalog.CreateTagTemplateRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.CreateTagTemplateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      tagTemplateId_ = "";

      if (tagTemplateBuilder_ == null) {
        tagTemplate_ = null;
      } else {
        tagTemplate_ = null;
        tagTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_CreateTagTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.CreateTagTemplateRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.CreateTagTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.CreateTagTemplateRequest build() {
      com.google.cloud.datacatalog.CreateTagTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.CreateTagTemplateRequest buildPartial() {
      com.google.cloud.datacatalog.CreateTagTemplateRequest result =
          new com.google.cloud.datacatalog.CreateTagTemplateRequest(this);
      result.parent_ = parent_;
      result.tagTemplateId_ = tagTemplateId_;
      if (tagTemplateBuilder_ == null) {
        result.tagTemplate_ = tagTemplate_;
      } else {
        result.tagTemplate_ = tagTemplateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.CreateTagTemplateRequest) {
        return mergeFrom((com.google.cloud.datacatalog.CreateTagTemplateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.CreateTagTemplateRequest other) {
      if (other == com.google.cloud.datacatalog.CreateTagTemplateRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getTagTemplateId().isEmpty()) {
        tagTemplateId_ = other.tagTemplateId_;
        onChanged();
      }
      if (other.hasTagTemplate()) {
        mergeTagTemplate(other.getTagTemplate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.datacatalog.CreateTagTemplateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.CreateTagTemplateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the project and the location this template is in.
     * Example: "projects/{project_id}/locations/{location}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project and the location this template is in.
     * Example: "projects/{project_id}/locations/{location}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project and the location this template is in.
     * Example: "projects/{project_id}/locations/{location}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project and the location this template is in.
     * Example: "projects/{project_id}/locations/{location}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project and the location this template is in.
     * Example: "projects/{project_id}/locations/{location}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tagTemplateId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The id of the tag template to create.
     * </pre>
     *
     * <code>string tag_template_id = 3;</code>
     */
    public java.lang.String getTagTemplateId() {
      java.lang.Object ref = tagTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tagTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The id of the tag template to create.
     * </pre>
     *
     * <code>string tag_template_id = 3;</code>
     */
    public com.google.protobuf.ByteString getTagTemplateIdBytes() {
      java.lang.Object ref = tagTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tagTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The id of the tag template to create.
     * </pre>
     *
     * <code>string tag_template_id = 3;</code>
     */
    public Builder setTagTemplateId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tagTemplateId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The id of the tag template to create.
     * </pre>
     *
     * <code>string tag_template_id = 3;</code>
     */
    public Builder clearTagTemplateId() {

      tagTemplateId_ = getDefaultInstance().getTagTemplateId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The id of the tag template to create.
     * </pre>
     *
     * <code>string tag_template_id = 3;</code>
     */
    public Builder setTagTemplateIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      tagTemplateId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.TagTemplate tagTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.TagTemplate,
            com.google.cloud.datacatalog.TagTemplate.Builder,
            com.google.cloud.datacatalog.TagTemplateOrBuilder>
        tagTemplateBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    public boolean hasTagTemplate() {
      return tagTemplateBuilder_ != null || tagTemplate_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    public com.google.cloud.datacatalog.TagTemplate getTagTemplate() {
      if (tagTemplateBuilder_ == null) {
        return tagTemplate_ == null
            ? com.google.cloud.datacatalog.TagTemplate.getDefaultInstance()
            : tagTemplate_;
      } else {
        return tagTemplateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    public Builder setTagTemplate(com.google.cloud.datacatalog.TagTemplate value) {
      if (tagTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tagTemplate_ = value;
        onChanged();
      } else {
        tagTemplateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    public Builder setTagTemplate(
        com.google.cloud.datacatalog.TagTemplate.Builder builderForValue) {
      if (tagTemplateBuilder_ == null) {
        tagTemplate_ = builderForValue.build();
        onChanged();
      } else {
        tagTemplateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    public Builder mergeTagTemplate(com.google.cloud.datacatalog.TagTemplate value) {
      if (tagTemplateBuilder_ == null) {
        if (tagTemplate_ != null) {
          tagTemplate_ =
              com.google.cloud.datacatalog.TagTemplate.newBuilder(tagTemplate_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tagTemplate_ = value;
        }
        onChanged();
      } else {
        tagTemplateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    public Builder clearTagTemplate() {
      if (tagTemplateBuilder_ == null) {
        tagTemplate_ = null;
        onChanged();
      } else {
        tagTemplate_ = null;
        tagTemplateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    public com.google.cloud.datacatalog.TagTemplate.Builder getTagTemplateBuilder() {

      onChanged();
      return getTagTemplateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    public com.google.cloud.datacatalog.TagTemplateOrBuilder getTagTemplateOrBuilder() {
      if (tagTemplateBuilder_ != null) {
        return tagTemplateBuilder_.getMessageOrBuilder();
      } else {
        return tagTemplate_ == null
            ? com.google.cloud.datacatalog.TagTemplate.getDefaultInstance()
            : tagTemplate_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The tag template to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.TagTemplate,
            com.google.cloud.datacatalog.TagTemplate.Builder,
            com.google.cloud.datacatalog.TagTemplateOrBuilder>
        getTagTemplateFieldBuilder() {
      if (tagTemplateBuilder_ == null) {
        tagTemplateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.TagTemplate,
                com.google.cloud.datacatalog.TagTemplate.Builder,
                com.google.cloud.datacatalog.TagTemplateOrBuilder>(
                getTagTemplate(), getParentForChildren(), isClean());
        tagTemplate_ = null;
      }
      return tagTemplateBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest)
  private static final com.google.cloud.datacatalog.CreateTagTemplateRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.CreateTagTemplateRequest();
  }

  public static com.google.cloud.datacatalog.CreateTagTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTagTemplateRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateTagTemplateRequest>() {
        @java.lang.Override
        public CreateTagTemplateRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateTagTemplateRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateTagTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTagTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.CreateTagTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
