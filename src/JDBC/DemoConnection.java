package JDBC;
/*
*1.import --> java.sql.*
*2.load and register the driver -->com.mysql.jdbc.Driver
*3.create connection
*4.create a statement
*5.execute the query
*6.process the results
*7.close
* */
import java.sql.*;
public class DemoConnection {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String userName = "root";
        String password = "Lokeshr@64";

        String query = "select * from student";

//        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getInt("rollno")+" "+rs.getString("name")+" "+rs.getString("dept"));
        }


        st.close();
        con.close();

    }
}
