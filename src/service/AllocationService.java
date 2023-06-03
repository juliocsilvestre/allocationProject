package service;

import model.Coordinator;
import repository.CoordinatorRepository;

import java.util.List;

public class CoordinatorService {

    // é um professor, precisa ter o curso coordenado
    // curso coordenado precisa ser do mesmo departamento do qual o professor faz parte
    //TODO: precisa criar um método que verifica se um professor já é coordenador, se ele for, tem que adicionar um novo curso a lista de cursos coordenados e não cadastrar ele novamente
    //TODO: criar um método que verifica quais os cursos disponíveis para o professor ser coordenador

    private final CoordinatorRepository coordinatorRepository;

    public CoordinatorService(CoordinatorRepository coordinatorRepository) {
        this.coordinatorRepository = coordinatorRepository;
    }

    public Coordinator insert(Coordinator coordinator) {

        Coordinator savedCoordinator = coordinatorRepository.findByCpf(coordinator.getCpf());

        if(savedCoordinator == null) {
            savedCoordinator = this.coordinatorRepository.insert(coordinator);
        } else {
            if(savedCoordinator.getCourses().contains(coordinator.getCourses().get(0))) {
                throw new IllegalArgumentException("O professor já coordena o curso informado.");
            }
            savedCoordinator = this.coordinatorRepository.insert(coordinator);
        }
        return savedCoordinator;
    }

    public List<Coordinator> findAll() {
        return coordinatorRepository.findAll();
    }

}
