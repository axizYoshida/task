package jp.co.axiz.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.axiz.web.dao.AdminDao;
import jp.co.axiz.web.entitiy.Admin;
import jp.co.axiz.web.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	public List<Admin> authentication(String id, String pass) {

		return adminDao.authentication(id, pass);
	}
}