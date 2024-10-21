package tech.Avalie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.Avalie.entities.Student;
import tech.Avalie.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) throws Exception{
        try{
            Student item=studentService.createStudent(student);
            return ResponseEntity.ok().body(item);
        }catch (Exception e){
            throw new Exception("Error when registering student: " + e.getMessage());
        }
    }
}
