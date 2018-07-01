package jp.co.axiz.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dao.AdminDao;
import jp.co.axiz.web.entitiy.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Admin> authentication(String id, String pass) {
		return jdbcTemplate.query(
				"SELECT admin_id, admin_name, password FROM admin WHERE admin_id = ? AND password = ?",
				new BeanPropertyRowMapper<Admin>(Admin.class), id, pass);
	}
}