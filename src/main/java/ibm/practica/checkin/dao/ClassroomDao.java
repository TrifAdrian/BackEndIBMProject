package ibm.practica.checkin.dao;

import ibm.practica.checkin.entity.Classroom;

import java.util.List;
import java.util.Optional;

public class ClassroomDao implements Dao<Classroom>{
    @Override
    public Optional<Classroom> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Classroom> getAll() {
        return null;
    }

    @Override
    public void save(Classroom classroom) {

    }

    @Override
    public void update(Classroom classroom, String[] params) {

    }

    @Override
    public void delete(Classroom classroom) {

    }
}
