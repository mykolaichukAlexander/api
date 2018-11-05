package api.server.service;

import api.server.entity.User;
import api.server.service.dto.UserDto;

public interface RegistrationService {

    UserDto addUser(UserDto user);
}
