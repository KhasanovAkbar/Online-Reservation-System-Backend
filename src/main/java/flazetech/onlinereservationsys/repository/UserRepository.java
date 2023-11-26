package flazetech.onlinereservationsys.repository;


import flazetech.onlinereservationsys.model.Reservation;
import flazetech.onlinereservationsys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

   Optional<User> findByEmail(String email);

}
