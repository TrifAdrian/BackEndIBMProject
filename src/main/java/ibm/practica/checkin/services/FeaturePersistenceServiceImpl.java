package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Feature;
import ibm.practica.checkin.db.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FeaturePersistenceServiceImpl implements FeaturePersistenceService{

    @Autowired
    private FeatureRepository featureRepository;

    @Override
    public Long persistFeature(Feature feature) {
        Feature savedFeature = featureRepository.save(feature);
        return savedFeature.getId();
    }

    @Override
    public void deleteFeature(Long id) {
        featureRepository.deleteById(id);
    }
}
