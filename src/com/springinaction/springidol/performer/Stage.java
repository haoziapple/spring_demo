/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.Stage
 * @description:TODO
 * @date:2016-2-4 下午3:15:24
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

/**
 * @className:com.springinaction.springidol.performer.Stage
 * @description:Stage单例类
 * @version:v1.0.0
 * @date:2016-6-28 下午1:45:24
 * @author:WangHao
 */
public class Stage
{
	private Stage()
	{

	}

	/**
	 * @className:com.springinaction.springidol.performer.StageSingletonHolder
	 * @description:延迟加载实例
	 * @version:v1.0.0
	 * @date:2016-6-28 下午1:46:43
	 * @author:WangHao
	 */
	private static class StageSingletonHolder
	{
		static Stage instance = new Stage();
	}

	/**
	 * @Description:返回实例
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2016-6-28 下午1:47:06
	 */
	public static Stage getInstance()
	{
		return StageSingletonHolder.instance;
	}

}
