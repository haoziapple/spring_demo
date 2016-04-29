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

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyFirstSpringJob
{
	@Scheduled(cron="1 * * * * ?")
	public void run()
	{
		System.out.println("My scheduled job is running");
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/schedule/spring-schedule.xml");
		
		MyFirstSpringJob job = (MyFirstSpringJob) ctx.getBean("myFirstSpringJob");
		
		job.run();
	}
}
