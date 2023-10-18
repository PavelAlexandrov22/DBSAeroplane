package by.it.academy.jd2.aeroplane.services;

import by.it.academy.jd2.aeroplane.core.dto.Flight;
import by.it.academy.jd2.aeroplane.core.dto.FlightFilter;
import by.it.academy.jd2.aeroplane.core.dto.PageSize;
import by.it.academy.jd2.aeroplane.dao.api.IFlightDao;
import by.it.academy.jd2.aeroplane.services.api.IFlightServices;


import java.util.List;
import java.util.stream.Collectors;

public class FlightServices implements IFlightServices {


    IFlightDao flightDao;

    public FlightServices(IFlightDao flightDao) {
        this.flightDao = flightDao;
    }


    @Override
    public List<Flight> getFlights(FlightFilter filter, PageSize pageSize) {
        return flightDao.getFlights(filter, pageSize).stream().map(
                flightEntity -> new Flight(flightEntity.getFlightId(), flightEntity.getFlightNo(),
                        flightEntity.getScheduledDeparture(), flightEntity.getScheduledDepartureLocal(),
                        flightEntity.getScheduledArrival(), flightEntity.getScheduledArrivalLocal(),
                        flightEntity.getScheduledDuration(), flightEntity.getDepartureAirport(),
                        flightEntity.getDepartureAirportName(), flightEntity.getDepartureCity(),
                        flightEntity.getArrivalAirport(), flightEntity.getArrivalAirportName(),
                        flightEntity.getArrivalCity(), flightEntity.getStatus(),
                        flightEntity.getAircraftCode(), flightEntity.getActualDeparture(),
                        flightEntity.getActualDepartureLocal(), flightEntity.getActualArrival(),
                        flightEntity.getActualArrivalLocal(), flightEntity.getActualDuration())).collect(Collectors.toList());
    }
}
