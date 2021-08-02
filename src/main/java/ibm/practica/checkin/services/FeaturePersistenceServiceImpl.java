package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Feature;
import ibm.practica.checkin.db.repository.FeatureRepository;
import ibm.practica.checkin.domain.model.FeatureDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeaturePersistenceServiceImpl implements FeaturePersistenceService{

    @Autowired
    private FeatureRepository featureRepository;

    @Override
    public Long persistFeature(Feature feature) {
        Feature savedFeature = featureRepository.save(feature);
        return savedFeature.getId();
    }

    @Override
    public void deleteFeature(Long id,Long classroomId) {
        featureRepository.deleteFeatureFromClassroom(id,classroomId);
    }

    @Override
    public List<FeatureDto> getAllFeatures(Long id) {
        return featureRepository.findFeaturesByClassroomId(id);
    }
}
