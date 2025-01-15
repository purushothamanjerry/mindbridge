package Day12;

import java.sql.*;

public class Sql {
    public String name;
    public int a, b, c;

    public Sql(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String tableCreate() {
        return "CREATE TABLE IF NOT EXISTS Students (Name varchar(255), Tamil int, English int, Maths int)";
    }

    public String insert() {
        return "INSERT INTO students (Name, Tamil, English, Maths) VALUES ('" + name + "', " + a + ", " + b + ", " + c + ")";
    }

    public static void main(String[] args) {
        
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC", "root", "");
            
            Sql e = new Sql("Purushothaman S", 60, 50, 70);

            stmt = con.createStatement();
            
            String createTableSQL = e.tableCreate();
            stmt.executeUpdate(createTableSQL);
            
            String insertSQL = e.insert();
            int rowsAffected = stmt.executeUpdate(insertSQL);
            
            System.out.println("Record inserted successfully. Rows affected: " + rowsAffected);

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
