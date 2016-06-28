/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.beanconfig.BandWithProp
 * @description:TODO
 * @date:2016-6-28 下午2:41:52
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
package com.springinaction.springidol.beanconfig;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.inter.Performer;

/**
 * @className:com.springinaction.springidol.beanconfig.BandWithProp
 * @description:为Bean装配Properties集合
 * @version:v1.0.0
 * @date:2016-6-28 下午2:42:03
 * @author:WangHao
 */
public class BandWithProp implements Performer
{
	private Properties instruments;

	public BandWithProp()
	{

	}

	@Override
	public void perform()
	{
		for (Object key : instruments.keySet())
		{
			System.out.print(key + " : ");
			System.out.println(instruments.get(key));
		}
	}

	public Properties getInstruments()
	{
		return instruments;
	}

	public void setInstruments(Properties instruments)
	{
		this.instruments = instruments;
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/beanconfig/bean-spring.xml");
		Performer performer = (Performer) ctx.getBean("jerry");
		performer.perform();
	}
}
