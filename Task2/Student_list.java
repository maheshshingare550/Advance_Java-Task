import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student_list {
    public static void main(String[] args) {
        Connection con ;
        String query = " select * from Students_Info";
        try {
            con= DB_connection.get_DBconnect();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile_no");
                String className = rs.getString("Standard");

                System.out.println(id + " " + name + " " + age + " " + gender +
                        " " + email + " " + mobile + " " + className);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        }






}
