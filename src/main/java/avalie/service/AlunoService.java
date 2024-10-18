package avalie.service;

import avalie.model.Aluno;
import avalie.repository.AlunoRepository;

import java.util.List;

public class AlunoService {
    AlunoRepository aluno = new AlunoRepository();

    public List<Aluno> getAllAlunos(){
        return aluno.findAllAlunos();
    }
}
