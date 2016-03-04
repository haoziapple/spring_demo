/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.PoeticJuggler
 * @description:TODO
 * @date:2016-2-4 下午2:54:05
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

import com.springinaction.springidol.inter.Poem;

public class PoeticJuggler extends Juggler
{
	private Poem poem;
	
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
	
	public static void main(String args[])
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring.xml");
		PoeticJuggler performer = (PoeticJuggler) ctx.getBean("poeticDuke");
		performer.perform();
	}

}
