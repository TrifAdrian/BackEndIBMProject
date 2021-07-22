package ibm.practica.checkin.controller;

import ibm.practica.checkin.dto.ClassroomDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {

    @GetMapping("/info/{id}")

    public ClassroomDTO getclassroombyid(){
        return null;
    }

    @PostMapping("/save")
    public ClassroomDTO addclassroom()
    {
        return null;
    }

    @PutMapping("/update")
    public ClassroomDTO updateclassroom()
    {
        return null;
    }

    @DeleteMapping("/remove/{id}")
    public void deleteclassroom() {}




}
