package com.pf.demo4;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 创建一个ListenerAsyncConfiguration，并且使用@EnableAsync注解开启支持异步处理
 * @author PF
 *
 */
@Configuration
@EnableAsync
public class ListenerAsyncConfiguration implements AsyncConfigurer{

	/**
	 * 获取异步线程池执行对象
	 */
	@Override
	public Executor getAsyncExecutor() {
		//使用spring内置线程池任务对象
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		//设置线程池参数
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}
	
	
}
