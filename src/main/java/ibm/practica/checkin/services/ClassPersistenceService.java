package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.Classroom;

import java.util.List;
import java.util.Optional;

public interface ClassPersistenceService {
     Long persistClass(Class aClass);
     Optional<Class> findClass(Long id);
     List<Class> getAllClasses();
     Class updateClass(Class aClass);
     void deleteClass(Long id);

}
