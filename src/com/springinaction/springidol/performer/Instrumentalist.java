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

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.inter.Instrument;
import com.springinaction.springidol.inter.Performer;

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

	private Instrument instrument;

	public String getSong()
	{
		return song;
	}

	public void setSong(String song)
	{
		this.song = song;
	}

	public Instrument getInstrument()
	{
		return instrument;
	}

	public void setInstrument(Instrument instrument)
	{
		this.instrument = instrument;
	}

	public static void main(String args[])
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring.xml");
		Performer performer = (Performer) ctx.getBean("kenny");
		performer.perform();
	}
}
