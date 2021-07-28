package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}
