package springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootcrud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
