package by.it.academy.jd2.aeroplane.dao.factory;
import by.it.academy.jd2.aeroplane.dao.FlightDao;
import by.it.academy.jd2.aeroplane.dao.api.IFlightDao;

public class FlightDaoFactory {
    private static volatile FlightDao instance;


    private FlightDaoFactory() {
    }

    public static IFlightDao getInstance(){
        if(instance == null){
            synchronized (FlightDaoFactory.class){
                if(instance == null){
                    instance = new FlightDao();
                }
            }
        }
        return instance;
    }
}
