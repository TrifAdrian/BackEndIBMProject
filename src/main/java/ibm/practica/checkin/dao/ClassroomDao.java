package ibm.practica.checkin.dao;

import ibm.practica.checkin.entity.Classroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ClassroomDao implements Dao<Classroom>{
    private final EntityManager entityManager;

    public ClassroomDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Optional<Classroom> get(long id) {
        return Optional.ofNullable(entityManager.find(Classroom.class,id));
    }

    @Override
    public List<Classroom> getAll() {
        Query query = entityManager.createQuery("select e from Classroom e");
        return query.getResultList();
    }

    @Override
    public void save(Classroom classroom) {
        executeInsideTransaction(entityManager -> entityManager.persist(classroom));
    }

    @Override
    public void update(Classroom classroom, String[] params) {

    }

    @Override
    public void delete(Classroom classroom) {
        executeInsideTransaction(entityManager -> entityManager.remove(classroom) );
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        final EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        }
        catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
    }
}
