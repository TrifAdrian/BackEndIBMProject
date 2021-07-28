package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Classroom;

import java.util.List;
import java.util.Optional;

public interface ClassroomPersistenceService {

    Long persistClassroom(Classroom classroom);
    Optional<Classroom> findClassroom(Long id);
    List<Classroom> getAllClassroom();



}
