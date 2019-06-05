// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

/**
 *
 *
 * <pre>
 * Video segment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.VideoSegment}
 */
public final class VideoSegment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p3beta1.VideoSegment)
    VideoSegmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoSegment.newBuilder() to construct.
  private VideoSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoSegment() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoSegment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VideoSegment(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (startTimeOffset_ != null) {
                subBuilder = startTimeOffset_.toBuilder();
              }
              startTimeOffset_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startTimeOffset_);
                startTimeOffset_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (endTimeOffset_ != null) {
                subBuilder = endTimeOffset_.toBuilder();
              }
              endTimeOffset_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endTimeOffset_);
                endTimeOffset_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p3beta1_VideoSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p3beta1_VideoSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p3beta1.VideoSegment.class,
            com.google.cloud.videointelligence.v1p3beta1.VideoSegment.Builder.class);
  }

  public static final int START_TIME_OFFSET_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration startTimeOffset_;
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  public boolean hasStartTimeOffset() {
    return startTimeOffset_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  public com.google.protobuf.Duration getStartTimeOffset() {
    return startTimeOffset_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : startTimeOffset_;
  }
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  public com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder() {
    return getStartTimeOffset();
  }

  public static final int END_TIME_OFFSET_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration endTimeOffset_;
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  public boolean hasEndTimeOffset() {
    return endTimeOffset_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  public com.google.protobuf.Duration getEndTimeOffset() {
    return endTimeOffset_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : endTimeOffset_;
  }
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  public com.google.protobuf.DurationOrBuilder getEndTimeOffsetOrBuilder() {
    return getEndTimeOffset();
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
    if (startTimeOffset_ != null) {
      output.writeMessage(1, getStartTimeOffset());
    }
    if (endTimeOffset_ != null) {
      output.writeMessage(2, getEndTimeOffset());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTimeOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStartTimeOffset());
    }
    if (endTimeOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEndTimeOffset());
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p3beta1.VideoSegment)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p3beta1.VideoSegment other =
        (com.google.cloud.videointelligence.v1p3beta1.VideoSegment) obj;

    if (hasStartTimeOffset() != other.hasStartTimeOffset()) return false;
    if (hasStartTimeOffset()) {
      if (!getStartTimeOffset().equals(other.getStartTimeOffset())) return false;
    }
    if (hasEndTimeOffset() != other.hasEndTimeOffset()) return false;
    if (hasEndTimeOffset()) {
      if (!getEndTimeOffset().equals(other.getEndTimeOffset())) return false;
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
    if (hasStartTimeOffset()) {
      hash = (37 * hash) + START_TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getStartTimeOffset().hashCode();
    }
    if (hasEndTimeOffset()) {
      hash = (37 * hash) + END_TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getEndTimeOffset().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment parseFrom(
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
      com.google.cloud.videointelligence.v1p3beta1.VideoSegment prototype) {
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
   * Video segment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.VideoSegment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p3beta1.VideoSegment)
      com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_VideoSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_VideoSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p3beta1.VideoSegment.class,
              com.google.cloud.videointelligence.v1p3beta1.VideoSegment.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p3beta1.VideoSegment.newBuilder()
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
      if (startTimeOffsetBuilder_ == null) {
        startTimeOffset_ = null;
      } else {
        startTimeOffset_ = null;
        startTimeOffsetBuilder_ = null;
      }
      if (endTimeOffsetBuilder_ == null) {
        endTimeOffset_ = null;
      } else {
        endTimeOffset_ = null;
        endTimeOffsetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_VideoSegment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.VideoSegment getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.VideoSegment build() {
      com.google.cloud.videointelligence.v1p3beta1.VideoSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.VideoSegment buildPartial() {
      com.google.cloud.videointelligence.v1p3beta1.VideoSegment result =
          new com.google.cloud.videointelligence.v1p3beta1.VideoSegment(this);
      if (startTimeOffsetBuilder_ == null) {
        result.startTimeOffset_ = startTimeOffset_;
      } else {
        result.startTimeOffset_ = startTimeOffsetBuilder_.build();
      }
      if (endTimeOffsetBuilder_ == null) {
        result.endTimeOffset_ = endTimeOffset_;
      } else {
        result.endTimeOffset_ = endTimeOffsetBuilder_.build();
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
      if (other instanceof com.google.cloud.videointelligence.v1p3beta1.VideoSegment) {
        return mergeFrom((com.google.cloud.videointelligence.v1p3beta1.VideoSegment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p3beta1.VideoSegment other) {
      if (other == com.google.cloud.videointelligence.v1p3beta1.VideoSegment.getDefaultInstance())
        return this;
      if (other.hasStartTimeOffset()) {
        mergeStartTimeOffset(other.getStartTimeOffset());
      }
      if (other.hasEndTimeOffset()) {
        mergeEndTimeOffset(other.getEndTimeOffset());
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
      com.google.cloud.videointelligence.v1p3beta1.VideoSegment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1p3beta1.VideoSegment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration startTimeOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        startTimeOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public boolean hasStartTimeOffset() {
      return startTimeOffsetBuilder_ != null || startTimeOffset_ != null;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public com.google.protobuf.Duration getStartTimeOffset() {
      if (startTimeOffsetBuilder_ == null) {
        return startTimeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : startTimeOffset_;
      } else {
        return startTimeOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public Builder setStartTimeOffset(com.google.protobuf.Duration value) {
      if (startTimeOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTimeOffset_ = value;
        onChanged();
      } else {
        startTimeOffsetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public Builder setStartTimeOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (startTimeOffsetBuilder_ == null) {
        startTimeOffset_ = builderForValue.build();
        onChanged();
      } else {
        startTimeOffsetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public Builder mergeStartTimeOffset(com.google.protobuf.Duration value) {
      if (startTimeOffsetBuilder_ == null) {
        if (startTimeOffset_ != null) {
          startTimeOffset_ =
              com.google.protobuf.Duration.newBuilder(startTimeOffset_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          startTimeOffset_ = value;
        }
        onChanged();
      } else {
        startTimeOffsetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public Builder clearStartTimeOffset() {
      if (startTimeOffsetBuilder_ == null) {
        startTimeOffset_ = null;
        onChanged();
      } else {
        startTimeOffset_ = null;
        startTimeOffsetBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getStartTimeOffsetBuilder() {

      onChanged();
      return getStartTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder() {
      if (startTimeOffsetBuilder_ != null) {
        return startTimeOffsetBuilder_.getMessageOrBuilder();
      } else {
        return startTimeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : startTimeOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the start of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time_offset = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getStartTimeOffsetFieldBuilder() {
      if (startTimeOffsetBuilder_ == null) {
        startTimeOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getStartTimeOffset(), getParentForChildren(), isClean());
        startTimeOffset_ = null;
      }
      return startTimeOffsetBuilder_;
    }

    private com.google.protobuf.Duration endTimeOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        endTimeOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    public boolean hasEndTimeOffset() {
      return endTimeOffsetBuilder_ != null || endTimeOffset_ != null;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    public com.google.protobuf.Duration getEndTimeOffset() {
      if (endTimeOffsetBuilder_ == null) {
        return endTimeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : endTimeOffset_;
      } else {
        return endTimeOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    public Builder setEndTimeOffset(com.google.protobuf.Duration value) {
      if (endTimeOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTimeOffset_ = value;
        onChanged();
      } else {
        endTimeOffsetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    public Builder setEndTimeOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (endTimeOffsetBuilder_ == null) {
        endTimeOffset_ = builderForValue.build();
        onChanged();
      } else {
        endTimeOffsetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    public Builder mergeEndTimeOffset(com.google.protobuf.Duration value) {
      if (endTimeOffsetBuilder_ == null) {
        if (endTimeOffset_ != null) {
          endTimeOffset_ =
              com.google.protobuf.Duration.newBuilder(endTimeOffset_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          endTimeOffset_ = value;
        }
        onChanged();
      } else {
        endTimeOffsetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    public Builder clearEndTimeOffset() {
      if (endTimeOffsetBuilder_ == null) {
        endTimeOffset_ = null;
        onChanged();
      } else {
        endTimeOffset_ = null;
        endTimeOffsetBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getEndTimeOffsetBuilder() {

      onChanged();
      return getEndTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getEndTimeOffsetOrBuilder() {
      if (endTimeOffsetBuilder_ != null) {
        return endTimeOffsetBuilder_.getMessageOrBuilder();
      } else {
        return endTimeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : endTimeOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video,
     * corresponding to the end of the segment (inclusive).
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time_offset = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getEndTimeOffsetFieldBuilder() {
      if (endTimeOffsetBuilder_ == null) {
        endTimeOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getEndTimeOffset(), getParentForChildren(), isClean());
        endTimeOffset_ = null;
      }
      return endTimeOffsetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p3beta1.VideoSegment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p3beta1.VideoSegment)
  private static final com.google.cloud.videointelligence.v1p3beta1.VideoSegment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p3beta1.VideoSegment();
  }

  public static com.google.cloud.videointelligence.v1p3beta1.VideoSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoSegment> PARSER =
      new com.google.protobuf.AbstractParser<VideoSegment>() {
        @java.lang.Override
        public VideoSegment parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VideoSegment(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VideoSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.VideoSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
