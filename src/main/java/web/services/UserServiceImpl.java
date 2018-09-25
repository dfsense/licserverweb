package web.services;

import org.springframework.stereotype.Service;
import web.models.User;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public void save(User user) {

    }

    @Override
    public User findByName(String name) {
        return null;
    }
}
