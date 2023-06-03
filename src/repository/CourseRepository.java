package repository;

import model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {

    private List<Department> departments;

    public DepartmentRepository() {
        this.departments = new ArrayList<>();
    }

    public Department insert(Department department) {
        this.departments.add(department);
        return department;
    }

    public void remove(Department department) {
        this.departments.remove(department);
    }

    public List<Department> getAll() {
        return this.departments;
    }

    public Department findByName(String name) {
        return this.departments.stream()
                .filter(department -> department.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public boolean exists(Department department) {
        return this.departments.contains(department);
    }
}
