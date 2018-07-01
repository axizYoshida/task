package jp.co.axiz.web.controller;

public class Form {

	   // @NotNull
	   // @Size(min = 1, max = 127)
	    private String loginId;

	  //  @NotNull
	   // @Size(min = 1, max = 127)
	    private String loginPass;

	    private String adminName;
//	    private String admin_name;

	    public void setLoginId(String loginId) {
	        this.loginId = loginId;
	    }

	    public String getLoginId() {
	        return loginId;
	    }

	    public void setLoginPass(String loginPass) {
	        this.loginPass = loginPass;
	    }

	    public String getLoginPass() {
	        return loginPass;
	    }

	    public void setAdminName(String adminName) {
	        this.adminName = adminName;
	    }
	    public String getAdminName() {
	        return adminName;
	    }

//	    public void setAdminName(String admin_name) {
//	        this.admin_name = admin_name;
//	    }
//
//	    public String getAdminName() {
//	        return admin_name;
//	    }

	    private String userId;
	    private String name;
	    private String tel;

	    public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}




}
