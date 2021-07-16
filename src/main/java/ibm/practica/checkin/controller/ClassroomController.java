package ibm.practica.checkin.controller;

import ibm.practica.checkin.model.Classroom;
import ibm.practica.checkin.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {

    @GetMapping("/get/{id}")

    public Classroom getClassroomById(){
        return null;
    }

    @PostMapping("/add")
    public Classroom addClassroom()
    {
        return null;
    }

    @PutMapping("/update")
    public Classroom updateClassroom()
    {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClassroom()
    {

    }




}
