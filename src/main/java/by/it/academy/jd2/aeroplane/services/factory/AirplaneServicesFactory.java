package by.it.academy.jd2.aeroplane.services.factory;
import by.it.academy.jd2.aeroplane.dao.factory.AirplaneDaoFactory;
import by.it.academy.jd2.aeroplane.services.AirplaneService;
import by.it.academy.jd2.aeroplane.services.api.IAirplaneServices;

public class AirplaneServicesFactory {

    private volatile static AirplaneService instance;

    private AirplaneServiceFactory() {
    }

    public static IAirplaneServices getInstance() {
        if (instance == null) {
            synchronized (AirplaneServicesFactory.class) {
                if (instance == null) {
                    instance = new AirplaneService(AirplaneDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
