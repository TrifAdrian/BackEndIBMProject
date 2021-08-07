package ibm.practica.checkin.facade;

import ibm.practica.checkin.domain.model.ClassroomDto;
import ibm.practica.checkin.services.Classroom.ClassroomPersistenceService;
import ibm.practica.checkin.services.Feature.FeaturePersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/classroom")
public class ClassroomService implements ClassroomController {

    @Autowired
    ClassroomPersistenceService classroomPersistenceService;

    @Autowired
    FeaturePersistenceService featurePersistenceService;

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable("id") Long id) {
        classroomPersistenceService.deleteClassroom(id);
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long createClassroom(@RequestBody ClassroomDto classroomDto) {
        return classroomPersistenceService.persistClassroom(classroomDto);
    }

    @Override
    @GetMapping("/{id}")
    public Optional<ClassroomDto> findClassroom(@PathVariable("id") Long id) {

        Optional<ClassroomDto> classroomDto = classroomPersistenceService.findClassroomDto(id);

        return classroomDto;
    }

    @Override
    @GetMapping
    public List<ClassroomDto> getAllClassroom() {
        return classroomPersistenceService.getAllClassroom();
    }

    @Override
    @PutMapping
    public Integer update(@RequestBody ClassroomDto classroomDto) {
        return classroomPersistenceService.updateClassroom(classroomDto);
    }

}
