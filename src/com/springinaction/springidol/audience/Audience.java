/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.audience.Audience
 * @description:TODO
 * @date:2016-4-28 下午4:11:53
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
package com.springinaction.springidol.audience;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @className:com.springinaction.springidol.audience.Audience
 * @description:TODO
 * @version:v1.0.0
 * @date:2016-4-28 下午4:25:18
 * @author:WangHao
 */
@Aspect
public class Audience
{
	// 定义切点
	@Pointcut("execution(* com.springinaction.springidol.inter.Performer.perform(..))")
	public void performance()
	{

	}

	@Before("performance()")
	// 表演之前
	public void takeSeats()
	{
		System.out.println("The audience is taking their seats.");
	}

	@Before("performance()")
	public void turnOffCellPhones()
	{
		System.out.println("The audience is turning off their cellphones");
	}

	@AfterReturning("performance()")
	// 表演之后
	public void applaud()
	{
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	@AfterThrowing("performance()")
	// 表演失败之后
	public void demandRefund()
	{
		System.out.println("Boo! We want our money back!");
	}

	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinpoint)
	{
		try
		{
			// 表演之前
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones");
			long start = System.currentTimeMillis();

			// 执行被通知的方法
			joinpoint.proceed();

			// 表演之后
			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP CLAP");
			System.out.println("The performance took " + (end - start) + " millseconds.");
		} catch (Throwable t)
		{
			System.out.println("Boo! We want our money back!");
		}
	}

}
