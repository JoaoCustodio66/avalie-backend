package avalie;

import avalie.controller.AlunoController;
import avalie.controller.ProfessorController;
import avalie.model.Aluno;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProfessorController professorController = new ProfessorController();
        AlunoController alunoController = new AlunoController();

        professorController.listarProfessores();
        List<Aluno> alunos = alunoController.listarAlunos();
        System.out.println(alunos);

        }
}

