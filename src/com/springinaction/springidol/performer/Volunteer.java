/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.Volunteer
 * @description:TODO
 * @date:2016-4-28 下午5:48:40
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-4-28     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.springidol.performer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.inter.MindReader;
import com.springinaction.springidol.inter.Thinker;

/**
 * @className:com.springinaction.springidol.performer.Volunteer
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-4-28 下午6:48:56
 * @author:WangHao
 */
public class Volunteer implements Thinker
{
	private String thoughts;

	@Override
	public void thinkOfSomething(String thoughts)
	{
		this.thoughts = thoughts;
	}

	public String getThoughts()
	{
		return thoughts;
	}

	public static void main(String args[])
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring.xml");
		Thinker thinker = (Thinker) ctx.getBean("haozi");
		MindReader magician = (MindReader) ctx.getBean("magician");
		
		thinker.thinkOfSomething("I need a doctor");
		System.out.println(magician.getThoughts());
	}
}
