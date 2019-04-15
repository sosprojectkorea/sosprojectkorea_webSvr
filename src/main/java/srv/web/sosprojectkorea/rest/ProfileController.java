package srv.web.sosprojectkorea.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@RequestMapping(value = "/profile1", method = RequestMethod.GET)
	public String profile1(@RequestParam String str) {
		return str + " : Rest Test";
	}

	@RequestMapping(value = "/profile2", method = RequestMethod.GET)
	public ProfileVo profile2() {
/*
 * 	private Integer profile_id;
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
 */
		ProfileVo profileVo = new ProfileVo(null, null, null, null
				, null, null, null, null, null, null, null, null, null, null, null, null);
		profileVo.setProfile_id(1);
		profileVo.setUser_id("user_id");
		profileVo.setJob_cate_id(1);
		profileVo.setJob_cate_sub_id(1);
		profileVo.setCareer(1);
		profileVo.setLocation1("location1");
		profileVo.setStart_time1(new Date());
		profileVo.setEnd_time1(new Date());
		profileVo.setLocation2("location2");
		profileVo.setStart_time2(new Date());
		profileVo.setEnd_time2(new Date());
		profileVo.setLocation3("location3");
		profileVo.setStart_time3(new Date());
		profileVo.setEnd_time3(new Date());
		profileVo.setSimple_introduce("simple_introduce");
		profileVo.setDetail_introduce("detail_introduce");
		return profileVo;
	}

	@RequestMapping(value = "/profile3", method = RequestMethod.GET)
	public List<ProfileVo> profile3() {
		List<ProfileVo> list = new ArrayList<ProfileVo>();

		ProfileVo profileVo1 = new ProfileVo(1, "user_id1", 1, 1, 1, "location1", new Date(), new Date(),
				"location2", new Date(), new Date(), "location3", new Date(), new Date(), "simple_introduce", "detail_introduce");
		ProfileVo profileVo2 = new ProfileVo(2, "user_id2", 2, 2, 2, "location1_2", new Date(), new Date(),
				"location2_2", new Date(), new Date(), "location3_2", new Date(), new Date(), "simple_introduce2", "detail_introduce2");
		list.add(profileVo1);
		list.add(profileVo2);

		return list;
	}

	@RequestMapping(value = "/profile4", method = RequestMethod.GET)
	@ResponseBody
	public Map<Integer, ProfileVo> profile4() {

		Map<Integer, ProfileVo> map = new HashMap<Integer, ProfileVo>();

		for (int i = 0; i < 10; i++) {
			ProfileVo vo = new ProfileVo(i, null, null, null
					, null, null, null, null, null, null, null, null, null, null, null, null);
			vo.setProfile_id(1);
			vo.setUser_id("user_id");
			vo.setJob_cate_id(1);
			vo.setJob_cate_sub_id(1);
			vo.setCareer(1);
			vo.setLocation1("location1");
			vo.setStart_time1(new Date());
			vo.setEnd_time1(new Date());
			vo.setLocation2("location2");
			vo.setStart_time2(new Date());
			vo.setEnd_time2(new Date());
			vo.setLocation3("location3");
			vo.setStart_time3(new Date());
			vo.setEnd_time3(new Date());
			vo.setSimple_introduce("simple_introduce");
			vo.setDetail_introduce("detail_introduce");
			map.put(i, vo);
		}
		return map;

	}
}
