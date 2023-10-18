package by.it.academy.jd2.aeroplane.dao.data_source;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMFFactory {

    private final static EntityManagerFactory instance;

    static {
        instance =
                Persistence.createEntityManagerFactory("test");
    }

    public static EntityManagerFactory getInstance() {
        return instance;
    }
}
