package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.Feature;
import ibm.practica.checkin.domain.model.FeatureDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;

public interface FeatureRepository extends JpaRepository<Feature, Long> {

    @Query("SELECT DISTINCT new ibm.practica.checkin.domain.model.FeatureDto(f.name,f.id) FROM Feature f WHERE f.classroom.id = :id")
    List<FeatureDto> findFeaturesByClassroomId(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("DELETE from Feature f where f.id = :id AND f.classroom.id = :classroomId")
    void deleteFeatureFromClassroom(@Param("id") Long id,@Param("classroomId") Long classroomId);

    @Transactional
    @Modifying
    void deleteFeatureById(Long id);

    @Transactional
    @Modifying
    void deleteFeatureByClassroomId(Long id);

    @Transactional
    @Modifying
    @Query("UPDATE Feature SET name = :#{#featureDto.name} where id = :#{#featureDto.id} ")
    Integer updateFeatureNameById(FeatureDto featureDto);

    @Transactional
    @Modifying
    void deleteFeaturesByClassroomId(Long id);


}
