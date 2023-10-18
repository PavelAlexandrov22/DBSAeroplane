package by.it.academy.jd2.aeroplane.services.api;



import by.it.academy.jd2.aeroplane.core.dto.Flight;
import by.it.academy.jd2.aeroplane.core.dto.FlightFilter;
import by.it.academy.jd2.aeroplane.core.dto.PageSize;


import java.util.List;

public interface IFlightServices {

    List<Flight> getFlights(FlightFilter filter, PageSize pageSize);

}
