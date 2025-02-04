package Class3.JDBC;

import java.sql.*;

public class DbCon {

    public Connection con;
    public Statement st;
    public PreparedStatement pst;
    public ResultSet rs;
    public ResultSetMetaData md;

    DbCon() {
        try {
            // how to include the zarvis.jar file in the classpath while running the program
            // from the terminal or cmd
            // step 1: go to the directory where the jar file is present
            // step 2: run the following command
            // java -cp .;jarfilename.jar filename
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDb", "root", "root");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
