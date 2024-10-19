package avalie;

import avalie.controller.AlunoController;
import avalie.controller.CursoController;
import avalie.controller.ProfessorController;
import avalie.model.Aluno;
import avalie.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProfessorController professorController = new ProfessorController();
        AlunoController alunoController = new AlunoController();
        CursoController cursoController = new CursoController();

        //List é criada no repository
        professorController.listarProfessores();

        //Este ponteiro de list e criada/populada com a criacao de outra List no repository
        List<Aluno> alunos = alunoController.listarAlunos();
        System.out.println(alunos);

        //Esta List e criada aqui apenas e altera atravez de métodos void que a recebem
        List<Curso> cursos = new ArrayList<>();
        cursoController.listarCursos(cursos);
        System.out.println(cursos);


        }
}

