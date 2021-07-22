package ibm.practica.checkin.dao;

import ibm.practica.checkin.entity.Class;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class ClassDao implements Dao<Class>{

    private final EntityManager entityManager;

    public ClassDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
dsa
    @Override
    public Optional<Class> get(long id) {
        return Optional.ofNullable(entityManager.find(Class.class,id));
    }

    @Override
    public List<Class> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM Class e");
        return query.getResultList();
    }

    @Override
    public void save(Class aClass) {

    }

    @Override
    public void update(Class aClass, String[] params) {

    }

    @Override
    public void delete(Class aClass) {

    }
}
