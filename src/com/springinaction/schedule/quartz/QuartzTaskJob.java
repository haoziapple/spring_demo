/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.quartz.QuartzTaskJob
 * @description:TODO
 * @date:2016-6-21 下午1:28:26
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-6-21     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.schedule.quartz;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className:com.springinaction.schedule.quartz.QuartzTaskJob
 * @description:使用Quartz执行的定时任务
 * @version:v1.0.0
 * @date:2016-6-21 下午1:28:29
 * @author:WangHao
 */
public class QuartzTaskJob
{
	public void run()
	{
		System.out.println(new Date() + "My scheduled job is running");
	}

	// 固定每十秒触发一次
	public void doJob1()
	{
		System.out.println(new Date() + "-----------------doJob1");
	}

	// 上次任务结束后十秒后再次执行
	public void doJob2()
	{
		System.out.println(new Date() + "-----------------doJob2");
	}

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/schedule/quartz/spring-quartz.xml");

		QuartzTaskJob job = (QuartzTaskJob) ctx.getBean("taskJob");

		// 显式调用run方法
		job.run();
	}
}
