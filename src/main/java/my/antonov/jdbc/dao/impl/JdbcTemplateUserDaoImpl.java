package my.antonov.jdbc.dao.impl;


import my.antonov.jdbc.dao.UserDao;
import my.antonov.jdbc.model.User;
import my.antonov.jdbc.util.UserMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplateUserDaoImpl implements UserDao{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createUser(String name) {
        String sql = "INSERT INTO user (name) VALUES (?)";

        jdbcTemplate.update(sql, name);
    }

    public User getUserByID(Long id) {
        String sql = "SELECT * FROM user WHERE id = ?";

        User user = (User) jdbcTemplate.queryForObject(sql, new Object[]{id}, new UserMapper());
        return user;
    }

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM user";

        List users = jdbcTemplate.query(sql, new UserMapper());
        return users;
    }

    public List<User> searchUser(String name) {
        String sql = "SELECT * FROM user WHERE name LIKE ?";
        List users = jdbcTemplate.query(sql, new Object[]{name + "%"}, new UserMapper());
        return users;
    }
}
