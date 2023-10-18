package by.it.academy.jd2.aeroplane.services.api;


import by.it.academy.jd2.aeroplane.dao.entity.AirCraftEntity;

import java.util.List;

public interface IAeroplaneServices {
    List<AirCraftEntity> getAirCrafts();
}
