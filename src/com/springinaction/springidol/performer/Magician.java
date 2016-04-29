/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.Magician
 * @description:TODO
 * @date:2016-4-28 下午5:41:24
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

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.springinaction.springidol.inter.MindReader;

/**
 * @className:com.springinaction.springidol.performer.Magician
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-4-28 下午6:19:15
 * @author:WangHao
 */
@Aspect
public class Magician implements MindReader
{
	private String thoughts;
	
	//声明参数化的切点
	@Pointcut("execution(* com.springinaction.springidol.inter.Thinker."
			+ "thinkOfSomething(String)) && args(thoughts)")
	public void thinking(String thoughts)
	{

	}

	//把参数传递给通知
	@Before("thinking(thoughts)")
	@Override
	public void interceptThoughts(String thoughts)
	{
		System.out.println("Intercepting volunteer's thoughts");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts()
	{
		return thoughts;
	}

}
