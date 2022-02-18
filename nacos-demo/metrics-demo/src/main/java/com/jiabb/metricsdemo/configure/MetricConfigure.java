package com.jiabb.metricsdemo.configure;

import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//https://www.jianshu.com/p/effe8e259d25
@Configuration
public class MetricConfigure {

	//注册监控工具
	@Bean
	public MetricRegistry metricRegistry(){
		return new MetricRegistry();
	}

	/**
	 * Meter TPS、QPS等计算器
	 * 请求的Meter
	 */
	@Bean
	public Meter requestMeter(MetricRegistry metricRegistry) {
		return metricRegistry.meter("request");
	}


}
