package ibm.practica.checkin.dao;

import ibm.practica.checkin.entity.Class;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import java.util.function.Consumer;

import static java.lang.Integer.parseInt;

public class ClassDao implements Dao<Class>{

    private final EntityManager entityManager;

    public ClassDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

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
        executeInsideTransaction(entityManager1 -> entityManager.persist(aClass));
    }

    @Override
    public void update(Class aClass, String[] params) {

//        aClass.setName(Objects.requireNonNull(params[0],"Name cannot be null"));
//
//        aClass.setYear(Objects.requireNonNull(parseInt(params[1]),"Year cannot be null"));
//
//        aClass.setSection(Objects.requireNonNull(params[2],"Section cannot be null"));

//        aClass.setTeacher(Objects.requireNonNull(parseInt(params[3]),"Teacher cannot be null"));
//
//        aClass.setStudentList(Objects.requireNonNull(parseInt(params[4]),"List cannot be null"));
//
//        aClass.setClassroom(Objects.requireNonNull(parseInt(params[5]),""));

        executeInsideTransaction(entityManager -> entityManager.merge(aClass));
    }

    @Override
    public void delete(Class aClass) {
        executeInsideTransaction(entityManager ->entityManager.remove(aClass));
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
