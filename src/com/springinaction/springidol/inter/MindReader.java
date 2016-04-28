/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.inter.MindReader
 * @description:TODO
 * @date:2016-4-28 下午5:39:57
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
package com.springinaction.springidol.inter;

public interface MindReader
{
	void interceptThoughts(String thoughts);

	String getThoughts();
}
