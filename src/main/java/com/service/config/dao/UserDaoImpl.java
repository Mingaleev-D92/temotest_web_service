package com.service.config.dao;

import com.service.config.entity.User;
import com.service.config.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void save(User user) {
        String sql = "INSERT INTO user (date, security, cost) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getDate(), user.getSecurity(), user.getCost());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET date=?, security=?, cost=? WHERE id=?";
        jdbcTemplate.update(sql, user.getDate(), user.getSecurity(), user.getCost(), user.getId());

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql, id);

    }
}
