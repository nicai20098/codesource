package com.jiabb.metricsdemo.configure;

import com.codahale.metrics.*;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

//https://www.jianshu.com/p/e4f70ddbc287
@Configuration
public class MetricConfigure {

    //注册监控工具
    @Bean
    public MetricRegistry metricRegistry() {
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

    /**
     * 直方图数据
     */
    @Bean
    public Histogram requestHistogram(MetricRegistry metricRegistry) {
        return metricRegistry.histogram("request-size");
    }


    /**
     * counter 计数器
     */
    @Bean
    public Counter requestCounter(MetricRegistry metricRegistry) {
		return metricRegistry.counter("requestCounter");
    }

    /**
     * 记时器
     */
    @Bean
    public Timer requestTimer(MetricRegistry metricRegistry) {
        return metricRegistry.timer("executeTimer");
    }

    /**
     * Reporter 数据的展现位置
     *
     * @param metrics
     * @return
     */
    @Bean
    public ConsoleReporter consoleReporter(MetricRegistry metrics) {
        return ConsoleReporter.forRegistry(metrics)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build();
    }

    @Bean
    public Slf4jReporter slf4jReporter(MetricRegistry metrics) {
        return Slf4jReporter.forRegistry(metrics)
                .outputTo(LoggerFactory.getLogger("com.jiabb"))
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build();
    }



}
