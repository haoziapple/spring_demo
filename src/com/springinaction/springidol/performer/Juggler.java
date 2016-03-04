/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.Juggler
 * @description:TODO
 * @date:2016-2-4 下午2:10:47
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

import com.springinaction.springidol.inter.Performer;

public class Juggler implements Performer
{
	private int beanBags = 3;
	
	public Juggler() {
		
	}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Performer#perform()
	 */
	@Override
	public void perform()
	{
		System.out.println("Juggling " + beanBags + " beanbags");
	}
	
	public static void main(String args[])
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring.xml");
		Performer performer = (Performer) ctx.getBean("duke");
		performer.perform();
	}

}
