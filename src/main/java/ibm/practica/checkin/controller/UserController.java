package ibm.practica.checkin.controller;

import ibm.practica.checkin.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/test")
    public User getUser(){
        return null;
    }


}
