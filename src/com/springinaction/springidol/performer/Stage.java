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
public class Stage
{
	private Stage() {
		
	}
	
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}

}
