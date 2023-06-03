package service;

import model.Professor;
import repository.ProfessorRepository;

public class ProfessorService {

    private final ProfessorRepository professorRepository;


    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;

    }

    public Professor insert(Professor professor) {
        return this.professorRepository.insert(professor);
    }
    public Professor findByName(String name) {
        return this.professorRepository.findByCpf(name);
    }
}
