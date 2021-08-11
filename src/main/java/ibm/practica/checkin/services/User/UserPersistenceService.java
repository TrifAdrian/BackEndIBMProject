package ibm.practica.checkin.services.User;

import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.domain.model.Teacher;
import ibm.practica.checkin.domain.model.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public interface UserPersistenceService {

    Long persistUser(User user);
    Optional<User> findUser(Long id);
    List<Teacher> getTeacherList();
    List<UserDto> getUsers();
}
