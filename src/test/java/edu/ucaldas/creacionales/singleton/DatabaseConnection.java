package edu.ucaldas.creacionales.singleton;

public class DatabaseConnection {
    // Instancia única
    private static DatabaseConnection instance;

    // Constructor privado para evitar instanciación externa
    private DatabaseConnection() {}

    // Método estático para obtener la instancia (thread-safe con synchronized)
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Ejemplo de método de conexión
    public void connect() {
        System.out.println("Conectando a la base de datos...");
    }
}
