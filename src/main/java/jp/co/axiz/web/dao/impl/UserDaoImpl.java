package jp.co.axiz.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.entitiy.User;

@Repository
public class UserDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;

//	public List<User> findAll2() {
//		return jdbcTemplate.query(
//				"SELECT user_id, user_name, telephone FROM user_info", new BeanPropertyRowMapper<User>(User.class));
//	}
	public List<User> findAll2() {
		List<User> list = jdbcTemplate.query(
				"SELECT user_id, user_name, telephone FROM user_info ORDER BY user_id",
				new BeanPropertyRowMapper<User>(User.class));
		return list;
	}
}
