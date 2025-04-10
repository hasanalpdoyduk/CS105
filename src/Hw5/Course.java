package Hw5;

import java.io.*;
import java.util.*;

class Course {
    private String code;
    private String name;
    private int credit;

    // getters and setters
    // ...
}

class Student {
    private int id;
    private String name;
    private ArrayList<Course> courses;

    // getters and setters
    // ...
}

class School {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public School() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void readCourses(String fileName) throws IOException {
        // Read file and add courses to the list
        // ...
    }

    public void readStudents(String fileName) throws IOException {
        // Read file and add students to the list
        // ...
    }

    public int calculateTotalCreditFor(int studentId) {
        // Calculate total credits for a student
        // ...
        return 0;
    }

    public ArrayList<Course> getCoursesNoOneEnrolled() {
        // Get courses that no one enrolled in
        // ...
        return null;
    }

    public void printStudentsEnrolledCourse(String courseCode) {
        // Print students enrolled in a course
        // ...
    }

    public void printCoursesEnrolledByStudent(int studentId) {
        // Print courses enrolled by a student
        // ...
    }

    public void printAllStudentsOrderByName() {
        // Print all students ordered by name
        // ...
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        School school = new School();
        school.readCourses("COURSES.TXT");
        school.readStudents("STUDENTS.TXT");
        // Test other methods
        // ...
    }
}