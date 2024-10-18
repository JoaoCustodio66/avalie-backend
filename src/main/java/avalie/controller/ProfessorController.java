package avalie.controller;

import avalie.model.professor;
import avalie.service.ProfessorService;

import java.util.List;

public class ProfessorController {
    private ProfessorService professorService = new ProfessorService();

    public void listarProfessores() {
        List<professor> professores = professorService.getAllProfessors();

        // Exibe a lista de professores no console (ou pode retornar como resposta HTTP)
        for (professor prof : professores) {
            System.out.println(prof);
        }
    }
}
