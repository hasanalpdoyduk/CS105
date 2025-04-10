
import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;
    private List<Instructor> instructors;
    private List<Course> courses;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.instructors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void printTotalCreditFor(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                int totalCredit = student.getCourses().stream().mapToInt(Course::getCredit).sum();
                System.out.println("Total credit for student " + studentId + " " + student.getName() + "=" + totalCredit);
                return;
            }
        }
        System.out.println("Student not found with ID: " + studentId);
    }

    public void printCoursesNoOneEnrolled() {
        System.out.println("----COURSES NO ONE ENROLLED-------");
        courses.stream()
            .filter(course -> course.getEnrolledStudents().isEmpty())
            .forEach(System.out::println);
    }

    public void printCoursesNoAssignedInstructor() {
        System.out.println("----COURSES NO ASSIGNED INSTRUCTOR-------");
        courses.stream()
            .filter(course -> course.getInstructor() == null)
            .forEach(System.out::println);
    }

    public void printStudentsEnrolledCourse(String courseCode) {
        System.out.println("----STUDENTS OF COURSE: " + courseCode + " " + getCourseName(courseCode));
        courses.stream()
            .filter(course -> course.getCode().equals(courseCode))
            .findFirst()
            .ifPresentOrElse(course -> {
                course.getEnrolledStudents().forEach(System.out::println);
            }, () -> System.out.println("Course not found with code: " + courseCode));
    }

    public void printCoursesEnrolledByStudent(String studentId) {
        System.out.println("----COURSES OF STUDENT: " + studentId + " " + getStudentName(studentId));
        students.stream()
            .filter(student -> student.getId().equals(studentId))
            .findFirst()
            .ifPresentOrElse(student -> {
                student.getCourses().forEach(System.out::println);
            }, () -> System.out.println("Student not found with ID: " + studentId));
    }

    public void printAllStudents() {
        System.out.println("----ALL STUDENTS ");
        students.forEach(System.out::println);
    }

    public void printStudentWithHighestCredit() {
        Student highestCreditStudent = students.stream()
            .max((s1, s2) -> Integer.compare(s1.getCourses().stream().mapToInt(Course::getCredit).sum(),
                                            s2.getCourses().stream().mapToInt(Course::getCredit).sum()))
            .orElse(null);

        int maxCredit = highestCreditStudent != null ?
                        highestCreditStudent.getCourses().stream().mapToInt(Course::getCredit).sum() : 0;

        System.out.println("-----student with the highest credit is:");
        System.out.println(highestCreditStudent + " Credit:" + maxCredit);
    }

    private String getCourseName(String courseCode) {
        return courses.stream()
            .filter(course -> course.getCode().equals(courseCode))
            .findFirst()
            .map(Course::getName)
            .orElse("Course not found");
    }

    private String getStudentName(String studentId) {
        return students.stream()
            .filter(student -> student.getId().equals(studentId))
            .findFirst()
            .map(Student::getName)
            .orElse("Student not found");
    }

    // Add any other necessary methods

    @Override
    public String toString() {
        return "School [name=" + name + "]";
    }
}
