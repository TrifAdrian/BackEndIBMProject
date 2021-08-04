package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.db.repository.ClassRepository;
import ibm.practica.checkin.db.repository.ClassroomRepository;
import ibm.practica.checkin.db.repository.FeatureRepository;
import ibm.practica.checkin.db.repository.ScheduleRepository;
import ibm.practica.checkin.domain.model.ClassDto;
import ibm.practica.checkin.domain.model.ClassroomDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ClassPersistenceServiceImpl implements ClassPersistenceService{

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private ClassroomRepository classroomRepository;

    @Autowired
    private FeatureRepository featureRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

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
            ClassDto classDto = classRepository.getClassDetails(id);

            ClassroomDto classroomDto = classroomRepository.getClassroomByClassId(id);
            classroomDto.setFeatures_list(featureRepository.findFeaturesByClassroomId(classroomDto.getId()));
            classDto.setClassroom(classroomDto);

            classDto.setDateList(scheduleRepository.getSchedulesByClassId(id));
            return Optional.of(classDto);
        }


        return Optional.empty();

    }

    @Override
    public List<ClassDto> getAllClasses() {
       List<ClassDto> classDtos = classRepository.getAllClassDetailsDto();

        for (ClassDto dto: classDtos)
        {
            ClassroomDto classroomDto = classroomRepository.getClassroomByClassId(dto.getId());

            classroomDto.setFeatures_list(featureRepository.findFeaturesByClassroomId(classroomDto.getId()));
            dto.setClassroom(classroomDto);
            dto.setDateList(scheduleRepository.getSchedulesByClassId(dto.getId()));
        }
        return classDtos;
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
        Class savedClass =classRepository.save(aClass);//sunt putin afk ma duc sa vad daca e gata masa also vezi ca nu ai dat commit la tot
        return savedClass.getId();                     //scrie in terminal git add .
    }


}
