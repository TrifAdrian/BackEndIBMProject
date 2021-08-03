package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.db.repository.ClassRepository;
import ibm.practica.checkin.db.repository.ClassroomRepository;
import ibm.practica.checkin.domain.model.ClassDto;
import ibm.practica.checkin.domain.model.ClassroomDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassPersistenceServiceImpl implements ClassPersistenceService{

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public Class updateStudentList(Long id, List<User> students) {
       // Optional<Class> updateClass = classRepository.findById(id);
        //return classRepository.save(updateClass);
        return null;
    }

    @Override
    public Optional<ClassDto> findClass(Long id) {

        Optional<Class> opt = classRepository.findById(id);
        if(opt.isPresent())
        {
            Class var = opt.get();
            ClassDto classDto = classRepository.getClassDetails(id);
            classDto.setClassroom(classroomRepository.getClassroomById(id));

            Optional<ClassDto> optionalClassDto = Optional.of(classDto);
            return optionalClassDto;

        }

        return Optional.empty();

    }

    @Override
    public List<ClassDto> getAllClasses() {
        return classRepository.findAllClassDto();
    }

    @Override
    public Class updateClass(Class aClass) {
        return classRepository.save(aClass);
    }

    @Override
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }

    @Override
    public Long persistClass(Class aClass) {
        Class savedClass =classRepository.save(aClass);
        return savedClass.getId();
    }


}
