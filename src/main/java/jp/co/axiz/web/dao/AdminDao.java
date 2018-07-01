package jp.co.axiz.web.dao;

import java.util.List;

import jp.co.axiz.web.entitiy.Admin;


public interface AdminDao {
	public List<Admin> authentication(String id, String pass) ;

}
