import java.sql.*;

import static java.lang.Class.forName;
public class DB_Connection {

    public static void main(String[] args) {


        try {
            String driver = "oracle.jdbc.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "system";
            String pass = "MAHESH550";
            String table = "users";
            String query = "SELECT * FROM " + table;

            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                System.out.println("connection successful");
            }
            else {
                System.out.println("connection failed");
            }

          con.close();


        } catch (ClassNotFoundException e) {
            System.out.println(e.getStackTrace());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }




















