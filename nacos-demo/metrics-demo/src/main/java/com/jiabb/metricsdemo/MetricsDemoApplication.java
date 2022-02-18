package com.jiabb.metricsdemo;

import com.codahale.metrics.MetricRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MetricsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricsDemoApplication.class, args);
	}


}
