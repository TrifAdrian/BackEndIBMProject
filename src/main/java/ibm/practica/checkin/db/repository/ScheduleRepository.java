package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.Schedule;
import ibm.practica.checkin.domain.model.ScheduleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    @Query("SELECT new ibm.practica.checkin.domain.model.ScheduleDto(s.localDate) from Schedule s join s.aClass cls where cls.id =:id")
    List<ScheduleDto> getSchedulesByClassId(Long id);

}
