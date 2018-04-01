package my.antonov.jdbc.dao;


import my.antonov.jdbc.model.User;

import javax.sql.DataSource;
import java.util.List;

public interface UserDao {

    void setDataSource(DataSource dataSource);

    void createUser(String name);

    User getUserByID(Long id);

    List<User> getAllUsers();

    List<User> searchUser(String name);
}
