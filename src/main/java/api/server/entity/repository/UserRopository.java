package api.server.entity.repository;

import api.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRopository extends JpaRepository<User, Long> {

    User findByLogin(String login);

}
