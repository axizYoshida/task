package jp.co.axiz.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.axiz.web.dao.UserDao;
import jp.co.axiz.web.entitiy.User;
import jp.co.axiz.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<User> findAll() {

		return userDao.findAll2();
}

//	@Autowired
//	private UserDao userDao;
//
//	@Override
//	public List<User> findAll() {
//		return userDao.findAll();
//	}
//
//}
//
//
//public User authentication(String id, String pass) {
//	try (Connection con = DbUtil.getConnection()) {
//		UserDao userDao = new UserDao(con);
//		User user = userDao.findByIdAndPass(id, pass);
//
//		return user;
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//
//	return null;
}