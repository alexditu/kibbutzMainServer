package research.bwsharingapp.db;

import java.sql.*;
import java.util.logging.Logger;

public class DatabaseConnection {
    private static final Logger log = Logger.getLogger(DatabaseConnection.class.getName());

    private final static String DB_URL = "jdbc:sqlite:./src/sqlite/kibbutz.db";
    private Connection conn;

    public void connect() throws SQLException {
        conn = DriverManager.getConnection(DB_URL);
        log.info("Connection to SQLite has been established.");
    }

    public void disconnect() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                log.info("Exception while closing connection: " + e);
            }
        }
    }

    public void createTableIOU() throws SQLException {
        PreparedStatement pstmt = null;
        String CREATE_IOU_TABLE = "" +
                "CREATE TABLE IF NOT EXISTS ious (\n" +
                " id integer PRIMARY KEY autoincrement,\n" +
                " router text,\n" +
                " client text,\n" +
                " router_in integer,\n" +
                " router_out integer,\n" +
                " client_in integer,\n" +
                " client_out integer\n" +
                " );";

        pstmt = conn.prepareStatement(CREATE_IOU_TABLE);
        boolean ret = pstmt.execute();
        log.info("CREATE_IOU_TABLE returned: " + ret);
    }

    public void select() throws SQLException {
        PreparedStatement pstmt = null;
        String sql = "select * from IOUS";

        pstmt = conn.prepareStatement(sql);
        ResultSet rset = pstmt.executeQuery();
        while (rset.next()) {
            log.info("id: " + rset.getInt("id")
                        + " router: " + rset.getString("router")
                        + " router_in: " + rset.getInt("router_in"));
        }
    }

    public void insert() throws SQLException {
        PreparedStatement pstmt = null;
        String sql = "insert into IOUS(router, router_in) values(?, ?)";

        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "router_id");
        pstmt.setInt(2,12341);
        int ret = pstmt.executeUpdate();
        log.info("'" + sql + "' ret: " + ret);
    }

    public void initTables() throws SQLException {
        createTableIOU();
    }

    public static void main(String args[]) {
        DatabaseConnection db = new DatabaseConnection();
        try {
            db.connect();
            db.initTables();

//            db.insert();
            db.select();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.disconnect();
    }
}
