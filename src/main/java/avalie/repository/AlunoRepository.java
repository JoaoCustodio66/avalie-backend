package avalie.repository;

import avalie.config.MongoDBConnection;
import avalie.model.Aluno;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {

    public List<Aluno> findAllAlunos(){
        List<Aluno> alunos = new ArrayList<>();

        MongoCollection<Document> collection = MongoDBConnection.getDatabase().getCollection("alunos");

        MongoCursor<Document> cursor = collection.find().iterator();

        try{
            while(cursor.hasNext()){
                Document doc = cursor.next();
                Aluno aluno = new Aluno(doc.getObjectId("_id"),
                        doc.getString("nome"),
                        doc.getString("ra"),
                        doc.getString("email"),
                        doc.getString("telefone"),
                        doc.getObjectId("id_curso"),
                        doc.getObjectId("id_grade"),
                        doc.getBoolean("ativo"));
                alunos.add(aluno);
            }
        }finally {
            cursor.close();
        }
        return alunos;
    }
}
