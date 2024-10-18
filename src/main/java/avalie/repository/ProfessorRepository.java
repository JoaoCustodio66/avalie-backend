package avalie.repository;

import avalie.config.MongoDBConnection;
import avalie.model.Professor;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository {

    public List<Professor> findAllProfessors() {
        List<Professor> professores = new ArrayList<>();

        MongoCollection<Document> collection = MongoDBConnection.getDatabase().getCollection("professores");

        MongoCursor<Document> cursor = collection.find().iterator();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Professor prof = new Professor(
                        doc.getObjectId("_id"),
                        doc.getString("nome"),
                        doc.getString("email"),
                        doc.getString("telefone")
                );
                professores.add(prof);
            }
        } finally {
            cursor.close();
        }
        return professores;
    }

}
