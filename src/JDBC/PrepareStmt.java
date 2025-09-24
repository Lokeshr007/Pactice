package JDBC;

import java.sql.*;
public class PrepareStmt {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String uname = "root";
        String upassword = "Lokeshr@64";

        String query = "INSERT INTO student(id,name,rollno,dept) values(?,?,?,?)";

        Connection con = DriverManager.getConnection(url,uname,upassword);
        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1,11);
        st.setString(2,"siva");
        st.setInt(3,65);
        st.setString(4,"CSE");
        st.addBatch();

        st.setInt(1,12);
        st.setString(2,"Arun");
        st.setInt(3,67);
        st.setString(4,"ECE");
        st.addBatch();



        int count[] = st.executeBatch();
        System.out.println(count.length+" Affected Rows");

        st.close();
        con.close();

    }
}
