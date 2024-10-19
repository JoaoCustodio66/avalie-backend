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
            throw new Exception("Error when searching for student");
        }
    }
    public List<Document> getAllStudents() throws Exception{
        try{
            List<Document> students = alunoService.getAllStudents();
            return students;
        }catch (Exception e){
            throw new Exception("Error when searching for students: " + e.getMessage());
        }
    }
    public Document getStudentByRA(String ra) throws Exception{
        try{
            Document student=alunoService.getStudentByRA(ra);
            return student;
        }catch (Exception e){
            throw new Exception("Error when searching for students: " + e.getMessage());
        }
    }
    public Document getStudentById(String id) throws Exception{
        try{
            Document student=alunoService.getStudentById(id);
            return student;
        }catch (Exception e){
            throw new Exception("Error when searching for student: " + e.getMessage());
        }
    }
    public List<Document> getStudentsByCourse(String course) throws Exception{
        try{
            List<Document> students=alunoService.getStudentsByCourse(course);
            return students;
        }catch (Exception e){
            throw new Exception("Error when searching for student: " + e.getMessage());
        }
    }
    public Document getStudentByGrid(String idGrid) throws Exception{
        try{
            Document students=alunoService.getStudentByGrid(idGrid);
            return students;
        }catch (Exception e){
            throw new Exception("Error when searching for students: " + e.getMessage());
        }
    }
}
