package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Schedule;

public interface SchedulePersistenceService {
    Long persistSchedule(Schedule schedule);
}
