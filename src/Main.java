import java.sql.*;

public class Main
{
    public static void main(String[] args) throws SQLException {
        String sql = "select name from student where id = 103";
        String url = "jdbc:postgresql://localhost:5432/Hibernate";
        String username = "postgres";
        String password = "newpassword";
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet result = st.executeQuery(sql);
        result.next();
        String name = result.getString(1);
        System.out.println(name);
        con.close();
    }
}