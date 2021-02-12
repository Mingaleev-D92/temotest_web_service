package com.service.config.mapper;

import com.service.config.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setDate(resultSet.getString("date"));
        user.setSecurity(resultSet.getString("security"));
        user.setCost(resultSet.getInt("cost"));
        return user;
    }
}
