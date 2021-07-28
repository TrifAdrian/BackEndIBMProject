package ibm.practica.checkin.facade;

import ibm.practica.checkin.domain.model.ClassDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/class")
public class ClassService implements ClassController{

    @PostMapping()
    @Override
    @ResponseStatus(HttpStatus.CREATED)
    public Long createClass(@RequestBody ClassDto classDto) {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public Optional<ClassDto> findClass(@PathVariable("id") Long id) {
        return Optional.empty();
    }

    @GetMapping
    @Override
    public List<ClassDto> getAllClasses() {
        return null;
    }
}
