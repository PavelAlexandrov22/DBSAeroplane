package by.it.academy.jd2.aeroplane.services;

import by.it.academy.jd2.aeroplane.dao.api.IFlightDao;
import by.it.academy.jd2.aeroplane.services.api.IFlightServices;
import by.it.academy.jd2.aeroplane.dao.entity.FlightEntity;

import java.util.List;

public class FlightServices implements IFlightServices {


    IFlightDao flightDao;

    public FlightServices(IFlightDao flightDao) {
        this.flightDao = flightDao;
    }


    @Override
    public List<FlightEntity> getFlights() {

        return flightDao.getFlights();
    }

    @Override
    public List<FlightEntity> getFlights(int page, int size) {
        return flightDao.getFlights(page, size);
    }

    @Override
    public List<FlightEntity> getFlights(int page, int size, List<String> filters) {
        return flightDao.getFlights(page, size, filters);
    }
}
