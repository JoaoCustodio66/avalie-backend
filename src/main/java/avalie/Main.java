package avalie;

import avalie.controller.AlunoController;
import avalie.controller.CursoController;
import avalie.controller.ProfessorController;
import avalie.model.Aluno;
import avalie.model.Curso;
import avalie.repository.AlunoRepository;
import avalie.service.AlunoService;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        AlunoRepository alunoRepository = new AlunoRepository() {
        };

        AlunoService alunoService = new AlunoService(alunoRepository);

        AlunoController alunoController = new AlunoController(alunoService);
        String cursoIdString = "67118bc0201887baab936d4f"; // ID do curso
        String gradeIdString = "67118a27201887baab936d4e"; // ID da grade

        ObjectId cursoId = new ObjectId(cursoIdString);
        ObjectId gradeId = new ObjectId(gradeIdString);
        Document student= new Document()
                .append("nome", "douglas")
                .append("ra", "23000115")
                .append("email", "teste@hotmail.com")
                .append("telefone", "(17)65656-0621")
                .append("id_curso",cursoId )
                .append("id_grade", gradeId)
                .append("ativo", true);

        //alunoController.createStudent(student);
        Object alunos = alunoController.getAllStudents();
        System.out.println(alunos.toString());
        //teste buscar por RA
        Object aluno= alunoController.getStudentByRA("22000115");
        System.out.println(aluno.toString());
        //teste buscar por Id
        Object alunoid=alunoController.getStudentById("6712ba693bb2d7661666a04a");
        System.out.println(alunoid.toString());
        //teste par buscar por curso
        Object alunocurso= alunoController.getStudentsByCourse("Engenharia de Software");
        System.out.println(alunocurso.toString());
        //teste buscar por Grase
        //Object alunograde=alunoController.getStudentByGrid("6712ba693bb2d7661666a04a");
        //System.out.println(alunograde.toString());
    }
}

