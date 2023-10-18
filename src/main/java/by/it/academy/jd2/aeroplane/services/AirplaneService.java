package by.it.academy.jd2.aeroplane.services;
import by.it.academy.jd2.aeroplane.core.dto.Airplane;
import by.it.academy.jd2.aeroplane.dao.api.IAirplaneDao;
import by.it.academy.jd2.aeroplane.dao.factory.AirplaneDaoFactory;
import by.it.academy.jd2.aeroplane.services.api.IAirplaneServices;
import java.util.List;
import java.util.stream.Collectors;

public class AirplaneService implements IAirplaneServices {

    private IAirplaneDao airplaneDao = AirplaneDaoFactory.getInstance();


    public AirplaneService(IAirplaneDao instance){
        this.airplaneDao = instance;

    }

    @Override
    public List<Airplane> getAirCrafts() {

        return airplaneDao.getAirCrafts()
                .stream()
                .map(airCraftEntity -> new Airplane(airCraftEntity.getAircraft_code(),
                        airCraftEntity.getModel(), airCraftEntity.getRange())).collect(Collectors.toList());

    }


}
