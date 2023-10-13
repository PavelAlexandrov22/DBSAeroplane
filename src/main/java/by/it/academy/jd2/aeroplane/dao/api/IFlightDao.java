package by.it.academy.jd2.aeroplane.dao.api;



import by.it.academy.jd2.aeroplane.services.entity.Flight;

import java.util.List;

public interface IFlightDao {

    List<Flight> getFlights();

    List<Flight> getFlights(int page, int size);

    List<Flight> getFlights(int page, int size, List<String> filters);

}
