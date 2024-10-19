package avalie.service;

import avalie.model.Curso;
import avalie.repository.CursoRepository;
import java.util.List;

public class CursoService {
    CursoRepository cursoRepository = new CursoRepository();

    public void getAllCursos(List<Curso> cursos){
        cursoRepository.findAllCursos(cursos);
    }
}
