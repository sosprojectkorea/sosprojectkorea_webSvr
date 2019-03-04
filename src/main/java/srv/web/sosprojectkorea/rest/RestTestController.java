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
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestTestController {

	@RequestMapping(value = "/restTest", method = RequestMethod.GET)
	public String restTest(@RequestParam String str) {
		return str + " : Rest Test";
	}

	@RequestMapping(value = "/restTest2", method = RequestMethod.GET)
	public SampleVo restTest2() {

		SampleVo sampleVo = new SampleVo();
		sampleVo.setDept("dept");
		sampleVo.setFirstName("first");
		sampleVo.setLastName("last");
		sampleVo.setMno(50);
		return sampleVo;
	}

	@RequestMapping(value = "/restTest3", method = RequestMethod.GET)
	public List<SampleVo> restTest3() {
		List<SampleVo> list = new ArrayList<SampleVo>();

		SampleVo sampleVo1 = new SampleVo(21, "abcc", "abc", "abc");
		SampleVo sampleVo2 = new SampleVo(22, "abcd", "abc", "abc");
		SampleVo sampleVo3 = new SampleVo(23, "abce", "abc", "abc");
		SampleVo sampleVo4 = new SampleVo(24, "abcf", "abc", "abc");
		list.add(sampleVo1);
		list.add(sampleVo2);
		list.add(sampleVo3);
		list.add(sampleVo4);

		return list;
	}

	@RequestMapping(value = "/restTest4", method = RequestMethod.GET)
	@ResponseBody
	public Map<Integer, SampleVo> restTest4() {

		Map<Integer, SampleVo> map = new HashMap<Integer, SampleVo>();

		for (int i = 0; i < 10; i++) {
			SampleVo vo = new SampleVo();
			vo.setMno(i);
			vo.setFirstName("first" + i);
			vo.setLastName("last");
			map.put(i, vo);
		}

		return map;

	}
}
