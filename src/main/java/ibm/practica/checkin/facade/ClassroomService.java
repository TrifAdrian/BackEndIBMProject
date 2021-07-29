package ibm.practica.checkin.facade;

import ibm.practica.checkin.domain.model.ClassroomDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classroom")
public class ClassroomService implements ClassroomController {
    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable("id") Long id) {

    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long createClassroom(@RequestBody ClassroomDto classroomDto) {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public Optional<ClassroomDto> findClassroom(@PathVariable("id") Long id) {
        return Optional.empty();
    }

    @Override
    @GetMapping
    public List<ClassroomDto> getAllClassroom() {
        return null;
    }

    @Override
    @PutMapping
    public ClassroomDto update(@RequestBody ClassroomDto classroomDto) {
        return null;
    }
}
