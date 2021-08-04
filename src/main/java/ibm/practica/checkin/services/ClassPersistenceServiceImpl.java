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

            List<ClassroomDto> classroomDtos = getClassroomDtos(id);

            classDto.setDateList(scheduleRepository.getSchedulesByClassId(id));
            classDto.setClassroom(classroomDtos);

            return Optional.of(classDto);
        }


        return Optional.empty();

    }

    private List<ClassroomDto> getClassroomDtos(Long id) {
        List<Classroom> classroomList =classroomRepository.findClassroomsByClassId(id);
        List<ClassroomDto> classroomDtos = new ArrayList<>();
        for (Classroom classroom : classroomList)
        {
            ClassroomDto classroomDto = new ClassroomDto(classroom.getId(),
                    classroom.getName(),
                    classroom.getLocation(),
                    classroom.getCapacity(),
                    featureRepository.findFeaturesByClassroomId(classroom.getId()));
            classroomDtos.add(classroomDto);
        }
        return classroomDtos;
    }

    @Override
    public List<ClassDto> getAllClasses() {
       List<ClassDto> classDtos = classRepository.getAllClassDetailsDto();

        for (ClassDto dto: classDtos)
        {
            List<ClassroomDto> classroomDtos = classroomRepository.getClassroomsDetailsByClassId(dto.getId());
//            for (ClassroomDto classroomDto : classroomDtos)
//            {
//                classroomDto.setFeatures_list(featureRepository.findFeaturesByClassroomId(classroomDto.getId()));
//            }

            dto.setClassroom(classroomDtos);
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
        Class savedClass =classRepository.save(aClass);
        return savedClass.getId();
    }


}
