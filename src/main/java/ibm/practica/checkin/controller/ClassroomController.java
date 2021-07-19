package ibm.practica.checkin.controller;

import ibm.practica.checkin.dto.ClassroomDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {

    @GetMapping("/get/{id}")

    public ClassroomDTO getClassroomById(){
        return null;
    }

    @PostMapping("/add")
    public ClassroomDTO addClassroom()
    {
        return null;
    }

    @PutMapping("/update")
    public ClassroomDTO updateClassroom()
    {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClassroom()
    {

    }




}
