
import java.util.ArrayList;
import java.util.List;

class Course {
    private String code;
    private String name;
    private int credit;
    private Instructor instructor;
    private List<Student> enrolledStudents;

    public Course(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void assignInstructor(Instructor instructor) {
        this.instructor = instructor;
        instructor.getCourses().add(this);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    @Override
    public String toString() {
        return "Course [code=" + code + ", name=" + name + ", credit=" + credit + "]";
    
    }
    
}
