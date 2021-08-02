package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.domain.model.ClassroomDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ClassroomPersistenceService {

    Long persistClassroom(ClassroomDto classroomDto);
    List<ClassroomDto> getAllClassroom();
    void deleteClassroom(Long id);
    Classroom updateClassroom(Classroom classroom);
    Optional<ClassroomDto> findClassroomDto(Long id);


}
