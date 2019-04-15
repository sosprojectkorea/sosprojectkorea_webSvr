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
public class JobCateSubController {

	@RequestMapping(value = "/jobCateSub1", method = RequestMethod.GET)
	public String jobCateSub1(@RequestParam String str) {
		return str + " : Rest Test";
	}

	@RequestMapping(value = "/jobCateSub2", method = RequestMethod.GET)
	public JobCateSubVo jobCateSub2() {

		JobCateSubVo jobcatesubVo = new JobCateSubVo(null, null, null, null);
		jobcatesubVo.setJob_cate_id(1);
		jobcatesubVo.setJob_cate_sub_code("job_cate_sub_code");
		jobcatesubVo.setJob_cate_sub_name("job_cate_sub_name");
		jobcatesubVo.setJob_cate_sub_id(1);
		return jobcatesubVo;
	}

	@RequestMapping(value = "/jobCateSub3", method = RequestMethod.GET)
	public List<JobCateSubVo> jobCateSub3() {
		List<JobCateSubVo> list = new ArrayList<JobCateSubVo>();

		JobCateSubVo jobCateSubVo1 = new JobCateSubVo(1, "subcode1", "jobSubName1", 11);
		JobCateSubVo jobCateSubVo2 = new JobCateSubVo(2, "subcode2", "jobSubName2", 22);
		JobCateSubVo jobCateSubVo3 = new JobCateSubVo(3, "subcode3", "jobSubName3", 33);
		JobCateSubVo jobCateSubVo4 = new JobCateSubVo(4, "subcode4", "jobSubName4", 44);
		list.add(jobCateSubVo1);
		list.add(jobCateSubVo2);
		list.add(jobCateSubVo3);
		list.add(jobCateSubVo4);

		return list;
	}

	@RequestMapping(value = "/jobCateSub4", method = RequestMethod.GET)
	@ResponseBody
	public Map<Integer, JobCateSubVo> jobCateSub4() {

		Map<Integer, JobCateSubVo> map = new HashMap<Integer, JobCateSubVo>();

		for (int i = 0; i < 10; i++) {
			JobCateSubVo vo = new JobCateSubVo(i, null, null, i+i);
			vo.setJob_cate_sub_id(i);
			vo.setJob_cate_sub_code("subcode");
			vo.setJob_cate_sub_name("jobSubName");
			vo.setJob_cate_id(i+i);
			map.put(i, vo);
		}
		return map;

	}
}
