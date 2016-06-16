/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.MyFirstSpringJob
 * @description:TODO
 * @date:2016-4-29 下午5:38:02
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-4-29     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.schedule;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @className:com.springinaction.schedule.MyFirstSpringJob
 * @description:使用spring自带的定时任务
 * @version:v1.0.0
 * @date:2016-5-4 上午9:32:59
 * @author:WangHao
 */
@Component
public class MyFirstSpringJob
{
	/**
	 * 注意！！！
	 * 
	 * @Description:注解配置会被spring-xml配置文件覆盖掉
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-6-16 下午12:14:17
	 */
	// 秒为1时触发
	@Scheduled(cron = "1 * * * * ?")
	public void run()
	{
		System.out.println(new Date() + "My scheduled job is running");
	}

	// 固定每十秒触发一次
	@Scheduled(fixedRate = 10 * 1000)
	public void doJob1()
	{
		System.out.println(new Date() + "-----------------doJob1");
	}

	// 上次任务结束后十秒后再次执行
	@Scheduled(fixedDelay = 10 * 1000)
	public void doJob2()
	{
		System.out.println(new Date() + "-----------------doJob2");
	}

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/schedule/spring-schedule.xml");

		MyFirstSpringJob job = (MyFirstSpringJob) ctx.getBean("myFirstSpringJob");

		// 显式调用run方法
		job.run();
	}
}
