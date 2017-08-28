package research.bwsharingapp.server;

import io.grpc.stub.StreamObserver;
import research.bwsharingapp.proto.kb.*;

import java.util.logging.Logger;


public class KibbutzServer extends KibbutzGrpc.KibbutzImplBase {
    private static final Logger log = Logger.getLogger(KibbutzServer.class.getName());

    @Override
    public void sendRouterIOU(RouterIOU request, StreamObserver<RouterIOUReply> responseObserver) {
        printRouterIou(request);

        RouterIOUReply reply = RouterIOUReply.newBuilder().setStatusCode(0).setIsValid(true).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void registerUser(UserData request, StreamObserver<RegisterUserReply> responseObserver) {
        log.info("registering user: " + request.getUsername());

        RegisterUserReply reply = KibbutzAL.registerUser(request);
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    private void printRouterIou(RouterIOU request) {
        log.info("Recv request:");
        log.info("client: " + request.getClientIou().getIn().getBytes() + "\t\t" + request.getClientIou().getOut().getBytes());
        log.info("router: " + request.getIn().getBytes() + "\t\t" + request.getOut().getBytes());
    }
}
