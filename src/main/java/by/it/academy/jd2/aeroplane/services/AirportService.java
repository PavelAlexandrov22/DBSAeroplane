package by.it.academy.jd2.aeroplane.services;

import by.it.academy.jd2.aeroplane.dao.api.IAirportDao;
import by.it.academy.jd2.aeroplane.services.api.IAirportServices;
import by.it.academy.jd2.aeroplane.dao.entity.AirportEntity;

import java.util.List;


public class AirportService implements IAirportServices {
    IAirportDao airportDao;
    public AirportService(IAirportDao instance) {
        this.airportDao = instance;
    }



    @Override
    public List<AirportEntity> getAirport() {
        return airportDao.getAirports();
    }
}



