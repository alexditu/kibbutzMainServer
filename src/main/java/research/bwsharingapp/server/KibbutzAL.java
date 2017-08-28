package research.bwsharingapp.server;

import research.bwsharingapp.db.DatabaseConnection;
import research.bwsharingapp.proto.kb.RegisterUserReply;
import research.bwsharingapp.proto.kb.UserData;

import java.sql.SQLException;
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
}
