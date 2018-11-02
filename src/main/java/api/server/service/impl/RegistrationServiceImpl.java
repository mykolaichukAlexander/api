package api.server.service.impl;

import api.server.entity.User;
import api.server.entity.repository.UserRopository;
import api.server.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private final UserRopository userRopository;

    @Override
    public User addUser(User user) {
        return userRopository.save(user);
    }
}
