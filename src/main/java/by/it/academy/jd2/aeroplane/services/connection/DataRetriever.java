package by.it.academy.jd2.aeroplane.services.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataRetriever {
    private Connection connection;

    public DataRetriever() {
        DatabaseConnector connector = new DatabaseConnector();
        connection = connector.getConnection();
    }

    public List<String> retrieveData(){
        List<String> data = new ArrayList<>();

        try {
            String query = "SELECT * FROM bookings.aircrafts_data";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String model = resultSet.getString("model");
                String number = resultSet.getString("number");
                data.add("Model: " + model + ", Number: " + number);

            }
            resultSet.close();
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();

        }
        return data;
    }
}
