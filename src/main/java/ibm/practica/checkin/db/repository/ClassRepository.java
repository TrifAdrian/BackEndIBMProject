package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.domain.model.ClassDto;
import org.springframework.data.jpa.repository.JpaRepository;
import ibm.practica.checkin.db.model.Class;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClassRepository extends JpaRepository <Class, Long>{

    Optional<Class> findById(Long id);

    @Query("select new ibm.practica.checkin.domain.model.ClassDto(c.id,c.name,c.year,c.section,concat(t.firstName,' ',t.lastName)) " +
            "from Class c join c.teacher t ")
    List<ClassDto> getAllClassDetailsDto();


    @Query("select new ibm.practica.checkin.domain.model.ClassDto(c.id,c.name,c.year,c.section,concat(t.firstName,' ',t.lastName)) " +
            "from Class c join c.teacher t where c.id =:id")
    ClassDto getClassDetails(@Param("id") Long id);




}
