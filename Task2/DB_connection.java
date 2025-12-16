import java.sql.*;

import static java.lang.Class.forName;
public class DB_connection {

    public static Connection get_DBconnect() throws Exception {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "system";
            String pass = "MAHESH550";
            con = DriverManager.getConnection(url,user,pass);

        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getStackTrace());
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return con;

    }
}









