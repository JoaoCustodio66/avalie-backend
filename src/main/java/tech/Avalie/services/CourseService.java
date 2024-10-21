package tech.Avalie.services;

import org.springframework.stereotype.Service;
import tech.Avalie.entities.Course;
import tech.Avalie.repositories.CourseRepository;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public Course createCurso(Course course)throws Exception{
        try{
            return courseRepository.save(course);
        }catch (Exception e){
            throw new Exception("Error when registering course: " + e.getMessage());
        }
    }
}
