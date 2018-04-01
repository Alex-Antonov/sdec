package my.antonov.services.impl;

import my.antonov.jdbc.dao.UserDao;
import my.antonov.jdbc.model.User;
import my.antonov.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by alex on 31.03.2018.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao jdbcTemplateUserDao;

    public void addNewUser(String name) {
        jdbcTemplateUserDao.createUser(name);
    }

    public User getUserByID(Long id) {
        return jdbcTemplateUserDao.getUserByID(id);
    }

    public List<User> getAllUsers() {
        return jdbcTemplateUserDao.getAllUsers();
    }

    public List<User> searchUser(String name) {
        return jdbcTemplateUserDao.searchUser(name);
    }
}
