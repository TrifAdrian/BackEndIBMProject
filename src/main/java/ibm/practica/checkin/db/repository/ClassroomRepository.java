package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.domain.model.ClassroomDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

    @Query("SELECT new ibm.practica.checkin.domain.model.ClassroomDto(cr.id,cr.name,cr.location,cr.capacity) " +
            "FROM Classroom cr where cr.id = :id ")
    ClassroomDto getClassroomById(@Param("id") Long id);

    @Query("SELECT NEW ibm.practica.checkin.domain.model.ClassroomDto(cr.id,cr.name,cr.location,cr.capacity) " +
            "from Classroom cr")
    List<ClassroomDto> getAllClassrooms();

    @Transactional
    @Modifying
    @Query("UPDATE Classroom cr SET cr.capacity=:#{#classroomDto.capacity}, " +
            "cr.location=:#{#classroomDto.location}, cr.name=:#{#classroomDto.name} where cr.id =:#{#classroomDto.id}")
    Integer updateClassroomDetails(ClassroomDto classroomDto);

    @Query("SELECT distinct c from Classroom c join c.classes clas  where clas.id= :id ")
    List<Classroom> findClassroomsByClassId(@Param("id") Long id);

    @Query("select new ibm.practica.checkin.domain.model.ClassroomDto(cr.id,cr.name,cr.location,cr.capacity) from Classroom cr join cr.classes cls where cls.id= :id ")
    List<ClassroomDto> getClassroomsDetailsByClassId(@Param("id") Long id);

    @Query("select new ibm.practica.checkin.domain.model.ClassroomDto(cr.id, cr.name, cr.location, cr.capacity)" +
            "from Classroom cr join cr.classes repatition where repatition.id = :id")
    ClassroomDto getClassroomByClassId(@Param("id") Long id);

    @Query("select cr from Classroom cr join cr.classes c where c.id = :id")
    Classroom getClassroomEnByClassId(@Param("id") Long id);






}
