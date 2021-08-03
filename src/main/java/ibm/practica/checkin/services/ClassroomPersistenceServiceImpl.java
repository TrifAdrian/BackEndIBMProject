package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.db.model.Feature;
import ibm.practica.checkin.db.repository.ClassroomRepository;
import ibm.practica.checkin.db.repository.FeatureRepository;
import ibm.practica.checkin.domain.model.ClassroomDto;
import ibm.practica.checkin.domain.model.FeatureDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClassroomPersistenceServiceImpl implements ClassroomPersistenceService{

    @Autowired
    private ClassroomRepository classroomRepository;

    @Autowired
    private FeatureRepository featureRepository;

    @Override
    public List<ClassroomDto> getAllClassroom() {
        return getClassroomDtos();
    }

    private List<ClassroomDto> getClassroomDtos() {
        List<ClassroomDto> classroomDtos = classroomRepository.getAllClassrooms();
        for (ClassroomDto x : classroomDtos)
        {
            x.setFeatures_list(featureRepository.findFeaturesByClassroomId(x.getId()));
        }
        return classroomDtos;
    }

    @Override
    public void deleteClassroom(Long id) {
        classroomRepository.deleteById(id);
    }

    @Override
    public Integer updateClassroom(ClassroomDto classroomDto) {

        Classroom classroom = new Classroom();
        classroom.setId(classroomDto.getId());
        classroom.setFeatures(getFeatures(classroomDto,classroom));

        featureRepository.deleteFeatureByClassroomId(classroomDto.getId());
        classroomRepository.save(classroom);

        return classroomRepository.updateClassroom(classroomDto);
    }

    @Override
    public Optional<ClassroomDto> findClassroomDto(Long id) {
       ClassroomDto var = classroomRepository.getClassroomById(id);
       var.setFeatures_list(featureRepository.findFeaturesByClassroomId(var.getId()));
       return Optional.of(var);
    }

    @Override
    public Long persistClassroom(ClassroomDto classroomDto) {
        Classroom classroom = new Classroom();

        classroom.setCapacity(classroomDto.getCapacity());
        classroom.setLocation(classroomDto.getLocation());
        classroom.setName(classroomDto.getName());

        Classroom saved = classroomRepository.save(classroom);

        List<Feature> featureList = getFeatures(classroomDto,classroom);

        saved.setFeatures(featureList);
        saved = classroomRepository.save(saved);

        return saved.getId();
    }

    private List<Feature> getFeatures(ClassroomDto classroomDto,Classroom classroom) {
        List<Feature> featureList = new ArrayList<>();
        List<FeatureDto> features_list= classroomDto.getFeatures_list();

        for (FeatureDto f: features_list) {
            Feature feature = new Feature();
            feature.setId(f.getId());
            feature.setClassroom(classroom);
            feature.setName(f.getName());
            featureRepository.save(feature);
            featureList.add(feature);
        }
        return featureList;
    }
}
