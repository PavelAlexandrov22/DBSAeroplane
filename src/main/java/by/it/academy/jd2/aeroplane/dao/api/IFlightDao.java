package by.it.academy.jd2.aeroplane.dao.api;



import by.it.academy.jd2.aeroplane.dao.entity.FlightEntity;

import java.util.List;

public interface IFlightDao {

    List<FlightEntity> getFlights();

    List<FlightEntity> getFlights(int page, int size);

    List<FlightEntity> getFlights(int page, int size, List<String> filters);

}
