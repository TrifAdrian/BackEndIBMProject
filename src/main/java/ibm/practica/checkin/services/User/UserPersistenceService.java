package ibm.practica.checkin.services.User;

import ibm.practica.checkin.db.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;



public interface UserPersistenceService {

    Long persistUser(User user);
    Optional<User> findUser(Long id);


}
