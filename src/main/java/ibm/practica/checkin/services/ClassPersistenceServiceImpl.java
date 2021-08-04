package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.db.model.Schedule;
import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.db.repository.*;
import ibm.practica.checkin.domain.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Autowired
    private UserRepository userRepository;

    @Override
    public Integer updateStudentList(Long id, Long studentId) {
        Optional<Class> updateClass = classRepository.findById(id);
        if(updateClass.isPresent())
        {
            Class var = updateClass.get();
            Set<User> studentlist = var.getStudents();
            User user = userRepository.getById(studentId);
            studentlist.add(user);
            classRepository.save(var);

            return new Integer(0);
        }
        return new Integer(1);
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
    public Long persistClass(ClassDetail classDetail) {

        Class createClass = new Class();

        createClass = classRepository.save(createClass);

        createClass.setName(classDetail.getName());
        createClass.setSection(classDetail.getSection());
        createClass.setYear(classDetail.getYear());
        createClass.setStudents(Collections.emptySet());

        Optional<User> teacherOpt = userRepository.findById(classDetail.getTeacherId());
        User teacher = new User();
        if (teacherOpt.isPresent()) {

            teacher=teacherOpt.get();
        }

        createClass.setTeacher(teacher);

        Optional<Classroom> classroomOpt = classroomRepository.findById(classDetail.getClassroomId());
        Classroom classroom = new Classroom();
        if(classroomOpt.isPresent()) {
            Set<Classroom> classrooms = new HashSet<>();
            classroom = classroomOpt.get();
            classrooms.add(classroom);

            createClass.setClassrooms(classrooms);
        }

        List<Schedule> schedules = new ArrayList<>();
        List<ScheduleDto> scheduleDtos = classDetail.getDates();

        for(ScheduleDto s : scheduleDtos)
        {
            Schedule schedule = new Schedule();
            schedule.setLocalDate(s.getDate());
            schedule.setaClass(createClass);
            scheduleRepository.save(schedule);
            schedules.add(schedule);
        }
        createClass.setClassDates(schedules);

        Class result = classRepository.save(createClass);

        return result.getId();
    }

}
