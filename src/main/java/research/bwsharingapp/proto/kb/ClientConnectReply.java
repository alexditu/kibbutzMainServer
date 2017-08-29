// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kibbutz.proto

package research.bwsharingapp.proto.kb;

/**
 * Protobuf type {@code kibbutz.ClientConnectReply}
 */
public  final class ClientConnectReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kibbutz.ClientConnectReply)
    ClientConnectReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientConnectReply.newBuilder() to construct.
  private ClientConnectReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientConnectReply() {
    clientExists_ = false;
    statusCode_ = 0;
    statusMsg_ = "";
    nonce_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientConnectReply(
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

            clientExists_ = input.readBool();
            break;
          }
          case 16: {

            statusCode_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            statusMsg_ = s;
            break;
          }
          case 34: {

            nonce_ = input.readBytes();
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
    return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_ClientConnectReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_ClientConnectReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            research.bwsharingapp.proto.kb.ClientConnectReply.class, research.bwsharingapp.proto.kb.ClientConnectReply.Builder.class);
  }

  public static final int CLIENTEXISTS_FIELD_NUMBER = 1;
  private boolean clientExists_;
  /**
   * <code>bool clientExists = 1;</code>
   */
  public boolean getClientExists() {
    return clientExists_;
  }

  public static final int STATUSCODE_FIELD_NUMBER = 2;
  private int statusCode_;
  /**
   * <code>int32 statusCode = 2;</code>
   */
  public int getStatusCode() {
    return statusCode_;
  }

  public static final int STATUSMSG_FIELD_NUMBER = 3;
  private volatile java.lang.Object statusMsg_;
  /**
   * <code>string statusMsg = 3;</code>
   */
  public java.lang.String getStatusMsg() {
    java.lang.Object ref = statusMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      statusMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string statusMsg = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStatusMsgBytes() {
    java.lang.Object ref = statusMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      statusMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NONCE_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString nonce_;
  /**
   * <code>bytes nonce = 4;</code>
   */
  public com.google.protobuf.ByteString getNonce() {
    return nonce_;
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
    if (clientExists_ != false) {
      output.writeBool(1, clientExists_);
    }
    if (statusCode_ != 0) {
      output.writeInt32(2, statusCode_);
    }
    if (!getStatusMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, statusMsg_);
    }
    if (!nonce_.isEmpty()) {
      output.writeBytes(4, nonce_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientExists_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, clientExists_);
    }
    if (statusCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, statusCode_);
    }
    if (!getStatusMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, statusMsg_);
    }
    if (!nonce_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, nonce_);
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
    if (!(obj instanceof research.bwsharingapp.proto.kb.ClientConnectReply)) {
      return super.equals(obj);
    }
    research.bwsharingapp.proto.kb.ClientConnectReply other = (research.bwsharingapp.proto.kb.ClientConnectReply) obj;

    boolean result = true;
    result = result && (getClientExists()
        == other.getClientExists());
    result = result && (getStatusCode()
        == other.getStatusCode());
    result = result && getStatusMsg()
        .equals(other.getStatusMsg());
    result = result && getNonce()
        .equals(other.getNonce());
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
    hash = (37 * hash) + CLIENTEXISTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getClientExists());
    hash = (37 * hash) + STATUSCODE_FIELD_NUMBER;
    hash = (53 * hash) + getStatusCode();
    hash = (37 * hash) + STATUSMSG_FIELD_NUMBER;
    hash = (53 * hash) + getStatusMsg().hashCode();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getNonce().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static research.bwsharingapp.proto.kb.ClientConnectReply parseFrom(
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
  public static Builder newBuilder(research.bwsharingapp.proto.kb.ClientConnectReply prototype) {
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
   * Protobuf type {@code kibbutz.ClientConnectReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kibbutz.ClientConnectReply)
      research.bwsharingapp.proto.kb.ClientConnectReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_ClientConnectReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_ClientConnectReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              research.bwsharingapp.proto.kb.ClientConnectReply.class, research.bwsharingapp.proto.kb.ClientConnectReply.Builder.class);
    }

    // Construct using research.bwsharingapp.proto.kb.ClientConnectReply.newBuilder()
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
      clientExists_ = false;

      statusCode_ = 0;

      statusMsg_ = "";

      nonce_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return research.bwsharingapp.proto.kb.KibbutzProto.internal_static_kibbutz_ClientConnectReply_descriptor;
    }

    public research.bwsharingapp.proto.kb.ClientConnectReply getDefaultInstanceForType() {
      return research.bwsharingapp.proto.kb.ClientConnectReply.getDefaultInstance();
    }

    public research.bwsharingapp.proto.kb.ClientConnectReply build() {
      research.bwsharingapp.proto.kb.ClientConnectReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public research.bwsharingapp.proto.kb.ClientConnectReply buildPartial() {
      research.bwsharingapp.proto.kb.ClientConnectReply result = new research.bwsharingapp.proto.kb.ClientConnectReply(this);
      result.clientExists_ = clientExists_;
      result.statusCode_ = statusCode_;
      result.statusMsg_ = statusMsg_;
      result.nonce_ = nonce_;
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
      if (other instanceof research.bwsharingapp.proto.kb.ClientConnectReply) {
        return mergeFrom((research.bwsharingapp.proto.kb.ClientConnectReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(research.bwsharingapp.proto.kb.ClientConnectReply other) {
      if (other == research.bwsharingapp.proto.kb.ClientConnectReply.getDefaultInstance()) return this;
      if (other.getClientExists() != false) {
        setClientExists(other.getClientExists());
      }
      if (other.getStatusCode() != 0) {
        setStatusCode(other.getStatusCode());
      }
      if (!other.getStatusMsg().isEmpty()) {
        statusMsg_ = other.statusMsg_;
        onChanged();
      }
      if (other.getNonce() != com.google.protobuf.ByteString.EMPTY) {
        setNonce(other.getNonce());
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
      research.bwsharingapp.proto.kb.ClientConnectReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (research.bwsharingapp.proto.kb.ClientConnectReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean clientExists_ ;
    /**
     * <code>bool clientExists = 1;</code>
     */
    public boolean getClientExists() {
      return clientExists_;
    }
    /**
     * <code>bool clientExists = 1;</code>
     */
    public Builder setClientExists(boolean value) {
      
      clientExists_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool clientExists = 1;</code>
     */
    public Builder clearClientExists() {
      
      clientExists_ = false;
      onChanged();
      return this;
    }

    private int statusCode_ ;
    /**
     * <code>int32 statusCode = 2;</code>
     */
    public int getStatusCode() {
      return statusCode_;
    }
    /**
     * <code>int32 statusCode = 2;</code>
     */
    public Builder setStatusCode(int value) {
      
      statusCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 statusCode = 2;</code>
     */
    public Builder clearStatusCode() {
      
      statusCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object statusMsg_ = "";
    /**
     * <code>string statusMsg = 3;</code>
     */
    public java.lang.String getStatusMsg() {
      java.lang.Object ref = statusMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        statusMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string statusMsg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStatusMsgBytes() {
      java.lang.Object ref = statusMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        statusMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string statusMsg = 3;</code>
     */
    public Builder setStatusMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      statusMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string statusMsg = 3;</code>
     */
    public Builder clearStatusMsg() {
      
      statusMsg_ = getDefaultInstance().getStatusMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string statusMsg = 3;</code>
     */
    public Builder setStatusMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      statusMsg_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString nonce_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes nonce = 4;</code>
     */
    public com.google.protobuf.ByteString getNonce() {
      return nonce_;
    }
    /**
     * <code>bytes nonce = 4;</code>
     */
    public Builder setNonce(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nonce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes nonce = 4;</code>
     */
    public Builder clearNonce() {
      
      nonce_ = getDefaultInstance().getNonce();
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


    // @@protoc_insertion_point(builder_scope:kibbutz.ClientConnectReply)
  }

  // @@protoc_insertion_point(class_scope:kibbutz.ClientConnectReply)
  private static final research.bwsharingapp.proto.kb.ClientConnectReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new research.bwsharingapp.proto.kb.ClientConnectReply();
  }

  public static research.bwsharingapp.proto.kb.ClientConnectReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientConnectReply>
      PARSER = new com.google.protobuf.AbstractParser<ClientConnectReply>() {
    public ClientConnectReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientConnectReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientConnectReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientConnectReply> getParserForType() {
    return PARSER;
  }

  public research.bwsharingapp.proto.kb.ClientConnectReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

