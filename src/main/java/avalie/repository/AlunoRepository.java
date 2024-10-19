package avalie.repository;

import avalie.config.MongoDBConnection;
import avalie.model.Aluno;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public interface AlunoRepository {
    static MongoCollection<Document> collection = MongoDBConnection.getDatabase().getCollection("alunos");
    default Object save(Document document) {
        return collection.insertOne(document);
    }

    //findAll
    default List<Document> findAll() throws Exception {
        List<Document> students = new ArrayList<>();
        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                students.add(cursor.next());
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return students;
    }

    //findByRA
    default Document findByRA(String ra) throws Exception {
        Document student;
        try {
            Document query = new Document("ra", ra);
            student = collection.find(query).first();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return student;
    }
    //findById
    default Document findById(String id) throws Exception{
        Document student;
        try{
            ObjectId objectId=new ObjectId(id);
            Document query= new Document("_id",objectId);
            student=collection.find(query).first();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return student;
    }
    //findByCourse
    default List<Document> findByCourse(String course) throws Exception {
        List<Document> students = new ArrayList<>();

        try {
            List<Document> results = collection.aggregate(Arrays.asList(
                    Aggregates.lookup("cursos", "id_curso", "_id", "cursoDetalhes"), // "cursoDetalhes" é o novo campo com os dados do curso
                    Aggregates.match(Filters.eq("cursoDetalhes.descricao", course)) // Busca pela descrição do curso
            )).into(new ArrayList<>());

            for (Document doc : results) {
                students.add(doc);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return students;
    }
    //findByGrade
    default Document findByGrid(String idGrid) throws Exception{
        Document students;
        try{
            ObjectId objectId=new ObjectId(idGrid);
            Document query= new Document("_id",objectId);
            students=collection.find(query).first();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return students;
    }
    //updateById
    //deleteById
}
