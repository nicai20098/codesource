package com.jiabb.jdk;

import io.netty.util.concurrent.DefaultThreadFactory;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ThreadExecutorTest {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(8, 8, 20, TimeUnit.SECONDS,
				new LinkedBlockingDeque<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
		for (int i = 0; i <20 ; i++) {
			executor.execute(new Runnable() {
				@Override
				public void run() {
					try {
						log.info(Thread.currentThread().getName());
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}


	}
}
