package research.bwsharingapp.db.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private int id;
    private String username;
    private String device_id;
    private byte[] pubKeyEnc;


    public User(ResultSet rs) throws SQLException {
        id          = rs.getInt(1);
        username    = rs.getString(2);
        device_id   = rs.getString(3);
        pubKeyEnc   = rs.getBytes(4);
    }

    public User() {}

    public User(int id, String username, String device_id, byte[] pubKeyEnc) {
        this.id = id;
        this.username = username;
        this.device_id = device_id;
        this.pubKeyEnc = pubKeyEnc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public byte[] getPubKeyEnc() {
        return pubKeyEnc;
    }

    public void setPubKeyEnc(byte[] pubKeyEnc) {
        this.pubKeyEnc = pubKeyEnc;
    }
}
