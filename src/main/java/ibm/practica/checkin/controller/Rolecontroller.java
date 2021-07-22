package ibm.practica.checkin.controller;


import ibm.practica.checkin.dto.RoleDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/role")
public class Rolecontroller {

    @GetMapping("{/id}")
    public RoleDTO getrole()
    {
        return null;
    }

    @PutMapping("/update/{id}")
    public RoleDTO updaterole()
    {
        return null;
    }

    @PostMapping("/create")
    public RoleDTO addrole()
    {
        return null;
    }

    @GetMapping("/display")
    public List<RoleDTO> getallroles()
    {
        return Collections.emptyList();
    }



}
