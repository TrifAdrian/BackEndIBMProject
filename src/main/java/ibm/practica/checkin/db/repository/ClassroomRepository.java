package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.domain.model.ClassroomDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

//    @Query("select new ibm.practica.checkin.domain.model.ClassroomDto")
//    List<ClassroomDto> findAllClassrooms();

}
