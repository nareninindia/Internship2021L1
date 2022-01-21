import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import numbermanipulations.Student;

public class DBExercise {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/college",
                            "postgres", "Flytekart_1");

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

            Statement stmt1 = c.createStatement();
            ResultSet rs1 = stmt1.executeQuery( "select s.name as studentName, h.name as hodName from student s\n" +
                    "left join department d on s.departmentId = d.id\n" +
                    "left join hod h on d.hodId = h.id;" ); // Cursor, Result
            while (rs1.next()) {
                String studentName = rs1.getString("studentName");
                String hodName = rs1.getString("hodName");
                System.out.println("studentName = " + studentName + ", hodName = " + hodName);
            }
            rs1.close();
            stmt1.close();
            c.close();

            for (int i = 0; i < studentList.size(); i++) {
                System.out.println("Name: " + studentList.get(i).getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        //System.out.println("Opened database successfully");
    }
}
