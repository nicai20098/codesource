package com.jiabb.metricsdemo.Controller;

import com.codahale.metrics.Meter;
import com.codahale.metrics.Metric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {

	@Resource
	private Meter meter;

	@RequestMapping("/metric/meter")
	@ResponseBody
	public String requestTest(){
		meter.mark();
		return "meter";
	}


}
