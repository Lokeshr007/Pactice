package JDBC.JpaDemo;

import java.sql.*;

public class JdbcDaoDemo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Fetch by rollno
        Student s1 = dao.getName(67);
        if (s1 != null) {
            System.out.println("Found: " + s1.sname);
        }

        // Insert a new student
        Student s2 = new Student();
        s2.sname = "Mohan";
        s2.rollno = 69;
        dao.addStudent(s2);
    }
}

class StudentDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "Lokeshr@64";

    public Student getName(int rollno) {
        String query = "SELECT name FROM student WHERE rollno = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement st = con.prepareStatement(query)) {

            st.setInt(1, rollno);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Student s = new Student();
                s.rollno = rollno;
                s.sname = rs.getString("name");
                return s;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void addStudent(Student s2) {
        String query = "INSERT INTO student(rollno, name) VALUES (?, ?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement st = con.prepareStatement(query)) {

            st.setInt(1, s2.rollno);
            st.setString(2, s2.sname);

            int count = st.executeUpdate();
            System.out.println(count + " row(s) inserted.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Student {
    int rollno;
    String sname;
}
