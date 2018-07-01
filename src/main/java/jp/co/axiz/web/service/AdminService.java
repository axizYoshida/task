package jp.co.axiz.web.service;

import java.util.List;

import jp.co.axiz.web.entitiy.Admin;

public interface AdminService{
	public List<Admin> authentication(String id, String pass);

}