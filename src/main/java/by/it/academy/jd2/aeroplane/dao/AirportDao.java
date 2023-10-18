package by.it.academy.jd2.aeroplane.dao;

import by.it.academy.jd2.aeroplane.dao.api.IAirportDao;
import by.it.academy.jd2.aeroplane.dao.data_source.DataSourceCreator;
import by.it.academy.jd2.aeroplane.dao.entity.AirportEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import javax.sql.DataSource;
import java.util.List;

public class AirportDao implements IAirportDao {
    private DataSource ds = DataSourceCreator.getInstance();


    private final EntityManagerFactory emf;

    public AirportDao(EntityManagerFactory instance) {
        this.emf = instance;
    }




    @Override
    public List<AirportEntity> getAirports()  {

        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<?> query = cb.createQuery();
        query.from(AirportEntity.class);
        return (List<AirportEntity>) em.createQuery(query).getResultList();

    }
}