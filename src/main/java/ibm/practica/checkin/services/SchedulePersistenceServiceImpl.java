package ibm.practica.checkin.services;

import ibm.practica.checkin.db.model.Schedule;
import ibm.practica.checkin.db.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SchedulePersistenceServiceImpl implements SchedulePersistenceService{

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public Long persistSchedule(Schedule schedule) {
        Schedule savedSchedule = scheduleRepository.save(schedule);
        return savedSchedule.getId();
    }
}
