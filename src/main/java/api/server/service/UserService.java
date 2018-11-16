package api.server.service;

import api.server.entity.User;

public interface UserService {
    User getUser(String login);
}
