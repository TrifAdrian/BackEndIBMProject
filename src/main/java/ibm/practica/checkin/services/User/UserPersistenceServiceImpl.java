package ibm.practica.checkin.services.User;

import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserPersistenceServiceImpl implements UserPersistenceService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Long persistUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser.getId();
    }

    @Override
    public Optional<User> findUser(Long id) {
        return userRepository.findById(id);
    }
}
