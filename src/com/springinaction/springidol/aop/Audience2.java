/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.aop.Audience2
 * @description:TODO
 * @date:2016-6-28 上午10:33:12
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

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @className:com.springinaction.springidol.aop.Audience2
 * @description:使用XML配置的方式进行AOP编程
 * @version:v1.0.0
 * @date:2016-6-28 上午10:34:22
 * @author:WangHao
 */
public class Audience2
{
	// 表演之前
	public void takeSeats()
	{
		System.out.println("The audience2 is taking their seats.");
	}

	public void turnOffCellPhones()
	{
		System.out.println("The audience2 is turning off their cellphones");
	}

	// 表演之后
	public void applaud()
	{
		System.out.println("The audience2: CLAP CLAP CLAP CLAP CLAP");
	}

	// 表演失败之后
	public void demandRefund()
	{
		System.out.println("The audience2: Boo! We want our money back!");
	}

	// 环绕通知的方式，可以获取Performer的表演时间
	public void watchPerformance(ProceedingJoinPoint joinpoint)
	{
		try
		{
			// 表演之前
			System.out.println("环绕通知 The audience2 is taking their seats.");
			System.out.println("环绕通知 The audience2 is turning off their cellphones");
			long start = System.currentTimeMillis();

			// 执行被通知的方法
			joinpoint.proceed();

			// 表演之后
			long end = System.currentTimeMillis();
			System.out.println("环绕通知 The audience2 CLAP CLAP CLAP CLAP CLAP");
			System.out.println("环绕通知 The audience2 The performance took " + (end - start) + " millseconds.");
		} catch (Throwable t)
		{
			System.out.println("环绕通知 The audience2 Boo! We want our money back!");
		}
	}
}
