package Form.example.BasicForm.repository;

import Form.example.BasicForm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
