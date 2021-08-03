package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.domain.model.ClassDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ClassPersistenceService {
     Long persistClass(Class aClass);
     Optional<Class> findClass(Long id);
     List<ClassDto> getAllClasses();
     Class updateClass(Class aClass);
     void deleteClass(Long id);
     Class updateStudentList(Long id,List<User> students);

}
