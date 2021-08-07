package ibm.practica.checkin.facade;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.domain.model.ClassDetail;
import ibm.practica.checkin.domain.model.ClassDto;
import ibm.practica.checkin.domain.model.ClassEnrollStudent;
import ibm.practica.checkin.services.Class.ClassPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/class")
public class ClassService implements ClassController{

    @Autowired
    ClassPersistenceService classPersistenceService;

    @PutMapping
    @Override
    public Class updateClass(@RequestBody ClassDetail classDetail) {
        return classPersistenceService.updateClass(classDetail);
    }

    @Override
    @PatchMapping("/update")
    public Integer enrolToClass(@RequestBody ClassEnrollStudent classEnrollStudent) {

        return classPersistenceService.updateStudentList(classEnrollStudent.getClassId(),classEnrollStudent.getStudentId());
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable("id") Long id) {
        classPersistenceService.deleteClass(id);
    }

    @PostMapping()
    @Override
    @ResponseStatus(HttpStatus.CREATED)
    public Long createClass(@RequestBody ClassDetail classDetail) {
        return classPersistenceService.persistClass(classDetail);
    }

    @GetMapping("/{id}")
    @Override
    public Optional<ClassDto> findClass(@PathVariable("id") Long id) {
        return classPersistenceService.findClass(id);
    }

    @GetMapping
    @Override
    public List<ClassDto> getAllClasses() {

        return classPersistenceService.getAllClasses();
    }
}
