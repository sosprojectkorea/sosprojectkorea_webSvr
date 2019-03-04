package srv.web.sosprojectkorea.rest;

public class SampleVo {
	private Integer mno;
	private String firstName,lastName,dept;
	
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public SampleVo() {
		
	}
	
	public SampleVo(Integer mno, String firstName, String lastName, String dept) {
		this.mno = mno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}
	
}
