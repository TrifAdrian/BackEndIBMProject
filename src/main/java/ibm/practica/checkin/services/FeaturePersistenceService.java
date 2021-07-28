package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Feature;

public interface FeaturePersistenceService {
    Long persistFeature(Feature feature);

}
