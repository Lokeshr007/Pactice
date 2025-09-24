package JDBC;

import java.sql.*;

public class DML {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String userName = "root";
        String password = "Lokeshr@64";

        // Correct INSERT query
        String query = "INSERT INTO student (id, name, rollno, dept) VALUES (10, 'loki', 64, 'cse')";

        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();

        int count = st.executeUpdate(query);
         // returns number of rows affected
        System.out.println(count + " row(s) inserted.");

        st.close();
        con.close();
    }
}
