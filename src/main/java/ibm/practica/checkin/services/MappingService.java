package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.db.model.Feature;
import ibm.practica.checkin.domain.model.ClassDto;
import ibm.practica.checkin.domain.model.ClassroomDto;
import ibm.practica.checkin.domain.model.FeatureDto;

public interface MappingService {

    Classroom ClassroomDtoToEntity(ClassroomDto classroomDto);
    ClassroomDto EntityToClassroomDto(Classroom classroom);
    Class ClassDtoToEntity(ClassDto classDto);
    ClassDto EntityToClassDto(Class aClass);
    Feature FeatureDtotoFeature(FeatureDto featureDto);

}
