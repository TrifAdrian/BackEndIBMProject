package ibm.practica.checkin.dao;

import ibm.practica.checkin.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class RoleDao implements Dao<Role>{
    private final EntityManager entityManager;

    public RoleDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Role> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Role> getAll() {
        return null;
    }

    @Override
    public void save(Role role) {
        executeInsideTransaction(entityManager -> entityManager.persist(role));
    }

    @Override
    public void update(Role role, String[] params) {

    }

    @Override
    public void delete(Role role) {
        executeInsideTransaction(entityManager -> entityManager.remove(role));
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
