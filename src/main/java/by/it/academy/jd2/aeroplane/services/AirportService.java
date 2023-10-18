package by.it.academy.jd2.aeroplane.services;

import by.it.academy.jd2.aeroplane.core.dto.Airport;
import by.it.academy.jd2.aeroplane.dao.api.IAirportDao;
import by.it.academy.jd2.aeroplane.services.api.IAirportServices;


import java.util.List;
import java.util.stream.Collectors;


public class AirportService implements IAirportServices {
    IAirportDao airportDao;
    public AirportService(IAirportDao instance) {
        this.airportDao = instance;
    }



    @Override
    public List<Airport> getAirport() {

        return airportDao.getAirports().stream()
                .map(airportEntity -> new Airport(airportEntity.getAirportCode(), airportEntity.getAirportName(),
                        airportEntity.getCity(), airportEntity.getCoordinates(),
                        airportEntity.getTimezone())).collect(Collectors.toList());
    }
}



