package ibm.practica.checkin.db.repository;

import ibm.practica.checkin.db.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {




}
