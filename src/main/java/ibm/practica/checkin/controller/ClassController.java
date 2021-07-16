package ibm.practica.checkin.controller;

import ibm.practica.checkin.model.Class;
import ibm.practica.checkin.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    @GetMapping("/getclass/{id}")
    public Class getClassbyId(){
        return null;
    }

    @PostMapping("/reserve/")
    @ApiOperation(value = "the student reserves a spot for a certain Class")
    public User reserveSpot()
    {
        return null;
    }

    @PutMapping("/update/{id}")
    public Class updateClass()
    {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClass()
    {

    }

    @GetMapping("/suggest")
    @ApiOperation(value = "In case the classroom is full or not available suggest alternatives")
    public List<Class> getAlternativeOptions()
    {
        return Collections.emptyList();
    }











}