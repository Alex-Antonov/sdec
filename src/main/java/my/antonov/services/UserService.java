package my.antonov.services;


import my.antonov.jdbc.model.User;

import java.util.List;

public interface UserService {

    void addNewUser(String name);
    User getUserByID(Long id);
    List<User> getAllUsers();
    List<User> searchUser(String name);
}
