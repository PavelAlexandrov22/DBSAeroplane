package by.it.academy.jd2.aeroplane.dao.factory;

import by.it.academy.jd2.aeroplane.dao.AeroplaneDao;
import by.it.academy.jd2.aeroplane.dao.api.IAirplaneDao;
import by.it.academy.jd2.aeroplane.dao.data_source.EMFFactory;

public class AirplaneDaoFactory {

    private static volatile AeroplaneDao instance;


    private AirplaneDaoFactory() {
    }

    public static IAirplaneDao getInstance(){
        if(instance == null){
            synchronized (AirplaneDaoFactory.class){
               if(instance == null){
                   instance = new AeroplaneDao(EMFFactory.getInstance());
               }
            }
        }
        return instance;
    }
}
