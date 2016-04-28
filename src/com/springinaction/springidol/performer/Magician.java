/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.Magician
 * @description:TODO
 * @date:2016-4-28 下午5:41:24
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
package com.springinaction.springidol.performer;

import com.springinaction.springidol.inter.MindReader;

/**
 * @className:com.springinaction.springidol.performer.Magician
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-4-28 下午6:19:15
 * @author:WangHao
 */
public class Magician implements MindReader
{
	private String thoughts;

	@Override
	public void interceptThoughts(String thoughts)
	{
		System.out.println("Intercepting volunteer's thoughts");
		this.thoughts=thoughts;
	}

	@Override
	public String getThoughts()
	{
		return thoughts;
	}

}
