package by.it.academy.jd2.aeroplane.dao.factory;

import by.it.academy.jd2.aeroplane.dao.AirportDao;
import by.it.academy.jd2.aeroplane.dao.api.IAirportDao;


public class AirportDaoFactory {
    private static volatile AirportDao instance;


    private AirportDaoFactory() {
    }

    public static IAirportDao getInstance(){
        if(instance == null){
            synchronized (AirportDaoFactory.class){
                if(instance == null){
                    instance = new AirportDao();
                }
            }
        }
        return instance;
    }
}
