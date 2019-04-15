package srv.web.sosprojectkorea.rest;

public class JobCateVo {
	private Integer job_cate_id;
	private String job_cate_code;
	private String job_cate_name;
	
	public Integer getJob_cate_id() {
		return job_cate_id;
	}
	public void setJob_cate_id(Integer job_cate_id) {
		this.job_cate_id = job_cate_id;
	}
	public String getJob_cate_code() {
		return job_cate_code;
	}
	public void setJob_cate_code(String job_cate_code) {
		this.job_cate_code = job_cate_code;
	}
	public String getJob_cate_name() {
		return job_cate_name;
	}
	public void setJob_cate_name(String job_cate_name) {
		this.job_cate_name = job_cate_name;
	}
	
	public JobCateVo(Integer job_cate_id, String job_cate_code, String job_cate_name) {
		this.job_cate_id = job_cate_id;
		this.job_cate_code = job_cate_code;
		this.job_cate_name = job_cate_name;
	}
	
}
