package ibm.practica.checkin.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ibm.practica.checkin.db.model.Class;
public interface ClassRepository extends JpaRepository <Class, Long>{

}
