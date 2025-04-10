
import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private String program;
    private List<Course> courses;

    public Student(String id, String name, String program) {
        super(id, name);
        this.program = program;
        this.courses = new ArrayList<>();
    }

    public String getProgram() {
        return program;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    @Override
    public String toString() {
        return String.format("Student [Id=%s, Name=%s, Program=%s]", getId(), getName(), program);
    }
}
