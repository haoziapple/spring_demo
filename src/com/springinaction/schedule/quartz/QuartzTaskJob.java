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
	
	public void run2()
	{
		System.out.println(new Date() + "My scheduled job2 is running");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/schedule/quartz/spring-quartz.xml");

		QuartzTaskJob job = (QuartzTaskJob) ctx.getBean("taskJob");
	}
}
