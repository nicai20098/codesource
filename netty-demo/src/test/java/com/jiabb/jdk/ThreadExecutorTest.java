package com.jiabb.jdk;

import io.netty.util.concurrent.DefaultThreadFactory;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class ThreadExecutorTest {

	//AbortPolicy 抛出异常程序不会停止
	//CallerRunsPolicy 任务回全部计算完成，由主线程来执行该任务
	//DiscardPolicy  丢弃后来的任务
	//DiscardOldestPolicy  丢弃最早的任务
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(0);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(8, 20, 20, TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
		for (int i = 0; i <200 ; i++) {
			executor.execute(new Runnable() {
				@Override
				public void run() {
					try {
						log.info(Thread.currentThread().getName() +  "__" +atomicInteger.incrementAndGet());
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		System.out.println(Thread.currentThread().getName() + "end");
		System.out.println(executor.getLargestPoolSize());
		executor.shutdown();

	}
}
