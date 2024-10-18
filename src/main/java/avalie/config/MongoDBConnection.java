package avalie.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static MongoClient mongoClient = null;

    public static MongoDatabase getDatabase() {
        if (mongoClient == null) {
            MongoClientURI uri = new MongoClientURI("mongodb+srv://avalie:Puc1234@avalie.kcpcx.mongodb.net/?retryWrites=true&w=majority&appName=Avalie");
            mongoClient = new MongoClient(uri);
        }
        return mongoClient.getDatabase("avalie");
    }
    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }



}
