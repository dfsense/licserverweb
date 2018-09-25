package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
