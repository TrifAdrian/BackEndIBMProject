package ibm.practica.checkin.facade;

import ibm.practica.checkin.domain.model.Teacher;
import ibm.practica.checkin.domain.model.UserDto;
import ibm.practica.checkin.services.User.UserPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserService implements UserController{

    @Autowired
    UserPersistenceService userPersistenceService;

    @Override
    @GetMapping
    public List<UserDto> getAllUsers() {
        return userPersistenceService.getUsers();
    }

    @Override
    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        return userPersistenceService.getTeacherList();
    }
}
