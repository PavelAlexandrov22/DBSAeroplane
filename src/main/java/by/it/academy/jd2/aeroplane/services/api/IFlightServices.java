package by.it.academy.jd2.aeroplane.services.api;



import by.it.academy.jd2.aeroplane.services.entity.Flight;

import java.util.List;

public interface IFlightServices {

    List<Flight> getFlights();
    List<Flight> getFlights(int page, int size, List<String> filters);
    List<Flight> getFlights(int page, int size);

}
