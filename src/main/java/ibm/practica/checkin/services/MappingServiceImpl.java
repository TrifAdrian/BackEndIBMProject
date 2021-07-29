package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.*;
import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.domain.model.*;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MappingServiceImpl implements MappingService{


    @Override
    public Classroom ClassroomDtoToEntity(ClassroomDto classroomDto) {
        Classroom classroom = new Classroom();
        classroom.setName(classroomDto.getName());
        classroom.setLocation(classroomDto.getLocation());
        classroom.setCapacity(classroomDto.getCapacity());

        List<Feature> features_list = getFeatures(classroomDto);

        classroom.setFeatures(features_list);

        return classroom;
    }

    private List<Feature> getFeatures(ClassroomDto classroomDto) {
        List<FeatureDto> features = classroomDto.getFeatures_list();
        List<Feature> features_list = Collections.emptyList();

        for( FeatureDto feature : features )
        {
            features_list.add(FeatureDtotoEntity(feature));
        }
        return features_list;
    }

    @Override
    public ClassroomDto EntityToClassroomDto(Classroom classroom) {
        List<FeatureDto> featureDtoList = getFeatureDtoList(classroom);

        return new ClassroomDto(classroom.getName(), classroom.getLocation(), classroom.getCapacity(), featureDtoList);
    }

    private List<FeatureDto> getFeatureDtoList(Classroom classroom) {
        List <Feature> featureList = classroom.getFeatures();
        List <FeatureDto> featureDtoList = Collections.emptyList();

        for(Feature f : featureList)
        {
            featureDtoList.add(EntityToFeatureDto(f));
        }
        return featureDtoList;
    }

    @Override
    public Class ClassDtoToEntity(ClassDto classDto) {
        Class aClass = new Class();

        aClass.setName(classDto.getName());
        aClass.setSection(classDto.getSection());
        aClass.setYear(classDto.getYear());

        Set<Classroom> classrooms = getClassrooms(classDto);

        aClass.setClassrooms(classrooms);

        List<User> teachers = getUsers(classDto);

        aClass.setTeacher(teachers);

        List<Schedule> scheduleList = getSchedules(classDto);

        aClass.setClassDates(scheduleList);

        return aClass;
    }

    private List<Schedule> getSchedules(ClassDto classDto) {
        List <Schedule> scheduleList = Collections.emptyList();
        List <ScheduleDto> scheduleDtoList = classDto.getDateList();
        for (ScheduleDto s : scheduleDtoList)
        {
            scheduleList.add(ScheduleDtoToEntity(s));
        }
        return scheduleList;
    }

    private List<User> getUsers(ClassDto classDto) {
        List<User> teachers = Collections.emptyList();
        List<UserFullName> teacher_names= classDto.getTeacher();

        for(UserFullName teacher : teacher_names)
        {
            teachers.add(UserFullNameToEntity(teacher));
        }
        return teachers;
    }


    private Set<Classroom> getClassrooms(ClassDto classDto) {
        List<ClassroomDto> classroomDtos = classDto.getClassroom();
        Set<Classroom> classrooms = Collections.emptySet();
        for (ClassroomDto c : classroomDtos)
        {
            classrooms.add(ClassroomDtoToEntity(c));
        }
        return classrooms;
    }


    @Override
    public ClassDto EntityToClassDto(Class aClass) {
        return null;
    }

    @Override
    public Feature FeatureDtotoEntity(FeatureDto featureDto) {
        return null;
    }

    @Override
    public FeatureDto EntityToFeatureDto(Feature feature) {
        return null;
    }

    @Override
    public User UserFullNameToEntity(UserFullName userFullName) {
        return null;
    }

    @Override
    public Schedule ScheduleDtoToEntity(ScheduleDto scheduleDto) {
        return null;
    }
}

