package research.bwsharingapp.server;

import research.bwsharingapp.db.DatabaseConnection;
import research.bwsharingapp.db.entities.User;
import research.bwsharingapp.proto.kb.ClientConnectReply;
import research.bwsharingapp.proto.kb.ClientInfo;
import research.bwsharingapp.proto.kb.RegisterUserReply;
import research.bwsharingapp.proto.kb.UserData;

import javax.xml.bind.DatatypeConverter;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Logger;

public class KibbutzAL {
    private static final Logger log = Logger.getLogger(KibbutzServer.class.getName());

    public static RegisterUserReply registerUser(UserData userData) {
        DatabaseConnection db = new DatabaseConnection();
        try {
            db.connect();

            RegisterUserReply reply = registerUser(userData, db);
            return reply;

        } catch (SQLException e) {
            log.info("Exception in registerUser: " + e);
            return RegisterUserReply.newBuilder().setStatus(false).setStatusCode(-1).build();
        } finally {
            db.disconnect();
        }

    }

    /**
     *
     * @param request
     * @return
     *          -1 SQL exception
     */
    public static ClientConnectReply clientConnect(ClientInfo request) {
        DatabaseConnection db = new DatabaseConnection();
        try {
            db.connect();

            ClientConnectReply reply = clientConnect(request, db);
            return reply;

        } catch (SQLException e) {
            log.info("Exception in clientConnect: " + e);
            return ClientConnectReply.newBuilder().setStatusCode(-1).build();
        } finally {
            db.disconnect();
        }
    }




    /* private implementation */

    private static RegisterUserReply registerUser(UserData userData, DatabaseConnection db) throws SQLException {
        RegisterUserReply.Builder b = RegisterUserReply.newBuilder();
        boolean userExists = db.userExists(userData.getUsername());
        if (userExists == false) {
            int ret = db.insertUser(userData.getUsername(), userData.getDeviceId(), userData.getPubKey().toByteArray());
            if (ret != 1) {
                log.info("Inserting user failed with code: " + ret);
                b.setStatus(false).setStatusCode(-2).build();
            } else {
                log.info("Inserting user succeeded");
                b.setStatus(true).setStatusCode(0);
            }
        } else {
            b.setStatus(false).setStatusCode(1).build();
            log.info("User already exists");
        }
        return b.build();
    }

    private static ClientConnectReply clientConnect(ClientInfo clientInfo,  DatabaseConnection db) throws SQLException {
        ClientConnectReply.Builder replyB = ClientConnectReply.newBuilder();
        User user = db.getUserIfExists(clientInfo.getClientUsername());

        if (user != null) {
            log.info("Client exists: " + user.getUsername() + ". Comparing keys");
            //String dbKey = DatatypeConverter.printHexBinary(user.getPubKeyEnc());
            //String reqKey = DatatypeConverter.printHexBinary(clientInfo.getClientPubKey().toByteArray());

            byte[] dbClientKey = user.getPubKeyEnc();
            byte[] reqClientKey = clientInfo.getClientPubKey().toByteArray();
            if (Arrays.equals(dbClientKey, reqClientKey)) {
                log.info("Public keys match");
                replyB.setClientExists(true);
                replyB.setStatusCode(0);
                replyB.setStatusMsg("Client exists. Connection succeeded!");
            } else {
                log.info("Public keys do not match");
                replyB.setClientExists(false);
                replyB.setStatusCode(-3);
                replyB.setStatusMsg("Client username exists but public keys differ. Connection rejected!");
            }
        } else {
            log.info("Client does not exist: " + user.getUsername());
            replyB.setClientExists(false);
            replyB.setStatusCode(-2);
            replyB.setStatusMsg("Client does not exist. Connection rejected!");
        }
        return replyB.build();
    }
}
