package ibm.practica.checkin.facade;

import ibm.practica.checkin.domain.model.ClassDto;
import ibm.practica.checkin.domain.model.ClassEnrollStudent;
import ibm.practica.checkin.domain.model.StudentDetails;
import ibm.practica.checkin.services.ClassPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/class")
public class ClassService implements ClassController{

    @Autowired
    ClassPersistenceService classPersistenceService;

    @PutMapping
    @Override
    public ClassDto updateClass(@RequestBody ClassDto classDto) {
        return null;
    }

    @Override
    @PatchMapping("/update")
    public ClassEnrollStudent enrolToClass(ClassEnrollStudent classEnrollStudent) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(Long id) {

    }

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
        return classPersistenceService.getAllClasses();
    }
}
