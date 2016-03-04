/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.OneManBand
 * @description:TODO
 * @date:2016-2-4 下午5:07:02
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

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.inter.Instrument;
import com.springinaction.springidol.inter.Performer;

public class OneManBand implements Performer
{
	public OneManBand() {
		
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.inter.Performer#perform()
	 */
	@Override
	public void perform()
	{
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}
	
	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments)
	{
		this.instruments = instruments;
	}
	
	public static void main(String args[])
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring.xml");
		Performer performer = (Performer) ctx.getBean("hank");
		performer.perform();
	}

}
