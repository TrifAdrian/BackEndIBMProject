package ibm.practica.checkin.dao;

import ibm.practica.checkin.entity.Class;

import java.util.List;
import java.util.Optional;

public class ClassDao implements Dao<Class>{
    @Override
    public Optional<Class> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Class> getAll() {
        return null;
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
