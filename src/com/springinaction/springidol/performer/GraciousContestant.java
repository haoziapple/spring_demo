/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.GraciousContestant
 * @description:TODO
 * @date:2016-4-28 下午7:59:47
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

import com.springinaction.springidol.inter.Contestant;

/**
 * @className:com.springinaction.springidol.performer.GraciousContestant
 * @description:TODO
 * @version:v1.0.0 
 * @date:2016-4-28 下午8:00:59
 * @author:WangHao
 */
public class GraciousContestant implements Contestant
{
	@Override
	public void receiverAward()
	{
		System.out.println("contestant received the award");
	}

}
