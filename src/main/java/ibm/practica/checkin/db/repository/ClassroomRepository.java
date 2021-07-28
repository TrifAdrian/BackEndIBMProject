package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

}
