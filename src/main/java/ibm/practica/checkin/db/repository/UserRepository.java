package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.Role;
import ibm.practica.checkin.db.model.User;
import ibm.practica.checkin.domain.model.Teacher;
import ibm.practica.checkin.domain.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {



    @Query("SELECT new ibm.practica.checkin.domain.model.UserDto(u.id,concat(u.firstName,' ',u.lastName)," +
            "u.section,u.department,u.year,u.role) from User u ")
    List<UserDto> getAllUserDto();

    @Query("SELECT new ibm.practica.checkin.domain.model.Teacher(u.id,concat(u.firstName,' ',u.lastName)," +
            "u.department,u.section ) from User u where u.role = :role")
    List<Teacher> getAllTeachers(@Param("role") Role role);


}
