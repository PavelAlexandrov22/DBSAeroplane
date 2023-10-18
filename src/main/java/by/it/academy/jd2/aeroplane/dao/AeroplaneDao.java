package by.it.academy.jd2.aeroplane.dao;
import by.it.academy.jd2.aeroplane.dao.api.IAirplaneDao;
import by.it.academy.jd2.aeroplane.dao.data_source.DataSourceCreator;
import by.it.academy.jd2.aeroplane.dao.entity.AirCraftEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import javax.sql.DataSource;
import java.util.List;

public class AeroplaneDao implements IAirplaneDao {

    private DataSource ds = DataSourceCreator.getInstance();

    private List<AirCraftEntity> airCrafts;

    private final EntityManagerFactory emf;

    public AeroplaneDao(EntityManagerFactory emf) {
        this.emf = emf;
    }


    @Override
    public List<AirCraftEntity> getAirCrafts() {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<?> query = cb.createQuery();
        query.from(AirCraftEntity.class);
        return (List<AirCraftEntity>) em.createQuery(query).getResultList();
    }
}
