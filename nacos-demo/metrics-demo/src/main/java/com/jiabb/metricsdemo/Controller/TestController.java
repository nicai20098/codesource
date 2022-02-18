package com.jiabb.metricsdemo.Controller;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Timer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Slf4j
@Controller
@ResponseBody
@RequestMapping("/metric")
public class TestController {

	@Resource
	private Meter meter;
	@Resource
	private Histogram histogram;
	@Resource
	private Counter counter;
	@Resource
	private Timer timer;

	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld() {

		meter.mark();

		counter.inc();

		histogram.update(new Random().nextInt(10));

		final Timer.Context context = timer.time();
		try {
			return "Hello World";
		} finally {
			context.stop();
		}
	}


}
