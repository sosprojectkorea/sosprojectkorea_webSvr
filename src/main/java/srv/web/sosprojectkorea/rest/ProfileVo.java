package srv.web.sosprojectkorea.rest;

import java.util.Date;

public class ProfileVo {	
	private Integer profile_id;
	private String user_id;
	private Integer job_cate_id;
	private Integer job_cate_sub_id;
	private Integer career;
	private String location1;
	private Date start_time1;
	private Date end_time1;
	private String location2;
	private Date start_time2;
	private Date end_time2;
	private String location3;
	private Date start_time3;
	private Date end_time3;
	private String simple_introduce;
	private String detail_introduce;
	
	public Integer getProfile_id() {
		return profile_id;
	}


	public void setProfile_id(Integer profile_id) {
		this.profile_id = profile_id;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public Integer getJob_cate_id() {
		return job_cate_id;
	}


	public void setJob_cate_id(Integer job_cate_id) {
		this.job_cate_id = job_cate_id;
	}


	public Integer getJob_cate_sub_id() {
		return job_cate_sub_id;
	}


	public void setJob_cate_sub_id(Integer job_cate_sub_id) {
		this.job_cate_sub_id = job_cate_sub_id;
	}


	public Integer getCareer() {
		return career;
	}


	public void setCareer(Integer career) {
		this.career = career;
	}


	public String getLocation1() {
		return location1;
	}


	public void setLocation1(String location1) {
		this.location1 = location1;
	}


	public Date getStart_time1() {
		return start_time1;
	}


	public void setStart_time1(Date start_time1) {
		this.start_time1 = start_time1;
	}


	public Date getEnd_time1() {
		return end_time1;
	}


	public void setEnd_time1(Date end_time1) {
		this.end_time1 = end_time1;
	}


	public String getLocation2() {
		return location2;
	}


	public void setLocation2(String location2) {
		this.location2 = location2;
	}


	public Date getStart_time2() {
		return start_time2;
	}


	public void setStart_time2(Date start_time2) {
		this.start_time2 = start_time2;
	}


	public Date getEnd_time2() {
		return end_time2;
	}


	public void setEnd_time2(Date end_time2) {
		this.end_time2 = end_time2;
	}


	public String getLocation3() {
		return location3;
	}


	public void setLocation3(String location3) {
		this.location3 = location3;
	}


	public Date getStart_time3() {
		return start_time3;
	}


	public void setStart_time3(Date start_time3) {
		this.start_time3 = start_time3;
	}


	public Date getEnd_time3() {
		return end_time3;
	}


	public void setEnd_time3(Date end_time3) {
		this.end_time3 = end_time3;
	}


	public String getSimple_introduce() {
		return simple_introduce;
	}


	public void setSimple_introduce(String simple_introduce) {
		this.simple_introduce = simple_introduce;
	}


	public String getDetail_introduce() {
		return detail_introduce;
	}


	public void setDetail_introduce(String detail_introduce) {
		this.detail_introduce = detail_introduce;
	}
	
	
	public ProfileVo(Integer profile_id, String user_id
			, Integer job_cate_id, Integer job_cate_sub_id, Integer career
			, String location1, Date start_time1, Date end_time1
			, String location2, Date start_time2, Date end_time2
			, String location3, Date start_time3, Date end_time3
			, String simple_introduce, String detail_introduce) {
		this.profile_id = profile_id;
		this.user_id = user_id;
		this.job_cate_id = job_cate_id;
		this.job_cate_sub_id = job_cate_sub_id;
		this.career = career;
		this.location1 = location1;
		this.start_time1 = start_time1;
		this.end_time1 = end_time1;
		this.location2 = location2;
		this.start_time2 = start_time2;
		this.end_time2 = end_time2;
		this.location3 = location3;
		this.start_time3 = start_time3;
		this.end_time3 = end_time3;
		this.simple_introduce = simple_introduce;
		this.detail_introduce = detail_introduce;
	}
	
}
