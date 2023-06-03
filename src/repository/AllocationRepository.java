package repository;

import model.Coordinator;
import model.Course;


import java.util.ArrayList;
import java.util.List;

public class CoordinatorRepository {

    private List<Coordinator> coordinators;

    public CoordinatorRepository() {
        this.coordinators = new ArrayList<>();
    }

    public Coordinator insert(Coordinator coordinator) {
        this.coordinators.add(coordinator);
        return coordinator;
    }

    public void remove(Coordinator coordinator) {
        this.coordinators.remove(coordinator);
    }

    public List<Coordinator> findAll() {
        return this.coordinators;
    }

    public Coordinator findByCpf(String cpf) {
        return this.coordinators.stream()
                .filter(coordinator -> coordinator.getCpf().equalsIgnoreCase(cpf))
                .findFirst()
                .orElse(null);
    }

    public boolean exists(Coordinator coordinator) {
        return this.coordinators.contains(coordinator);
    }

    public void addCourse(Coordinator coordinator, Course course) {
        this.coordinators.forEach(c -> {
            if(c.getCpf().equals(coordinator.getCpf())) {
                c.getCourses().add(course);
            }
        });
    }
}
