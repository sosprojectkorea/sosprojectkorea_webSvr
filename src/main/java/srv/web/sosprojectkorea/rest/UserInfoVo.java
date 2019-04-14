package srv.web.sosprojectkorea.rest;

public class UserInfoVo {
	private Integer id;
	private String user_id;
	private String password;
	private String email;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public UserInfoVo(Integer id, String user_id, String password, String email) {
		this.id = id;
		this.user_id = user_id;
		this.password = password;
		this.email = email;
	}
	
}
