package edu.ucaldas.creacionales.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        DataBaseConnection conn1 = DataBaseConnection.getInstance();
        DataBaseConnection conn2 = DataBaseConnection.getInstance();

        conn1.connect();

        // Verificamos que ambas referencias apuntan al mismo objeto
        System.out.println(conn1 == conn2); // true
    }
}
