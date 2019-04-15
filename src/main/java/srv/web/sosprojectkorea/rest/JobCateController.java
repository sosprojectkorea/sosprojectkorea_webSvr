package srv.web.sosprojectkorea.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobCateController {

	@RequestMapping(value = "/jobCate1", method = RequestMethod.GET)
	public String jobCate1(@RequestParam String str) {
		return str + " : Rest Test";
	}

	@RequestMapping(value = "/jobCate2", method = RequestMethod.GET)
	public JobCateVo jobCate2() {

		JobCateVo jobcateVo = new JobCateVo(null, null, null);
		jobcateVo.setJob_cate_id(1);
		jobcateVo.setJob_cate_code("job_cate_code");
		jobcateVo.setJob_cate_name("job_cate_name");
		return jobcateVo;
	}

	@RequestMapping(value = "/jobCate3", method = RequestMethod.GET)
	public List<JobCateVo> jobCate3() {
		List<JobCateVo> list = new ArrayList<JobCateVo>();

		JobCateVo jobCateVo1 = new JobCateVo(1, "code1", "jobName1");
		JobCateVo jobCateVo2 = new JobCateVo(2, "code2", "jobName2");
		JobCateVo jobCateVo3 = new JobCateVo(3, "code3", "jobName3");
		JobCateVo jobCateVo4 = new JobCateVo(4, "code4", "jobName4");
		list.add(jobCateVo1);
		list.add(jobCateVo2);
		list.add(jobCateVo3);
		list.add(jobCateVo4);

		return list;
	}

	@RequestMapping(value = "/jobCate4", method = RequestMethod.GET)
	@ResponseBody
	public Map<Integer, JobCateVo> jobCate4() {

		Map<Integer, JobCateVo> map = new HashMap<Integer, JobCateVo>();

		for (int i = 0; i < 10; i++) {
			JobCateVo vo = new JobCateVo(i, null, null);
			vo.setJob_cate_id(i);
			vo.setJob_cate_code("code");
			vo.setJob_cate_name("jobName");
			map.put(i, vo);
		}
		return map;

	}
}
