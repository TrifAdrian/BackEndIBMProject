package ibm.practica.checkin.controller;

import ibm.practica.checkin.model.Class;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/class")
public class ClassController {
    @GetMapping("/test")

    public Class getClassbyId(){
        return null;
    }
}