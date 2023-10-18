package by.it.academy.jd2.aeroplane.services.api;



import by.it.academy.jd2.aeroplane.dao.entity.FlightEntity;

import java.util.List;

public interface IFlightServices {

    List<FlightEntity> getFlights();
    List<FlightEntity> getFlights(int page, int size, List<String> filters);
    List<FlightEntity> getFlights(int page, int size);

}
