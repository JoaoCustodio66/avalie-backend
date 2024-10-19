package avalie.controller;

import avalie.model.Aluno;
import avalie.service.AlunoService;
import avalie.service.ProfessorService;
import org.bson.Document;

import java.util.List;

public class AlunoController {
    private final AlunoService alunoService;
    public AlunoController(AlunoService alunoService){
        this.alunoService=alunoService;
    }

    /*public List<Aluno> listarAlunos(){
        return aluno.getAllAlunos();
    }*/

    public void createStudent(Document document) throws Exception{
        try{
            alunoService.createStudent(document);
            System.out.println("Student successfully registered");
        }catch(Exception e){
            throw new Exception("Error when registering new student");
        }
    }
    public List<Document> getAllStudents() throws Exception{
        try{
            List<Document> alunos = alunoService.getAllStudents();
            return alunos;
        }catch (Exception e){
            throw new Exception("Error when retrieving students: " + e.getMessage());
        }
    }
}
