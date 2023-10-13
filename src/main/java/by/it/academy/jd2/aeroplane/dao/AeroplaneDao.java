package by.it.academy.jd2.aeroplane.dao;
import by.it.academy.jd2.aeroplane.dao.api.IAeroplaneDao;
import by.it.academy.jd2.aeroplane.dao.data_source.DataSourceCreator;
import by.it.academy.jd2.aeroplane.services.entity.AirCraft;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AeroplaneDao implements IAeroplaneDao {

    private DataSource ds = DataSourceCreator.getInstance();

    private List<AirCraft> airCrafts;

    public AeroplaneDao()  {
    }


    @Override
    public List<AirCraft> getAirCrafts() {
        airCrafts = new ArrayList<>();

        String sql = "SELECT aircraft_code," +
                " model ->> lang() AS model," +
                " range FROM aircrafts_data;";


        try (Connection conn = ds.getConnection();
             PreparedStatement stm = conn.prepareStatement(sql);
             ResultSet resultSet = stm.executeQuery()) {
            while (resultSet.next()){
                airCrafts.add(new AirCraft(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getInt(3)));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка получения данных", e);
        }
        return airCrafts;
    }
}
