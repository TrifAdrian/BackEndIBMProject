package ibm.practica.checkin.controller;

import ibm.practica.checkin.model.Classroom;
import ibm.practica.checkin.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/classroom")
public class ClassroomController {

    @GetMapping("/test")
    public Classroom getClassroom(){
        return null;
    }

}
