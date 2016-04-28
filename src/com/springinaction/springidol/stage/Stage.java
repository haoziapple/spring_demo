/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.stage.Stage
 * @description:TODO
 * @date:2016-4-28 下午2:22:21
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
package com.springinaction.springidol.stage;

/**
 * @className:com.springinaction.springidol.stage.Stage
 * @description:通过工厂方法创建bean
 * @version:v1.0.0
 * @date:2016-4-28 下午2:22:26
 * @author:WangHao
 */
public class Stage
{
	private Stage()
	{

	}

	private static class StageSingletonHolder
	{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance()
	{
		return StageSingletonHolder.instance;
	}
}
