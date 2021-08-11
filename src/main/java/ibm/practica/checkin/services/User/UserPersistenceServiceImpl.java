package ibm.practica.checkin.services.User;

import ibm.practica.checkin.db.model.Role;
import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.db.repository.UserRepository;
import ibm.practica.checkin.domain.model.Teacher;
import ibm.practica.checkin.domain.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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

    @Override
    public List<Teacher> getTeacherList() {
        return userRepository.getAllTeachers(Role.TEACHER);
    }

    @Override
    public List<UserDto> getUsers() {
        return userRepository.getAllUserDto();
    }
}
