package ibm.practica.checkin.services.Schedule;

import ibm.practica.checkin.db.model.Schedule;
import org.springframework.stereotype.Service;



public interface SchedulePersistenceService {
    Long persistSchedule(Schedule schedule);
}
