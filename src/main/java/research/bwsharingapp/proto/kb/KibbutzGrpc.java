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
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: kibbutz.proto")
public final class KibbutzGrpc {

  private KibbutzGrpc() {}

  public static final String SERVICE_NAME = "kibbutz.Kibbutz";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<research.bwsharingapp.proto.kb.RouterIOU,
      research.bwsharingapp.proto.kb.RouterIOUReply> METHOD_SEND_ROUTER_IOU =
      io.grpc.MethodDescriptor.<research.bwsharingapp.proto.kb.RouterIOU, research.bwsharingapp.proto.kb.RouterIOUReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kibbutz.Kibbutz", "sendRouterIOU"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              research.bwsharingapp.proto.kb.RouterIOU.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              research.bwsharingapp.proto.kb.RouterIOUReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KibbutzStub newStub(io.grpc.Channel channel) {
    return new KibbutzStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KibbutzBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KibbutzBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KibbutzFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KibbutzFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class KibbutzImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sendRouterIOU(research.bwsharingapp.proto.kb.RouterIOU request,
        io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.RouterIOUReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_ROUTER_IOU, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_ROUTER_IOU,
            asyncUnaryCall(
              new MethodHandlers<
                research.bwsharingapp.proto.kb.RouterIOU,
                research.bwsharingapp.proto.kb.RouterIOUReply>(
                  this, METHODID_SEND_ROUTER_IOU)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class KibbutzStub extends io.grpc.stub.AbstractStub<KibbutzStub> {
    private KibbutzStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KibbutzStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KibbutzStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KibbutzStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sendRouterIOU(research.bwsharingapp.proto.kb.RouterIOU request,
        io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.RouterIOUReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_ROUTER_IOU, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class KibbutzBlockingStub extends io.grpc.stub.AbstractStub<KibbutzBlockingStub> {
    private KibbutzBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KibbutzBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KibbutzBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KibbutzBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public research.bwsharingapp.proto.kb.RouterIOUReply sendRouterIOU(research.bwsharingapp.proto.kb.RouterIOU request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_ROUTER_IOU, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class KibbutzFutureStub extends io.grpc.stub.AbstractStub<KibbutzFutureStub> {
    private KibbutzFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KibbutzFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KibbutzFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KibbutzFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<research.bwsharingapp.proto.kb.RouterIOUReply> sendRouterIOU(
        research.bwsharingapp.proto.kb.RouterIOU request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_ROUTER_IOU, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_ROUTER_IOU = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KibbutzImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KibbutzImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_ROUTER_IOU:
          serviceImpl.sendRouterIOU((research.bwsharingapp.proto.kb.RouterIOU) request,
              (io.grpc.stub.StreamObserver<research.bwsharingapp.proto.kb.RouterIOUReply>) responseObserver);
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

  private static final class KibbutzDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return research.bwsharingapp.proto.kb.KibbutzProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KibbutzGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KibbutzDescriptorSupplier())
              .addMethod(METHOD_SEND_ROUTER_IOU)
              .build();
        }
      }
    }
    return result;
  }
}
