// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: power.proto

package com.power.grpc;

/**
 * Protobuf type {@code com.power.grpc.PowerResponse}
 */
public  final class PowerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.power.grpc.PowerResponse)
    PowerResponseOrBuilder {
  // Use PowerResponse.newBuilder() to construct.
  private PowerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PowerResponse() {
    id_ = 0;
    powerId_ = 0;
    powerName_ = "";
    powerUrl_ = "";
    parentId_ = 0;
    power_ = java.util.Collections.emptyList();
    statusId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PowerResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            powerName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            powerUrl_ = s;
            break;
          }
          case 24: {

            parentId_ = input.readInt32();
            break;
          }
          case 32: {

            powerId_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              power_ = new java.util.ArrayList<com.power.grpc.Power>();
              mutable_bitField0_ |= 0x00000020;
            }
            power_.add(
                input.readMessage(com.power.grpc.Power.parser(), extensionRegistry));
            break;
          }
          case 48: {

            statusId_ = input.readInt32();
            break;
          }
          case 80: {

            id_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        power_ = java.util.Collections.unmodifiableList(power_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.power.grpc.PowerOuterClass.internal_static_com_power_grpc_PowerResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.power.grpc.PowerOuterClass.internal_static_com_power_grpc_PowerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.power.grpc.PowerResponse.class, com.power.grpc.PowerResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 10;
  private int id_;
  /**
   * <code>int32 id = 10;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int POWER_ID_FIELD_NUMBER = 4;
  private int powerId_;
  /**
   * <code>int32 power_id = 4;</code>
   */
  public int getPowerId() {
    return powerId_;
  }

  public static final int POWER_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object powerName_;
  /**
   * <code>string power_name = 1;</code>
   */
  public java.lang.String getPowerName() {
    java.lang.Object ref = powerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      powerName_ = s;
      return s;
    }
  }
  /**
   * <code>string power_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPowerNameBytes() {
    java.lang.Object ref = powerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      powerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POWER_URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object powerUrl_;
  /**
   * <code>string power_url = 2;</code>
   */
  public java.lang.String getPowerUrl() {
    java.lang.Object ref = powerUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      powerUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string power_url = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPowerUrlBytes() {
    java.lang.Object ref = powerUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      powerUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_ID_FIELD_NUMBER = 3;
  private int parentId_;
  /**
   * <code>int32 parent_id = 3;</code>
   */
  public int getParentId() {
    return parentId_;
  }

  public static final int POWER_FIELD_NUMBER = 5;
  private java.util.List<com.power.grpc.Power> power_;
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  public java.util.List<com.power.grpc.Power> getPowerList() {
    return power_;
  }
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  public java.util.List<? extends com.power.grpc.PowerOrBuilder> 
      getPowerOrBuilderList() {
    return power_;
  }
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  public int getPowerCount() {
    return power_.size();
  }
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  public com.power.grpc.Power getPower(int index) {
    return power_.get(index);
  }
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  public com.power.grpc.PowerOrBuilder getPowerOrBuilder(
      int index) {
    return power_.get(index);
  }

  public static final int STATUS_ID_FIELD_NUMBER = 6;
  private int statusId_;
  /**
   * <code>int32 status_id = 6;</code>
   */
  public int getStatusId() {
    return statusId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPowerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, powerName_);
    }
    if (!getPowerUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, powerUrl_);
    }
    if (parentId_ != 0) {
      output.writeInt32(3, parentId_);
    }
    if (powerId_ != 0) {
      output.writeInt32(4, powerId_);
    }
    for (int i = 0; i < power_.size(); i++) {
      output.writeMessage(5, power_.get(i));
    }
    if (statusId_ != 0) {
      output.writeInt32(6, statusId_);
    }
    if (id_ != 0) {
      output.writeInt32(10, id_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPowerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, powerName_);
    }
    if (!getPowerUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, powerUrl_);
    }
    if (parentId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, parentId_);
    }
    if (powerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, powerId_);
    }
    for (int i = 0; i < power_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, power_.get(i));
    }
    if (statusId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, statusId_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, id_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.power.grpc.PowerResponse)) {
      return super.equals(obj);
    }
    com.power.grpc.PowerResponse other = (com.power.grpc.PowerResponse) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (getPowerId()
        == other.getPowerId());
    result = result && getPowerName()
        .equals(other.getPowerName());
    result = result && getPowerUrl()
        .equals(other.getPowerUrl());
    result = result && (getParentId()
        == other.getParentId());
    result = result && getPowerList()
        .equals(other.getPowerList());
    result = result && (getStatusId()
        == other.getStatusId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + POWER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPowerId();
    hash = (37 * hash) + POWER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPowerName().hashCode();
    hash = (37 * hash) + POWER_URL_FIELD_NUMBER;
    hash = (53 * hash) + getPowerUrl().hashCode();
    hash = (37 * hash) + PARENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getParentId();
    if (getPowerCount() > 0) {
      hash = (37 * hash) + POWER_FIELD_NUMBER;
      hash = (53 * hash) + getPowerList().hashCode();
    }
    hash = (37 * hash) + STATUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStatusId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.power.grpc.PowerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.power.grpc.PowerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.power.grpc.PowerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.power.grpc.PowerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.power.grpc.PowerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.power.grpc.PowerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.power.grpc.PowerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.power.grpc.PowerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.power.grpc.PowerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.power.grpc.PowerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.power.grpc.PowerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.power.grpc.PowerResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.power.grpc.PowerResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.power.grpc.PowerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.power.grpc.PowerResponse)
      com.power.grpc.PowerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.power.grpc.PowerOuterClass.internal_static_com_power_grpc_PowerResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.power.grpc.PowerOuterClass.internal_static_com_power_grpc_PowerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.power.grpc.PowerResponse.class, com.power.grpc.PowerResponse.Builder.class);
    }

    // Construct using com.power.grpc.PowerResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPowerFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0;

      powerId_ = 0;

      powerName_ = "";

      powerUrl_ = "";

      parentId_ = 0;

      if (powerBuilder_ == null) {
        power_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
      } else {
        powerBuilder_.clear();
      }
      statusId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.power.grpc.PowerOuterClass.internal_static_com_power_grpc_PowerResponse_descriptor;
    }

    public com.power.grpc.PowerResponse getDefaultInstanceForType() {
      return com.power.grpc.PowerResponse.getDefaultInstance();
    }

    public com.power.grpc.PowerResponse build() {
      com.power.grpc.PowerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.power.grpc.PowerResponse buildPartial() {
      com.power.grpc.PowerResponse result = new com.power.grpc.PowerResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.powerId_ = powerId_;
      result.powerName_ = powerName_;
      result.powerUrl_ = powerUrl_;
      result.parentId_ = parentId_;
      if (powerBuilder_ == null) {
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          power_ = java.util.Collections.unmodifiableList(power_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.power_ = power_;
      } else {
        result.power_ = powerBuilder_.build();
      }
      result.statusId_ = statusId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.power.grpc.PowerResponse) {
        return mergeFrom((com.power.grpc.PowerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.power.grpc.PowerResponse other) {
      if (other == com.power.grpc.PowerResponse.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getPowerId() != 0) {
        setPowerId(other.getPowerId());
      }
      if (!other.getPowerName().isEmpty()) {
        powerName_ = other.powerName_;
        onChanged();
      }
      if (!other.getPowerUrl().isEmpty()) {
        powerUrl_ = other.powerUrl_;
        onChanged();
      }
      if (other.getParentId() != 0) {
        setParentId(other.getParentId());
      }
      if (powerBuilder_ == null) {
        if (!other.power_.isEmpty()) {
          if (power_.isEmpty()) {
            power_ = other.power_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensurePowerIsMutable();
            power_.addAll(other.power_);
          }
          onChanged();
        }
      } else {
        if (!other.power_.isEmpty()) {
          if (powerBuilder_.isEmpty()) {
            powerBuilder_.dispose();
            powerBuilder_ = null;
            power_ = other.power_;
            bitField0_ = (bitField0_ & ~0x00000020);
            powerBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPowerFieldBuilder() : null;
          } else {
            powerBuilder_.addAllMessages(other.power_);
          }
        }
      }
      if (other.getStatusId() != 0) {
        setStatusId(other.getStatusId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.power.grpc.PowerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.power.grpc.PowerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 10;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 10;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 10;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int powerId_ ;
    /**
     * <code>int32 power_id = 4;</code>
     */
    public int getPowerId() {
      return powerId_;
    }
    /**
     * <code>int32 power_id = 4;</code>
     */
    public Builder setPowerId(int value) {
      
      powerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 power_id = 4;</code>
     */
    public Builder clearPowerId() {
      
      powerId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object powerName_ = "";
    /**
     * <code>string power_name = 1;</code>
     */
    public java.lang.String getPowerName() {
      java.lang.Object ref = powerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        powerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string power_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPowerNameBytes() {
      java.lang.Object ref = powerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        powerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string power_name = 1;</code>
     */
    public Builder setPowerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      powerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string power_name = 1;</code>
     */
    public Builder clearPowerName() {
      
      powerName_ = getDefaultInstance().getPowerName();
      onChanged();
      return this;
    }
    /**
     * <code>string power_name = 1;</code>
     */
    public Builder setPowerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      powerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object powerUrl_ = "";
    /**
     * <code>string power_url = 2;</code>
     */
    public java.lang.String getPowerUrl() {
      java.lang.Object ref = powerUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        powerUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string power_url = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPowerUrlBytes() {
      java.lang.Object ref = powerUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        powerUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string power_url = 2;</code>
     */
    public Builder setPowerUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      powerUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string power_url = 2;</code>
     */
    public Builder clearPowerUrl() {
      
      powerUrl_ = getDefaultInstance().getPowerUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string power_url = 2;</code>
     */
    public Builder setPowerUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      powerUrl_ = value;
      onChanged();
      return this;
    }

    private int parentId_ ;
    /**
     * <code>int32 parent_id = 3;</code>
     */
    public int getParentId() {
      return parentId_;
    }
    /**
     * <code>int32 parent_id = 3;</code>
     */
    public Builder setParentId(int value) {
      
      parentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 parent_id = 3;</code>
     */
    public Builder clearParentId() {
      
      parentId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.power.grpc.Power> power_ =
      java.util.Collections.emptyList();
    private void ensurePowerIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        power_ = new java.util.ArrayList<com.power.grpc.Power>(power_);
        bitField0_ |= 0x00000020;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.power.grpc.Power, com.power.grpc.Power.Builder, com.power.grpc.PowerOrBuilder> powerBuilder_;

    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public java.util.List<com.power.grpc.Power> getPowerList() {
      if (powerBuilder_ == null) {
        return java.util.Collections.unmodifiableList(power_);
      } else {
        return powerBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public int getPowerCount() {
      if (powerBuilder_ == null) {
        return power_.size();
      } else {
        return powerBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public com.power.grpc.Power getPower(int index) {
      if (powerBuilder_ == null) {
        return power_.get(index);
      } else {
        return powerBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder setPower(
        int index, com.power.grpc.Power value) {
      if (powerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePowerIsMutable();
        power_.set(index, value);
        onChanged();
      } else {
        powerBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder setPower(
        int index, com.power.grpc.Power.Builder builderForValue) {
      if (powerBuilder_ == null) {
        ensurePowerIsMutable();
        power_.set(index, builderForValue.build());
        onChanged();
      } else {
        powerBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder addPower(com.power.grpc.Power value) {
      if (powerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePowerIsMutable();
        power_.add(value);
        onChanged();
      } else {
        powerBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder addPower(
        int index, com.power.grpc.Power value) {
      if (powerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePowerIsMutable();
        power_.add(index, value);
        onChanged();
      } else {
        powerBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder addPower(
        com.power.grpc.Power.Builder builderForValue) {
      if (powerBuilder_ == null) {
        ensurePowerIsMutable();
        power_.add(builderForValue.build());
        onChanged();
      } else {
        powerBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder addPower(
        int index, com.power.grpc.Power.Builder builderForValue) {
      if (powerBuilder_ == null) {
        ensurePowerIsMutable();
        power_.add(index, builderForValue.build());
        onChanged();
      } else {
        powerBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder addAllPower(
        java.lang.Iterable<? extends com.power.grpc.Power> values) {
      if (powerBuilder_ == null) {
        ensurePowerIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, power_);
        onChanged();
      } else {
        powerBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder clearPower() {
      if (powerBuilder_ == null) {
        power_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
      } else {
        powerBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public Builder removePower(int index) {
      if (powerBuilder_ == null) {
        ensurePowerIsMutable();
        power_.remove(index);
        onChanged();
      } else {
        powerBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public com.power.grpc.Power.Builder getPowerBuilder(
        int index) {
      return getPowerFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public com.power.grpc.PowerOrBuilder getPowerOrBuilder(
        int index) {
      if (powerBuilder_ == null) {
        return power_.get(index);  } else {
        return powerBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public java.util.List<? extends com.power.grpc.PowerOrBuilder> 
         getPowerOrBuilderList() {
      if (powerBuilder_ != null) {
        return powerBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(power_);
      }
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public com.power.grpc.Power.Builder addPowerBuilder() {
      return getPowerFieldBuilder().addBuilder(
          com.power.grpc.Power.getDefaultInstance());
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public com.power.grpc.Power.Builder addPowerBuilder(
        int index) {
      return getPowerFieldBuilder().addBuilder(
          index, com.power.grpc.Power.getDefaultInstance());
    }
    /**
     * <code>repeated .com.power.grpc.Power power = 5;</code>
     */
    public java.util.List<com.power.grpc.Power.Builder> 
         getPowerBuilderList() {
      return getPowerFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.power.grpc.Power, com.power.grpc.Power.Builder, com.power.grpc.PowerOrBuilder> 
        getPowerFieldBuilder() {
      if (powerBuilder_ == null) {
        powerBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.power.grpc.Power, com.power.grpc.Power.Builder, com.power.grpc.PowerOrBuilder>(
                power_,
                ((bitField0_ & 0x00000020) == 0x00000020),
                getParentForChildren(),
                isClean());
        power_ = null;
      }
      return powerBuilder_;
    }

    private int statusId_ ;
    /**
     * <code>int32 status_id = 6;</code>
     */
    public int getStatusId() {
      return statusId_;
    }
    /**
     * <code>int32 status_id = 6;</code>
     */
    public Builder setStatusId(int value) {
      
      statusId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status_id = 6;</code>
     */
    public Builder clearStatusId() {
      
      statusId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.power.grpc.PowerResponse)
  }

  // @@protoc_insertion_point(class_scope:com.power.grpc.PowerResponse)
  private static final com.power.grpc.PowerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.power.grpc.PowerResponse();
  }

  public static com.power.grpc.PowerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PowerResponse>
      PARSER = new com.google.protobuf.AbstractParser<PowerResponse>() {
    public PowerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PowerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PowerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PowerResponse> getParserForType() {
    return PARSER;
  }

  public com.power.grpc.PowerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

