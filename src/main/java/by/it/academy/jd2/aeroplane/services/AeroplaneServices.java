package by.it.academy.jd2.aeroplane.services;
import by.it.academy.jd2.aeroplane.dao.api.IAeroplaneDao;
import by.it.academy.jd2.aeroplane.dao.factory.AeroplaneDaoFactory;
import by.it.academy.jd2.aeroplane.services.api.IAeroplaneServices;
import by.it.academy.jd2.aeroplane.services.entity.AirCraft;

import java.util.List;

public class AeroplaneServices implements IAeroplaneServices {

    private IAeroplaneDao aeroplaneDao = AeroplaneDaoFactory.getInstance();

    public AeroplaneServices(IAeroplaneDao aeroplaneDao) {
        this.aeroplaneDao = aeroplaneDao;
    }

    @Override
    public List<AirCraft> getAirCrafts() {
        return aeroplaneDao.getAirCrafts();
    }


}
