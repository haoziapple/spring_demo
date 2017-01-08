/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.Instrumentalist
 * @description:TODO
 * @date:2016-2-4 下午3:49:27
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-2-4     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.springidol.performer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.inter.Instrument;
import com.springinaction.springidol.inter.Performer;

/**
 * @className:com.springinaction.springidol.performer.Instrumentalist
 * @description:测试Spring bean的装配
 * @version:v1.0.0
 * @date:2016-4-29 上午10:33:00
 * @author:WangHao
 */
public class Instrumentalist implements Performer
{
	public Instrumentalist()
	{

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.springinaction.springidol.inter.Performer#perform()
	 */
	@Override
	public void perform()
	{
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}

	private String song;

	public String screamSong()
	{
		return song;
	}

	/**
	 * @Autowired 使用自动装配注解时不需要get set方法
	 * @Qualifier 
	 */
	@Autowired
	@Qualifier("saxophone")
	private Instrument instrument;

	public String getSong()
	{
		return song;
	}

	public void setSong(String song)
	{
		this.song = song;
	}

	public static void main(String args[])
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/beanconfig/bean-spring.xml");
		Performer performer = (Performer) ctx.getBean("carl");
		performer.perform();

		// 通过切面引入新功能
		// Contestant contestant = (Contestant) performer;
		// contestant.receiverAward();
	}
}
