package jp.co.axiz.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dao.UserDao;
import jp.co.axiz.web.entitiy.User;

@Repository
public class PgUserDao implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> findAll() {
		return jdbcTemplate.query(
				"SELECT admin_id, admin_name, password FROM admin WHERE admin_id = ? AND password = ?",
				new BeanPropertyRowMapper<User>(User.class));
	}

}