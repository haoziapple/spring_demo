/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.aop.AOPTest
 * @description:TODO
 * @date:2016-6-28 上午10:41:34
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-6-28     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.springidol.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.inter.Performer;

/**
 * @className:com.springinaction.springidol.aop.AOPTest
 * @description:对AOP编程进行测试
 * @version:v1.0.0
 * @date:2016-6-28 上午10:41:40
 * @author:WangHao
 */
public class AOPTest
{
	public static void main(String args[])
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/aop/aop-spring.xml");
		Performer performer = (Performer) ctx.getBean("duke");
		performer.perform();
	}
}
