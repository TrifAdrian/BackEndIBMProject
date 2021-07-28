package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.User;

import java.util.Optional;

public interface UserPersistenceService {

    Long persistUser(User user);
    Optional<User> findUser(Long id);


}
