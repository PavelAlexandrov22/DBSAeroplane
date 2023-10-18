package by.it.academy.jd2.aeroplane.dao.api;



import by.it.academy.jd2.aeroplane.core.dto.FlightFilter;
import by.it.academy.jd2.aeroplane.core.dto.PageSize;
import by.it.academy.jd2.aeroplane.dao.entity.FlightEntity;

import java.util.List;

public interface IFlightDao {

    List<FlightEntity> getFlights(FlightFilter filter, PageSize pageSize);

}
