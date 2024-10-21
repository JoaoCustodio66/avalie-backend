package tech.Avalie.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.Avalie.entities.Course;

public interface CourseRepository extends MongoRepository<Course,Long> {
}
