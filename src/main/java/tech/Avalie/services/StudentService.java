package tech.Avalie.services;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import tech.Avalie.entities.Student;
import tech.Avalie.repositories.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student student) throws Exception{
        try{
            student.setId_curso(new ObjectId(String.valueOf(student.getId_curso())));
            student.setId_grade(new ObjectId(String.valueOf(student.getId_grade())));
            return studentRepository.save(student);
        }catch (Exception e){
            throw new Exception("Error when registering students: " + e.getMessage());
        }
    }

    public List<Student> listStudents() throws Exception{
        try{
            return studentRepository.findAll();
        } catch (Exception e) {
            throw new Exception("Error when list students: " + e.getMessage());
        }
    }
}
