
import java.util.ArrayList;
import java.util.List;

class Instructor extends Person {
    private String officeNumber;
    private String officeHours;
    private List<Course> courses;

    public Instructor(String id, String name, String officeNumber, String officeHours) {
        super(id, name);
        this.officeNumber = officeNumber;
        this.officeHours = officeHours;
        this.courses = new ArrayList<>();
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Instructor [Id=" + getId() + ", Name=" + getName() +
               ", Office Number=" + officeNumber + ", Office Hours=" + officeHours + "]";
    }
}
