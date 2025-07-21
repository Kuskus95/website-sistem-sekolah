package schoolmanagement.java.models;

public class Grades {
    private String id; // grade id
    private String studentId;
    private String courseName;
    private String grade;
    private String teacherId;

    public Grades() {
    }

    public Grades(String id, String studentId, String courseName, String grade, String teacherId) {
        this.id = id;
        this.studentId = studentId;
        this.courseName = courseName;
        this.grade = grade;
        this.teacherId = teacherId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "id='" + id + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", grade='" + grade + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}
