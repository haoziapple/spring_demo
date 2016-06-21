/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.quartz.simpletrigger.TestLoader
 * @description:TODO
 * @date:2016-6-21 下午2:44:24
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
package com.springinaction.schedule.quartz.simpletrigger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className:com.springinaction.schedule.quartz.simpletrigger.TestLoader
 * @description:加载上下文测试类
 * @version:v1.0.0
 * @date:2016-6-21 下午2:44:27
 * @author:WangHao
 */
public class TestLoader
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/schedule/quartz/simpletrigger/quartz-test.xml");
	}
}
