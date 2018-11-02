package api.server.entity.repository;

import api.server.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRopository extends CrudRepository<User, Long> {
}
