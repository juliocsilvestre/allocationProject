package repository;

import model.Course;
import model.Department;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {

    private List<Course> courses;

    public CourseRepository() {
        this.courses = new ArrayList<>();
    }

    public Course insert(Course course) {
        this.courses.add(course);
        return course;
    }

    public void remove(Course course) { this.courses.remove(course); }

    public List<Course> getAll() {
        return this.courses;
    }

    public Course findByName(String name) {
        return this.courses.stream()
                .filter(department -> department.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public boolean exists(Course course) {
        return this.courses.contains(course);
    }
}
