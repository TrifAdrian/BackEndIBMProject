package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClassPersistenceServiceImpl implements ClassPersistenceService{

    @Autowired
    private ClassRepository classRepository;

    @Override
    public Optional<Class> findClass(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Class> getAllClasses() {
        return null;
    }

    @Override
    public Class updateClass(Class aClass) {
        return null;
    }

    @Override
    public void deleteClass(Long id) {

    }

    @Override
    public Long persistClass(Class aClass) {
        return null;
    }


}
