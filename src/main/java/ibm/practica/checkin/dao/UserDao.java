package ibm.practica.checkin.dao;

import ibm.practica.checkin.entity.User;

import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<User>{

    @Override
    public Optional<User> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user, String[] params) {

    }

    @Override
    public void delete(User user) {

    }
}