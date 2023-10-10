package by.it.academy.jd2.aeroplane.services.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBSConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("org.postgresql.Driver");
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "cfdaszx");

        String url = "jdbc:postgresql://localhost:5432/demo";

        Connection conn = DriverManager.getConnection(url, props);
        Statement stm = conn.createStatement();








    }
}
