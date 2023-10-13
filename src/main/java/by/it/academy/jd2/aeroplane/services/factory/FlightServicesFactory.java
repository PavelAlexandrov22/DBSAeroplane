package by.it.academy.jd2.aeroplane.services.factory;
import by.it.academy.jd2.aeroplane.dao.factory.FlightDaoFactory;
import by.it.academy.jd2.aeroplane.services.FlightServices;
import by.it.academy.jd2.aeroplane.services.api.IFlightServices;

public class FlightServicesFactory {
    private static volatile FlightServices instance;


    private FlightServicesFactory() {
    }

    public static IFlightServices getInstance(){
        if(instance == null){
            synchronized (FlightServicesFactory.class){
                if(instance == null){
                    instance = new FlightServices(FlightDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
