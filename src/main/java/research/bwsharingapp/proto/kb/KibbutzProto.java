// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kibbutz.proto

package research.bwsharingapp.proto.kb;

public final class KibbutzProto {
  private KibbutzProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_ClientInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_ClientInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_ClientConnectReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_ClientConnectReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_UserData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_UserData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_RegisterUserReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_RegisterUserReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_TrafficInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_TrafficInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_ClientIOU_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_ClientIOU_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_RouterIOU_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_RouterIOU_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_RouterIOUReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_RouterIOUReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_ClientIOUReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_ClientIOUReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_ClientIOUSigned_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_ClientIOUSigned_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kibbutz_RouterIOUSigned_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kibbutz_RouterIOUSigned_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rkibbutz.proto\022\007kibbutz\"R\n\nClientInfo\022\026" +
      "\n\016clientUsername\030\001 \001(\t\022\024\n\014clientPubKey\030\002" +
      " \001(\014\022\026\n\016routerUsername\030\003 \001(\t\"`\n\022ClientCo" +
      "nnectReply\022\024\n\014clientExists\030\001 \001(\010\022\022\n\nstat" +
      "usCode\030\002 \001(\005\022\021\n\tstatusMsg\030\003 \001(\t\022\r\n\005nonce" +
      "\030\004 \001(\014\">\n\010UserData\022\020\n\010username\030\001 \001(\t\022\020\n\010" +
      "deviceId\030\002 \001(\t\022\016\n\006pubKey\030\003 \001(\014\"7\n\021Regist" +
      "erUserReply\022\016\n\006status\030\001 \001(\010\022\022\n\nstatusCod" +
      "e\030\002 \001(\005\"D\n\013TrafficInfo\022\014\n\004pkts\030\001 \001(\003\022\r\n\005" +
      "bytes\030\002 \001(\003\022\013\n\003src\030\003 \001(\t\022\013\n\003dst\030\004 \001(\t\"\207\001",
      "\n\tClientIOU\022 \n\002in\030\001 \001(\0132\024.kibbutz.Traffi" +
      "cInfo\022!\n\003out\030\002 \001(\0132\024.kibbutz.TrafficInfo" +
      "\022\026\n\016clientUsername\030\003 \001(\t\022\016\n\006server\030\004 \001(\t" +
      "\022\r\n\005nonce\030\005 \001(\014\"\222\001\n\tRouterIOU\022 \n\002in\030\001 \001(" +
      "\0132\024.kibbutz.TrafficInfo\022!\n\003out\030\002 \001(\0132\024.k" +
      "ibbutz.TrafficInfo\0221\n\017clientIouSigned\030\003 " +
      "\001(\0132\030.kibbutz.ClientIOUSigned\022\r\n\005nonce\030\004" +
      " \001(\014\"5\n\016RouterIOUReply\022\017\n\007isValid\030\001 \001(\010\022" +
      "\022\n\nstatusCode\030\002 \001(\005\"$\n\016ClientIOUReply\022\022\n" +
      "\nstatusCode\030\001 \001(\005\"F\n\017ClientIOUSigned\022%\n\t",
      "clientIOU\030\001 \001(\0132\022.kibbutz.ClientIOU\022\014\n\004s" +
      "ign\030\002 \001(\014\"F\n\017RouterIOUSigned\022%\n\trouterIo" +
      "u\030\001 \001(\0132\022.kibbutz.RouterIOU\022\014\n\004sign\030\002 \001(" +
      "\0142\232\001\n\rKibbutzRouter\022C\n\rclientConnect\022\023.k" +
      "ibbutz.ClientInfo\032\033.kibbutz.ClientConnec" +
      "tReply\"\000\022D\n\rsendClientIOU\022\030.kibbutz.Clie" +
      "ntIOUSigned\032\027.kibbutz.ClientIOUReply\"\0002\325" +
      "\001\n\007Kibbutz\022D\n\rsendRouterIOU\022\030.kibbutz.Ro" +
      "uterIOUSigned\032\027.kibbutz.RouterIOUReply\"\000" +
      "\022?\n\014registerUser\022\021.kibbutz.UserData\032\032.ki",
      "bbutz.RegisterUserReply\"\000\022C\n\rclientConne" +
      "ct\022\023.kibbutz.ClientInfo\032\033.kibbutz.Client" +
      "ConnectReply\"\000B6\n\036research.bwsharingapp." +
      "proto.kbB\014KibbutzProtoP\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_kibbutz_ClientInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kibbutz_ClientInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_ClientInfo_descriptor,
        new java.lang.String[] { "ClientUsername", "ClientPubKey", "RouterUsername", });
    internal_static_kibbutz_ClientConnectReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kibbutz_ClientConnectReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_ClientConnectReply_descriptor,
        new java.lang.String[] { "ClientExists", "StatusCode", "StatusMsg", "Nonce", });
    internal_static_kibbutz_UserData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_kibbutz_UserData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_UserData_descriptor,
        new java.lang.String[] { "Username", "DeviceId", "PubKey", });
    internal_static_kibbutz_RegisterUserReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_kibbutz_RegisterUserReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_RegisterUserReply_descriptor,
        new java.lang.String[] { "Status", "StatusCode", });
    internal_static_kibbutz_TrafficInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_kibbutz_TrafficInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_TrafficInfo_descriptor,
        new java.lang.String[] { "Pkts", "Bytes", "Src", "Dst", });
    internal_static_kibbutz_ClientIOU_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_kibbutz_ClientIOU_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_ClientIOU_descriptor,
        new java.lang.String[] { "In", "Out", "ClientUsername", "Server", "Nonce", });
    internal_static_kibbutz_RouterIOU_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_kibbutz_RouterIOU_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_RouterIOU_descriptor,
        new java.lang.String[] { "In", "Out", "ClientIouSigned", "Nonce", });
    internal_static_kibbutz_RouterIOUReply_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_kibbutz_RouterIOUReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_RouterIOUReply_descriptor,
        new java.lang.String[] { "IsValid", "StatusCode", });
    internal_static_kibbutz_ClientIOUReply_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_kibbutz_ClientIOUReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_ClientIOUReply_descriptor,
        new java.lang.String[] { "StatusCode", });
    internal_static_kibbutz_ClientIOUSigned_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_kibbutz_ClientIOUSigned_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_ClientIOUSigned_descriptor,
        new java.lang.String[] { "ClientIOU", "Sign", });
    internal_static_kibbutz_RouterIOUSigned_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_kibbutz_RouterIOUSigned_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kibbutz_RouterIOUSigned_descriptor,
        new java.lang.String[] { "RouterIou", "Sign", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
