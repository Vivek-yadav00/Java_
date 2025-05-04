import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");

            // Insert data
            String insertSQL = "INSERT INTO student(id, name, sal) VALUES (?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertSQL)) {
                ps.setInt(1, 1);
                ps.setString(2, "John Doe");
                ps.setDouble(3, 50000.0);

                int rows = ps.executeUpdate();
                System.out.println("Rows inserted: " + rows);
            }

            // Retrieve data
            String selectSQL = "SELECT * FROM student";
            try (Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(selectSQL)) {

                System.out.println("Student Records:");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + rs.getString("name") + rs.getDouble("sal"));
                }
            }

            // Update data
            String updateSQL = "UPDATE student SET sal=? WHERE id=?";
            try (PreparedStatement ps = conn.prepareStatement(updateSQL)) {
                ps.setDouble(1, 60000.0);
                ps.setInt(2, 1);

                int rows = ps.executeUpdate();
                System.out.println("Rows updated: " + rows);
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        }
    }
}
