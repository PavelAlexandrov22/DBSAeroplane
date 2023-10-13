package by.it.academy.jd2.aeroplane.services.factory;


import by.it.academy.jd2.aeroplane.dao.factory.AeroplaneDaoFactory;
import by.it.academy.jd2.aeroplane.services.AeroplaneServices;
import by.it.academy.jd2.aeroplane.services.api.IAeroplaneServices;

public class AeroplaneServicesFactory {

    private static volatile AeroplaneServices instance;


    private AeroplaneServicesFactory() {
    }

    public static IAeroplaneServices getInstance() {
        if (instance == null) {
            synchronized (AeroplaneServicesFactory.class) {
                if (instance == null) {
                    instance = new AeroplaneServices(AeroplaneDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
