package S303N3;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static final String DATABASE_NAME = "floristeria_db"; // Nombre de la base de datos en MongoDB
    private static final String CONNECTION_STRING = "mongodb://localhost:27017"; // Cadena de conexión a MongoDB

    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBConnection() {
        // Inicializar el cliente de MongoDB y conectarse a la base de datos
        try {
            MongoClientURI uri = new MongoClientURI(CONNECTION_STRING);
            mongoClient = new MongoClient(uri);
            database = mongoClient.getDatabase(DATABASE_NAME);
            System.out.println("Conectado a la base de datos: " + DATABASE_NAME);
        } catch (Exception e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    // Obtener la instancia de la base de datos MongoDB
    public MongoDatabase getDatabase() {
        return database;
    }

    // Cerrar la conexión con la base de datos
    public void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("Conexión cerrada con la base de datos: " + DATABASE_NAME);
        }
    }
}
