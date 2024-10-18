package avalie.service;

import avalie.model.Professor;
import avalie.repository.ProfessorRepository;

import java.util.List;

public class ProfessorService {
    private ProfessorRepository professorRepository = new ProfessorRepository();

    public List<Professor> getAllProfessors() {
        return professorRepository.findAllProfessors();
    }

}
