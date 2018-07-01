package jp.co.axiz.web.entitiy;


public class Admin {

	private String loginId;
	private String loginPass;

	private String admin_id;
	private String admin_name;
	private String password;

//	public Admin() {
//	}
//	public Admin(String admin_id, String admin_name, String password) {
//		this.admin_id = admin_id;
//		this.admin_name = admin_name;
//		this.password = password;
//	}


	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}


	public void setAdminId(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdminId() {
		return this.admin_id;
	}

	public void setAdminName(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdminName() {
		return this.admin_name;
	}

	public void setAdminPass(String password) {
		this.password = password;
	}

	public String getAdminPass() {
		return this.password;

//			public Admin() {
//			}
//			public Admin(String admin_id, String admin_name, String password) {
//				this.adminId = admin_id;
//				this.adminName = admin_name;
//				this.password = password;
//			}

		//	public Admin(String userId, String user_Name, String telephone) {
		//		this.userId = userId;
		//		this.userName = user_Name;
		//		this.telePhone = telephone;
		//	}
		//	public Admin(String userId, String user_Name, String telephone, String password) {
		//		this.userId = userId;
		//		this.userName = user_Name;
		//		this.telePhone = telephone;
		//		this.password = password;
		//	}
		//	public Admin(String userId) {
		//		this.userId = userId;
		//	}
		//
		//	public void setUserId(String userId) {
		//		this.userId = userId;
		//	}
		//
		//	public String getUserId() {
		//		return this.userId;
		//	}
		//
		//	public void setUserName(String user_Name) {
		//		this.userName = user_Name;
		//	}
		//
		//	public String getUserName() {
		//		return this.userName;
		//	}
		//
		//	public void setTelePhone(String telephone) {
		//		this.telephone = telephone;
		//	}
		//
		//	public String getTelePhone() {
		//		return this.telephone;
		//	}
		//
		//	public void setPassword(String password) {
		//		this.password = password;
		//	}
		//
		//	public String getPassword() {
		//		return this.password;
		//	}

	}
}
