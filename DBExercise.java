import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import numbermanipulations.Student;
import numbermanipulations.StudentHODdto;

public class DBExercise {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/college",
                            "postgres", "Flytekart_1");
            // TODO Store the credentials in environment files

            getStudents(c);
            getStudentHOD(c);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        } finally {
            try {
                if (c != null) {
                    c.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        //System.out.println("Opened database successfully");
    }

    private static void getStudents(Connection c) throws SQLException {
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * FROM student order by name;" ); // Cursor, Result
        List<Student> studentList = new ArrayList<Student>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int deptId = rs.getInt("departmentId");
            System.out.println("id = " + id + ", name = " + name + ", deptId = " + deptId);
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setDepartmentId(deptId);
            studentList.add(student);
            //System.out.println("name = " + name);
        }
        rs.close();
        stmt.close();
    }

    private static void getStudentHOD(Connection c) throws SQLException {
        Statement stmt1 = c.createStatement();
        ResultSet rs1 = stmt1.executeQuery( "select s.name as studentName, h.name as hodName from student s\n" +
                "left join department d on s.departmentId = d.id\n" +
                "left join hod h on d.hodId = h.id;" ); // Cursor, Result
        List<StudentHODdto> studentHODdtos = new ArrayList<>();
        while (rs1.next()) {
            String studentName = rs1.getString("studentName");
            String hodName = rs1.getString("hodName");
            System.out.println("studentName = " + studentName + ", hodName = " + hodName);
            StudentHODdto studentHODdto = new StudentHODdto(studentName, hodName);
            studentHODdtos.add(studentHODdto);
        }
        rs1.close();
        stmt1.close();

        for (int i = 0; i < studentHODdtos.size(); i++) {
            System.out.println("studentName = " + studentHODdtos.get(i).getStudentName()
                    + ", hodName = " + studentHODdtos.get(i).getHodName());
        }
    }
}
