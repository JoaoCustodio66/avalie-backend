package tech.Avalie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.Avalie.entities.Student;
import tech.Avalie.services.StudentService;

import java.util.List;

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
            Student item = studentService.createStudent(student);
            return ResponseEntity.ok().body(item);
        }catch (Exception e){
            throw new Exception("Error when registering student: " + e.getMessage());
        }
    }
    @GetMapping("/list")
    public ResponseEntity<List<Student>> listStudent()throws Exception{
        try{
            List<Student> items = studentService.listStudents();
            return ResponseEntity.ok().body(items);
        } catch (Exception e) {
            throw new Exception("Error when list students: " + e.getMessage());
        }
    }


}
