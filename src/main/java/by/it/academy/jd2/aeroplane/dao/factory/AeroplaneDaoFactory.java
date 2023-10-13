package by.it.academy.jd2.aeroplane.dao.factory;

import by.it.academy.jd2.aeroplane.dao.AeroplaneDao;
import by.it.academy.jd2.aeroplane.dao.api.IAeroplaneDao;

public class AeroplaneDaoFactory {

    private static volatile AeroplaneDao instance;


    private AeroplaneDaoFactory() {
    }

    public static IAeroplaneDao getInstance(){
        if(instance == null){
            synchronized (AeroplaneDaoFactory.class){
               if(instance == null){
                   instance = new AeroplaneDao();
               }
            }
        }
        return instance;
    }
}
