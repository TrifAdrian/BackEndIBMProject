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
        return classroomRepository.findById(id);
    }

    @Override
    public List<Classroom> getAllClassroom() {
        return classroomRepository.findAll();
    }

    @Override
    public void deleteClassroom(Long id) {
        classroomRepository.deleteById(id);
    }

    @Override
    public Classroom updateClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    @Override
    public Long persistClassroom(Classroom classroom) {
        Classroom savedClassroom = classroomRepository.save(classroom);
        return savedClassroom.getId();
    }
}
