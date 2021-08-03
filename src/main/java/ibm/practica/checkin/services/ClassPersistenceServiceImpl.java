package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.db.repository.ClassRepository;
import ibm.practica.checkin.domain.model.ClassDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassPersistenceServiceImpl implements ClassPersistenceService{

    @Autowired
    private ClassRepository classRepository;

    @Override
    public Class updateStudentList(Long id, List<User> students) {
        Optional<Class> updateClass = classRepository.findById(id);
        //return classRepository.save(updateClass);
        return null;
    }

    @Override
    public Optional<Class> findClass(Long id) {
        return classRepository.findById(id);
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
