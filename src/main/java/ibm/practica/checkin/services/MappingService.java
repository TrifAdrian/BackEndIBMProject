package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.*;
import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.domain.model.*;

public interface MappingService {

    Classroom ClassroomDtoToEntity(ClassroomDto classroomDto);
    ClassroomDto EntityToClassroomDto(Classroom classroom);
    Class ClassDtoToEntity(ClassDto classDto);
    ClassDto EntityToClassDto(Class aClass);
    Feature FeatureDtotoEntity(FeatureDto featureDto);
    FeatureDto EntityToFeatureDto(Feature feature);
    User UserFullNameToEntity(UserFullName userFullName);
    Schedule ScheduleDtoToEntity(ScheduleDto scheduleDto);
}
