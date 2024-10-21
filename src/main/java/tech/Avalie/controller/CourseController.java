package tech.Avalie.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.Avalie.entities.Course;
import tech.Avalie.services.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }
    @PostMapping("/create")
    public ResponseEntity<Course> createCurso(@RequestBody Course course)throws Exception{
        try{
            Course item = courseService.createCurso(course);
            return ResponseEntity.ok().body(item);
        } catch (Exception e) {
            throw new Exception("Error when registering curso: " + e.getMessage());
        }
    }
}
