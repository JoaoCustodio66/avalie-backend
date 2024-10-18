package avalie.service;

import avalie.model.professor;
import avalie.repository.ProfessorRepository;

import java.util.List;

public class ProfessorService {

    private ProfessorRepository professorRepository = new ProfessorRepository();

    public List<professor> getAllProfessors() {
        return professorRepository.findAllProfessors();
    }

}
