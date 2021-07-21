package ibm.practica.checkin.dao;

import ibm.practica.checkin.entity.Role;

import java.util.List;
import java.util.Optional;

public class RoleDao implements Dao<Role>{
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

    }

    @Override
    public void update(Role role, String[] params) {

    }

    @Override
    public void delete(Role role) {

    }
}
