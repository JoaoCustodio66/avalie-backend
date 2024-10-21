package tech.Avalie.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.Avalie.entities.Student;

public interface StudentRepository extends MongoRepository<Student,Long> {
}
