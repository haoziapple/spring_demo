/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.tasktest.TaskTest
 * @description:TODO
 * @date:2016-6-16 下午1:37:31
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-6-16     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.schedule.tasktest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className:com.springinaction.schedule.tasktest.TaskTest
 * @description:定时任务测试类
 * @version:v1.0.0
 * @date:2016-6-16 下午1:38:46
 * @author:WangHao
 */
public class TaskTest
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		// 加载spring配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/schedule/tasktest/spring-tasktest.xml");
	}
}
