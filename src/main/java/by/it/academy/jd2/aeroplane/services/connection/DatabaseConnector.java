package by.it.academy.jd2.aeroplane.services.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnector {

    private Connection connection;

    private static final String URL = "jdbc:postgresql://localhost:5432/demo";
    private static final String USER = "postgres";
    private static final String PASSWORD = "cfdaszx";

    public DatabaseConnector() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);


        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();

        }
    }

    public  Connection getConnection(){
        return connection;
    }
}
