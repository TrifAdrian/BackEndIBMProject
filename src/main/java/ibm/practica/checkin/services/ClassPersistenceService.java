package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.domain.model.ClassDetail;
import ibm.practica.checkin.domain.model.ClassDto;
import ibm.practica.checkin.domain.model.StudentDetails;

import java.util.List;
import java.util.Optional;


public interface ClassPersistenceService {
     Long persistClass(ClassDetail classDetail);
     Optional<ClassDto> findClass(Long id);
     List<ClassDto> getAllClasses();
     Class updateClass(Class aClass);
     void deleteClass(Long id);
     Integer updateStudentList(Long id, Long studentId);

}
