package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
