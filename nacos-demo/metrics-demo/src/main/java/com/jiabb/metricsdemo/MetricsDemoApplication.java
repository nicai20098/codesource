package com.jiabb.metricsdemo;

import com.codahale.metrics.ConsoleReporter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class MetricsDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MetricsDemoApplication.class, args);
		// 启动Reporter
		ConsoleReporter reporter = ctx.getBean(ConsoleReporter.class);
		reporter.start(1, TimeUnit.MINUTES);
	}


}
