package srv.web.sosprojectkorea.rest;

public class JobCateSubVo {
	private Integer job_cate_sub_id;
	private String job_cate_sub_code;
	private String job_cate_sub_name;
	private Integer job_cate_id;
	
	public Integer getJob_cate_sub_id() {
		return job_cate_sub_id;
	}

	public void setJob_cate_sub_id(Integer job_cate_sub_id) {
		this.job_cate_sub_id = job_cate_sub_id;
	}


	public String getJob_cate_sub_code() {
		return job_cate_sub_code;
	}


	public void setJob_cate_sub_code(String job_cate_sub_code) {
		this.job_cate_sub_code = job_cate_sub_code;
	}


	public String getJob_cate_sub_name() {
		return job_cate_sub_name;
	}


	public void setJob_cate_sub_name(String job_cate_sub_name) {
		this.job_cate_sub_name = job_cate_sub_name;
	}


	public Integer getJob_cate_id() {
		return job_cate_id;
	}


	public void setJob_cate_id(Integer job_cate_id) {
		this.job_cate_id = job_cate_id;
	}
	
	public JobCateSubVo(Integer job_cate_sub_id, String job_cate_sub_code, String job_cate_sub_name, Integer job_cate_id) {
		this.job_cate_sub_id = job_cate_sub_id;
		this.job_cate_sub_code = job_cate_sub_code;
		this.job_cate_sub_name = job_cate_sub_name;
		this.job_cate_id = job_cate_id;
	}
	
}
