package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.domain.model.ClassDto;
import org.springframework.data.jpa.repository.JpaRepository;
import ibm.practica.checkin.db.model.Class;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassRepository extends JpaRepository <Class, Long>{
    @Query("SELECT new ibm.practica.checkin.domain.model.ClassDto(c.name, c.year, c.section) from Class c where c.id =:id")
    ClassDto findClassById(@Param("id") Long id);


    @Query("SELECT new ibm.practica.checkin.domain.model.ClassDto(c.name, c.year, c.section) from Class c ")
    List<ClassDto> findAllClassDto();
}
