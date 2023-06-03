package service;

import model.Department;
import repository.DepartmentRepository;

public class DepartmentService {

    private final DepartmentRepository departmentRepository;


    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department insert(Department department) {
        return this.departmentRepository.insert(department);
    }
    public Department findByName(String name) {
        return this.departmentRepository.findByName(name);
    }
}
