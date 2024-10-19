package avalie.repository;

import avalie.config.MongoDBConnection;
import avalie.model.Aluno;
import avalie.model.Curso;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import java.util.List;

public class CursoRepository {

    public void findAllCursos(List<Curso> cursos){
        MongoCollection<Document> collection = MongoDBConnection.getDatabase().getCollection("cursos");
        MongoCursor<Document> cursor = collection.find().iterator();
        try{
            while(cursor.hasNext()){
                Document doc = cursor.next();
                Curso curso = new Curso(doc.getObjectId("_id"),
                                        doc.getString("descricao"),
                                        doc.getBoolean("ativo"));
                cursos.add(curso);
            }
        }finally{
            cursor.close();
        }
    }

}
