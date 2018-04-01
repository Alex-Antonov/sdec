package my.antonov.jdbc.util;


import my.antonov.jdbc.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {

    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User(resultSet.getLong("id"),
                resultSet.getString("name"));

        return user;
    }
}
