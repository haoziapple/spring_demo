/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.knights.Minstrel
 * @description:TODO
 * @date:2016-4-28 下午2:10:38
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
package com.springinaction.knights;
/**
 * @className:com.springinaction.knights.Minstrel
 * @description:AOP应用DEMO
 * @version:v1.0.0 
 * @date:2016-4-28 下午2:10:51
 * @author:WangHao
 */
public class Minstrel
{
	public void singBeforeQuest()
	{
		System.out.println("Fa la la; The knight is so brave!");
	}
	
	public void singAfterQuest()
	{
		System.out.println("Tee hee he; The brave knight did embark on a quest!");
	}
}
