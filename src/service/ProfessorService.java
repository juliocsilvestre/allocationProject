package service;

import model.Course;
import model.Department;
import repository.CourseRepository;
import repository.DepartmentRepository;

public class CourseService {

    private final CourseRepository courseRepository;


    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course insert(Course course) {
        return this.courseRepository.insert(course);
    }
    public Course findByName(String name) {
        return this.courseRepository.findByName(name);
    }
}
