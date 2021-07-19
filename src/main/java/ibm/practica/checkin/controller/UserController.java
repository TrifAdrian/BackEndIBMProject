package ibm.practica.checkin.controller;

import ibm.practica.checkin.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get/{id}")
    public UserDTO getuserbyid(){
        return null;
    }

    @PostMapping
    public UserDTO adduser()
    {
        return null;
    }

}
