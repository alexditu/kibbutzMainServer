// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kibbutz.proto

package research.bwsharingapp.proto.kb;

public interface ClientIOUOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kibbutz.ClientIOU)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kibbutz.TrafficInfo in = 1;</code>
   */
  boolean hasIn();
  /**
   * <code>.kibbutz.TrafficInfo in = 1;</code>
   */
  research.bwsharingapp.proto.kb.TrafficInfo getIn();
  /**
   * <code>.kibbutz.TrafficInfo in = 1;</code>
   */
  research.bwsharingapp.proto.kb.TrafficInfoOrBuilder getInOrBuilder();

  /**
   * <code>.kibbutz.TrafficInfo out = 2;</code>
   */
  boolean hasOut();
  /**
   * <code>.kibbutz.TrafficInfo out = 2;</code>
   */
  research.bwsharingapp.proto.kb.TrafficInfo getOut();
  /**
   * <code>.kibbutz.TrafficInfo out = 2;</code>
   */
  research.bwsharingapp.proto.kb.TrafficInfoOrBuilder getOutOrBuilder();

  /**
   * <code>string clientUsername = 3;</code>
   */
  java.lang.String getClientUsername();
  /**
   * <code>string clientUsername = 3;</code>
   */
  com.google.protobuf.ByteString
      getClientUsernameBytes();

  /**
   * <code>string server = 4;</code>
   */
  java.lang.String getServer();
  /**
   * <code>string server = 4;</code>
   */
  com.google.protobuf.ByteString
      getServerBytes();

  /**
   * <code>bytes nonce = 5;</code>
   */
  com.google.protobuf.ByteString getNonce();
}
