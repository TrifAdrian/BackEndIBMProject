package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Feature;
import ibm.practica.checkin.domain.model.FeatureDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FeaturePersistenceService {

    Long persistFeature(Feature feature);
    void deleteFeature(Long id,Long classroomId);
    List<FeatureDto> getAllFeatures(Long id);

}
