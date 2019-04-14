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
public class UserInfoController {

	@RequestMapping(value = "/userInfo1", method = RequestMethod.GET)
	public String userInfo1(@RequestParam String str) {
		return str + " : Rest Test";
	}

	@RequestMapping(value = "/userInfo2", method = RequestMethod.GET)
	public UserInfoVo userInfo2() {

		UserInfoVo sampleVo = new UserInfoVo(null, null, null, null);
		sampleVo.setUser_id("user_id");
		sampleVo.setPassword("password");
		sampleVo.setEmail("email");
		sampleVo.setId(1);
		return sampleVo;
	}

	@RequestMapping(value = "/userInfo3", method = RequestMethod.GET)
	public List<UserInfoVo> userInfo3() {
		List<UserInfoVo> list = new ArrayList<UserInfoVo>();

		UserInfoVo userInfoVo1 = new UserInfoVo(1, "test1", "test", "test1@hanmail.net");
		UserInfoVo userInfoVo2 = new UserInfoVo(2, "test2", "test", "test2@hanmail.net");
		UserInfoVo userInfoVo3 = new UserInfoVo(3, "test3", "test", "test3@hanmail.net");
		UserInfoVo userInfoVo4 = new UserInfoVo(4, "test4", "test", "test4@hanmail.net");
		list.add(userInfoVo1);
		list.add(userInfoVo2);
		list.add(userInfoVo3);
		list.add(userInfoVo4);

		return list;
	}

	@RequestMapping(value = "/userInfo4", method = RequestMethod.GET)
	@ResponseBody
	public Map<Integer, UserInfoVo> userInfo4() {

		Map<Integer, UserInfoVo> map = new HashMap<Integer, UserInfoVo>();

		for (int i = 0; i < 10; i++) {
			UserInfoVo vo = new UserInfoVo(i, null, null, null);
			vo.setId(i);
			vo.setUser_id("test1");
			vo.setPassword("test");
			vo.setEmail("test1@hanmail.net");
			map.put(i, vo);
		}
		return map;

	}
}
