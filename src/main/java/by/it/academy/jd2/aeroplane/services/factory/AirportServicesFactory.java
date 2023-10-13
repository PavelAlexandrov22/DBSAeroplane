package by.it.academy.jd2.aeroplane.services.factory;

import by.it.academy.jd2.aeroplane.dao.factory.AirportDaoFactory;
import by.it.academy.jd2.aeroplane.services.AirportService;
import by.it.academy.jd2.aeroplane.services.api.IAirportServices;


public class AirportServicesFactory {
    private static volatile AirportService instance;


    private AirportServicesFactory() {
    }

    public static IAirportServices getInstance(){
        if(instance == null){
            synchronized (AirportServicesFactory.class){
                if(instance == null){
                    instance = new AirportService(AirportDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
