package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserPersistenceServiceImpl implements UserPersistenceService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Long persistUser(User user) {
        return null;
    }

    @Override
    public Optional<User> findUser(Long id) {
        return Optional.empty();
    }
}