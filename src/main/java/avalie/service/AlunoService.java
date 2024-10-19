package avalie.service;

import avalie.repository.AlunoRepository;
import org.bson.Document;

import java.util.List;

public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository){
        this.alunoRepository=alunoRepository;
    }

    public Object createStudent(Document document) throws Exception{
        try{
            return alunoRepository.save(document);
        }catch (Exception e){
            throw new Exception("Error when registering new student: " + e.getMessage());
        }
    }
    public List<Document> getAllStudents() throws Exception{
        try{
            return alunoRepository.findAll();
        }catch (Exception e){
            throw new Exception("Error when searching for studens: " + e.getMessage());
        }
    }
    public Document getStudentByRA(String ra) throws Exception{
        try{
            return alunoRepository.findByRA(ra);
        }catch (Exception e){
            throw new Exception("Error when searching for student: " + e.getMessage());
        }
    }
    public Document getStudentById(String id) throws Exception{
        try{
            return alunoRepository.findById(id);
        }catch (Exception e){
            throw new Exception("Errow when searching for student: " + e.getMessage());
        }
    }
    public List<Document> getStudentsByCourse(String course) throws Exception{
        try{
            return alunoRepository.findByCourse(course);
        }catch (Exception e){
            throw new Exception("Error when searching for studens: " + e.getMessage());
        }
    }
    public Document getStudentByGrid(String idGrid) throws Exception{
        try{
            return alunoRepository.findByGrid(idGrid);
        }catch (Exception e){
            throw new Exception("Errow when searching for students: " + e.getMessage());
        }
    }

}
