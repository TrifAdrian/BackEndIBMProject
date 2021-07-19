package ibm.practica.checkin.controller;

import ibm.practica.checkin.dto.ClassDTO;
import ibm.practica.checkin.dto.UserDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    @GetMapping("/getclass/{id}")
    public ClassDTO getClassbyId(){
        return null;
    }

    @PostMapping("/reserve/")
    @ApiOperation(value = "the student reserves a spot for a certain Class")
    public UserDTO reserveSpot()
    {
        return null;
    }

    @PutMapping("/update/{id}")
    public ClassDTO updateClass()
    {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClass()
    {

    }

    @GetMapping("/suggest")
    @ApiOperation(value = "In case the classroom is full or not available suggest alternatives")
    public List<ClassDTO> getAlternativeOptions()
    {
        return Collections.emptyList();
    }











}