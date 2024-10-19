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
            throw new Exception("Error when retrieving students: " + e.getMessage());
        }
    }


}
