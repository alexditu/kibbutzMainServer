// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kibbutz.proto

package research.bwsharingapp.proto.kb;

/**
 * <pre>
 * rpc sendRouterIOU -------------------------------------------------------------------------------
 * </pre>
 *
 * Protobuf type {@code kibbutz.TrafficInfo}
 */
public  final class TrafficInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kibbutz.TrafficInfo)
    TrafficInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrafficInfo.newBuilder() to construct.
  private TrafficInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrafficInfo() {
    pkts_ = 0L;
    bytes_ = 0L;
    src_ = "";
    dst_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrafficInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            pkts_ = input.readInt64();
            break;
          }
          case 16: {

            bytes_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            src_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            dst_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_TrafficInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_TrafficInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            research.bwsharingapp.proto.kb.TrafficInfo.class, research.bwsharingapp.proto.kb.TrafficInfo.Builder.class);
  }

  public static final int PKTS_FIELD_NUMBER = 1;
  private long pkts_;
  /**
   * <code>int64 pkts = 1;</code>
   */
  public long getPkts() {
    return pkts_;
  }

  public static final int BYTES_FIELD_NUMBER = 2;
  private long bytes_;
  /**
   * <code>int64 bytes = 2;</code>
   */
  public long getBytes() {
    return bytes_;
  }

  public static final int SRC_FIELD_NUMBER = 3;
  private volatile java.lang.Object src_;
  /**
   * <code>string src = 3;</code>
   */
  public java.lang.String getSrc() {
    java.lang.Object ref = src_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      src_ = s;
      return s;
    }
  }
  /**
   * <code>string src = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSrcBytes() {
    java.lang.Object ref = src_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      src_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DST_FIELD_NUMBER = 4;
  private volatile java.lang.Object dst_;
  /**
   * <code>string dst = 4;</code>
   */
  public java.lang.String getDst() {
    java.lang.Object ref = dst_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dst_ = s;
      return s;
    }
  }
  /**
   * <code>string dst = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDstBytes() {
    java.lang.Object ref = dst_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dst_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (pkts_ != 0L) {
      output.writeInt64(1, pkts_);
    }
    if (bytes_ != 0L) {
      output.writeInt64(2, bytes_);
    }
    if (!getSrcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, src_);
    }
    if (!getDstBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dst_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pkts_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pkts_);
    }
    if (bytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bytes_);
    }
    if (!getSrcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, src_);
    }
    if (!getDstBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dst_);
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
    if (!(obj instanceof research.bwsharingapp.proto.kb.TrafficInfo)) {
      return super.equals(obj);
    }
    research.bwsharingapp.proto.kb.TrafficInfo other = (research.bwsharingapp.proto.kb.TrafficInfo) obj;

    boolean result = true;
    result = result && (getPkts()
        == other.getPkts());
    result = result && (getBytes()
        == other.getBytes());
    result = result && getSrc()
        .equals(other.getSrc());
    result = result && getDst()
        .equals(other.getDst());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PKTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPkts());
    hash = (37 * hash) + BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBytes());
    hash = (37 * hash) + SRC_FIELD_NUMBER;
    hash = (53 * hash) + getSrc().hashCode();
    hash = (37 * hash) + DST_FIELD_NUMBER;
    hash = (53 * hash) + getDst().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static research.bwsharingapp.proto.kb.TrafficInfo parseFrom(
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
  public static Builder newBuilder(research.bwsharingapp.proto.kb.TrafficInfo prototype) {
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
   * <pre>
   * rpc sendRouterIOU -------------------------------------------------------------------------------
   * </pre>
   *
   * Protobuf type {@code kibbutz.TrafficInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kibbutz.TrafficInfo)
      research.bwsharingapp.proto.kb.TrafficInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_TrafficInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_TrafficInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              research.bwsharingapp.proto.kb.TrafficInfo.class, research.bwsharingapp.proto.kb.TrafficInfo.Builder.class);
    }

    // Construct using research.bwsharingapp.proto.kb.TrafficInfo.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      pkts_ = 0L;

      bytes_ = 0L;

      src_ = "";

      dst_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_TrafficInfo_descriptor;
    }

    public research.bwsharingapp.proto.kb.TrafficInfo getDefaultInstanceForType() {
      return research.bwsharingapp.proto.kb.TrafficInfo.getDefaultInstance();
    }

    public research.bwsharingapp.proto.kb.TrafficInfo build() {
      research.bwsharingapp.proto.kb.TrafficInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public research.bwsharingapp.proto.kb.TrafficInfo buildPartial() {
      research.bwsharingapp.proto.kb.TrafficInfo result = new research.bwsharingapp.proto.kb.TrafficInfo(this);
      result.pkts_ = pkts_;
      result.bytes_ = bytes_;
      result.src_ = src_;
      result.dst_ = dst_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof research.bwsharingapp.proto.kb.TrafficInfo) {
        return mergeFrom((research.bwsharingapp.proto.kb.TrafficInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(research.bwsharingapp.proto.kb.TrafficInfo other) {
      if (other == research.bwsharingapp.proto.kb.TrafficInfo.getDefaultInstance()) return this;
      if (other.getPkts() != 0L) {
        setPkts(other.getPkts());
      }
      if (other.getBytes() != 0L) {
        setBytes(other.getBytes());
      }
      if (!other.getSrc().isEmpty()) {
        src_ = other.src_;
        onChanged();
      }
      if (!other.getDst().isEmpty()) {
        dst_ = other.dst_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      research.bwsharingapp.proto.kb.TrafficInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (research.bwsharingapp.proto.kb.TrafficInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pkts_ ;
    /**
     * <code>int64 pkts = 1;</code>
     */
    public long getPkts() {
      return pkts_;
    }
    /**
     * <code>int64 pkts = 1;</code>
     */
    public Builder setPkts(long value) {
      
      pkts_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pkts = 1;</code>
     */
    public Builder clearPkts() {
      
      pkts_ = 0L;
      onChanged();
      return this;
    }

    private long bytes_ ;
    /**
     * <code>int64 bytes = 2;</code>
     */
    public long getBytes() {
      return bytes_;
    }
    /**
     * <code>int64 bytes = 2;</code>
     */
    public Builder setBytes(long value) {
      
      bytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bytes = 2;</code>
     */
    public Builder clearBytes() {
      
      bytes_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object src_ = "";
    /**
     * <code>string src = 3;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        src_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string src = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string src = 3;</code>
     */
    public Builder setSrc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      src_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string src = 3;</code>
     */
    public Builder clearSrc() {
      
      src_ = getDefaultInstance().getSrc();
      onChanged();
      return this;
    }
    /**
     * <code>string src = 3;</code>
     */
    public Builder setSrcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      src_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dst_ = "";
    /**
     * <code>string dst = 4;</code>
     */
    public java.lang.String getDst() {
      java.lang.Object ref = dst_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dst_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dst = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDstBytes() {
      java.lang.Object ref = dst_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dst_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dst = 4;</code>
     */
    public Builder setDst(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dst_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dst = 4;</code>
     */
    public Builder clearDst() {
      
      dst_ = getDefaultInstance().getDst();
      onChanged();
      return this;
    }
    /**
     * <code>string dst = 4;</code>
     */
    public Builder setDstBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dst_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kibbutz.TrafficInfo)
  }

  // @@protoc_insertion_point(class_scope:kibbutz.TrafficInfo)
  private static final research.bwsharingapp.proto.kb.TrafficInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new research.bwsharingapp.proto.kb.TrafficInfo();
  }

  public static research.bwsharingapp.proto.kb.TrafficInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrafficInfo>
      PARSER = new com.google.protobuf.AbstractParser<TrafficInfo>() {
    public TrafficInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrafficInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrafficInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrafficInfo> getParserForType() {
    return PARSER;
  }

  public research.bwsharingapp.proto.kb.TrafficInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

