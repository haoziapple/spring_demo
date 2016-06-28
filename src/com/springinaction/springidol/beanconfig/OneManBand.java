/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.beanconfig.OneManBand
 * @description:TODO
 * @date:2016-6-28 下午2:22:44
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

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.inter.Instrument;
import com.springinaction.springidol.inter.Performer;

/**
 * @className:com.springinaction.springidol.beanconfig.OneManBand
 * @description:为Bean装配Map集合
 * @version:v1.0.0
 * @date:2016-6-28 下午2:22:47
 * @author:WangHao
 */
public class OneManBand implements Performer
{
	public OneManBand()
	{

	}

	@Override
	public void perform()
	{
		for (String key : instruments.keySet())
		{
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	private Map<String, Instrument> instruments;

	public Map<String, Instrument> getInstruments()
	{
		return instruments;
	}

	/**
	 * 以Map类型注入instrument
	 */
	public void setInstruments(Map<String, Instrument> instruments)
	{
		this.instruments = instruments;
	}

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/beanconfig/bean-spring.xml");
		Performer performer = (Performer) ctx.getBean("jason");
		performer.perform();
	}

}
