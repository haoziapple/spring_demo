/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.Sonnet29
 * @description:TODO
 * @date:2016-2-4 下午2:48:21
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

import com.springinaction.springidol.inter.Poem;

public class Sonnet29 implements Poem
{
	private static String[] LINES = {
		"When in disgrace with fortune and men's eyes,",
		"I all alone beweep my outcast state",
		"And trouble deaf heaven with my bootless cries",
		"Wishing me like to one more rich in hope."
	};
	
	public Sonnet29() {
		
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.inter.Poem#recite()
	 */
	@Override
	public void recite()
	{
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}

}
