package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Feature;
import ibm.practica.checkin.db.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FeaturePersistenceServiceImpl implements FeaturePersistenceService{

    @Autowired
    private FeatureRepository featureRepository;

    @Override
    public Long persistFeature(Feature feature) {
        return null;
    }
}
