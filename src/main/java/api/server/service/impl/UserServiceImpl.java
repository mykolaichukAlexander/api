package api.server.service.impl;

import api.server.entity.User;
import api.server.entity.repository.UserRopository;
import api.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRopository userRopository;

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPass(userRopository.findByLogin(login).getPass());
        return user;
    }
}
