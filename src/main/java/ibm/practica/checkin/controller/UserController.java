package ibm.practica.checkin.controller;

import ibm.practica.checkin.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get/{id}")
    public User getUserById(){
        return null;
    }

    @PostMapping
    public User addUser()
    {
        return null;
    }

}
