/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.instrument.Saxophone
 * @description:TODO
 * @date:2016-2-4 下午4:04:14
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
package com.springinaction.springidol.instrument;

import com.springinaction.springidol.inter.Instrument;

public class Saxophone implements Instrument
{
	public Saxophone() {
		
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.inter.Instrument#play()
	 */
	@Override
	public void play()
	{
		System.out.println("TOOT TOOT TOOT");
	}

}
