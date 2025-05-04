import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "password";
        
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

        String sql="Insert into student(id,name,sal) values(?,?,?)";
        try(Connection conn=DriverManager.getConnection(url, user, password)){
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setString(2, "John Doe");
            ps.setDouble(3, 50000.0);
            
            int rows = ps.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        }
        String sql1="Select * from student";
        try(Connection conn=DriverManager.getConnection(url, user, password)){
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql1);
            while(rs.next()){
                System.out.println(rs.getInt("id")+re.getString("name")+rs.getDouble("sal"));
            }
        } 
        String sql2="Update student set sal=? where id=?";
        try(Connection conn=DriverManager.getConnection(url, user, password)){
            PreparedStatement ps=conn.prepareStatement(sql2);
            ps.setDouble(1, 60000.0);
            ps.setInt(2, 1);
            
            int rowsAffected = ps.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        }   

    }
}
