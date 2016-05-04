/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.exercise.InitNDestroyTest
 * @description:TODO
 * @date:2016-5-4 上午10:48:26
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-5-4     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.exercise;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className:com.springinaction.exercise.InitNDestroyTest
 * @description:测试spring中bean的init和destroy方法
 * @version:v1.0.0 
 * @date:2016-5-4 上午10:52:19
 * @author:WangHao
 */
public class InitNDestroyTest
{
	private String message;

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void init()
	{
		System.out.println("init");
	}

	// how validate the destory method is a question
	public void cleanUp()
	{
		System.out.println("cleanUp");
	}

	// 测试代码
	public  static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springinaction/exercise/spring-exercise.xml");

		context.registerShutdownHook();
		InitNDestroyTest person = (InitNDestroyTest) context.getBean("initNDestroyTest");

		person.setMessage("hello  spring");

		InitNDestroyTest person_new = (InitNDestroyTest) context.getBean("initNDestroyTest");

		System.out.println(person.getMessage());
		System.out.println(person_new.getMessage());
		
	}
}
