package avalie.controller;

import avalie.model.Curso;
import avalie.service.CursoService;

import java.util.ArrayList;
import java.util.List;

public class CursoController {
    private CursoService cursoService = new CursoService();
    public void listarCursos(List<Curso> cursos){
        cursoService.getAllCursos(cursos);
    }

}
