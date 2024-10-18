package avalie.controller;

import avalie.model.Aluno;
import avalie.service.AlunoService;
import avalie.service.ProfessorService;

import java.util.List;

public class AlunoController {
    private AlunoService aluno = new AlunoService();

    public List<Aluno> listarAlunos(){
        return aluno.getAllAlunos();
    }
}
