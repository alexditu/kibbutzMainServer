package research.bwsharingapp.proto.kb;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: kibbutz.proto")
public final class KibbutzRouterGrpc {

  private KibbutzRouterGrpc() {}

  public static final String SERVICE_NAME = "kibbutz.KibbutzRouter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<research.bwsharingapp.proto.kb.ClientInfo,
      research.bwsharingapp.proto.kb.ClientConnectReply> METHOD_CLIENT_CONNECT =
      io.grpc.MethodDescriptor.<research.bwsharingapp.proto.kb.ClientInfo, research.bwsharingapp.proto.kb.ClientConnectReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kibbutz.KibbutzRouter", "clientConnect"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              research.bwsharingapp.proto.kb.ClientInfo.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              research.bwsharingapp.proto.kb.ClientConnectReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<research.bwsharingapp.proto.kb.ClientIOUSigned,
      research.bwsharingapp.proto.kb.ClientIOUReply> METHOD_SEND_CLIENT_IOU =
      io.grpc.MethodDescriptor.<research.bwsharingapp.proto.kb.ClientIOUSigned, research.bwsharingapp.proto.kb.ClientIOUReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kibbutz.KibbutzRouter", "sendClientIOU"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              research.bwsharingapp.proto.kb.ClientIOUSigned.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              research.bwsharingapp.proto.kb.ClientIOUReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KibbutzRouterStub newStub(io.grpc.Channel channel) {
    return new KibbutzRouterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KibbutzRouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KibbutzRouterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KibbutzRouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KibbutzRouterFutureStub(channel);
  }

  /**
   */
  public static abstract class KibbutzRouterImplBase implements io.grpc.BindableService {

    /**
     */
    public void clientConnect(research.bwsharingapp.proto.kb.ClientInfo request,
        io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.ClientConnectReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLIENT_CONNECT, responseObserver);
    }

    /**
     */
    public void sendClientIOU(research.bwsharingapp.proto.kb.ClientIOUSigned request,
        io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.ClientIOUReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_CLIENT_IOU, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CLIENT_CONNECT,
            asyncUnaryCall(
              new MethodHandlers<
                research.bwsharingapp.proto.kb.ClientInfo,
                research.bwsharingapp.proto.kb.ClientConnectReply>(
                  this, METHODID_CLIENT_CONNECT)))
          .addMethod(
            METHOD_SEND_CLIENT_IOU,
            asyncUnaryCall(
              new MethodHandlers<
                research.bwsharingapp.proto.kb.ClientIOUSigned,
                research.bwsharingapp.proto.kb.ClientIOUReply>(
                  this, METHODID_SEND_CLIENT_IOU)))
          .build();
    }
  }

  /**
   */
  public static final class KibbutzRouterStub extends io.grpc.stub.AbstractStub<KibbutzRouterStub> {
    private KibbutzRouterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KibbutzRouterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KibbutzRouterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KibbutzRouterStub(channel, callOptions);
    }

    /**
     */
    public void clientConnect(research.bwsharingapp.proto.kb.ClientInfo request,
        io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.ClientConnectReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLIENT_CONNECT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendClientIOU(research.bwsharingapp.proto.kb.ClientIOUSigned request,
        io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.ClientIOUReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_CLIENT_IOU, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KibbutzRouterBlockingStub extends io.grpc.stub.AbstractStub<KibbutzRouterBlockingStub> {
    private KibbutzRouterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KibbutzRouterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KibbutzRouterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KibbutzRouterBlockingStub(channel, callOptions);
    }

    /**
     */
    public research.bwsharingapp.proto.kb.ClientConnectReply clientConnect(research.bwsharingapp.proto.kb.ClientInfo request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLIENT_CONNECT, getCallOptions(), request);
    }

    /**
     */
    public research.bwsharingapp.proto.kb.ClientIOUReply sendClientIOU(research.bwsharingapp.proto.kb.ClientIOUSigned request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_CLIENT_IOU, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KibbutzRouterFutureStub extends io.grpc.stub.AbstractStub<KibbutzRouterFutureStub> {
    private KibbutzRouterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KibbutzRouterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KibbutzRouterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KibbutzRouterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<research.bwsharingapp.proto.kb.ClientConnectReply> clientConnect(
        research.bwsharingapp.proto.kb.ClientInfo request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLIENT_CONNECT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<research.bwsharingapp.proto.kb.ClientIOUReply> sendClientIOU(
        research.bwsharingapp.proto.kb.ClientIOUSigned request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_CLIENT_IOU, getCallOptions()), request);
    }
  }

  private static final int METHODID_CLIENT_CONNECT = 0;
  private static final int METHODID_SEND_CLIENT_IOU = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KibbutzRouterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KibbutzRouterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_CONNECT:
          serviceImpl.clientConnect((research.bwsharingapp.proto.kb.ClientInfo) request,
              (io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.ClientConnectReply>) responseObserver);
          break;
        case METHODID_SEND_CLIENT_IOU:
          serviceImpl.sendClientIOU((research.bwsharingapp.proto.kb.ClientIOUSigned) request,
              (io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.ClientIOUReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class KibbutzRouterDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return research.bwsharingapp.proto.kb.KibbutzProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KibbutzRouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KibbutzRouterDescriptorSupplier())
              .addMethod(METHOD_CLIENT_CONNECT)
              .addMethod(METHOD_SEND_CLIENT_IOU)
              .build();
        }
      }
    }
    return result;
  }
}
