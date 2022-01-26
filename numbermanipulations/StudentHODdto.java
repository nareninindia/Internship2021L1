package numbermanipulations;

public class StudentHODdto {
    private String studentName;
    private String hodName;

    public StudentHODdto(String studentName, String hodName) {
        this.studentName = studentName;
        this.hodName = hodName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }
}
