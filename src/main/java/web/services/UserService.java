package web.services;

import web.models.User;

public interface UserService {

    void save(User user);

    User findByName(String name);
}
