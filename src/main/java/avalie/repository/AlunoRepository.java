package avalie.repository;

import avalie.config.MongoDBConnection;
import avalie.model.Aluno;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public interface AlunoRepository {
    static MongoCollection<Document> collection = MongoDBConnection.getDatabase().getCollection("alunos");

    default Object save(Document document){
        return collection.insertOne(document);
    }
    //findAll
    default List<Document> findAll() {
        List<Document> students = new ArrayList<>();
        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                students.add(cursor.next());
            }
        }
        return students;
    }
    //findById
    //updateById
    //deleteById
}
