package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.db.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClassroomPersistenceServiceImpl implements ClassroomPersistenceService{

    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public Optional<Classroom> findClassroom(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Classroom> getAllClassroom() {
        return null;
    }

    @Override
    public Long persistClassroom(Classroom classroom) {
        return null;
    }
}
