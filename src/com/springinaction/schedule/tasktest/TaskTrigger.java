/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.tasktest.TaskTrigger
 * @description:TODO
 * @date:2016-6-16 下午1:29:30
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-6-16     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.schedule.tasktest;

import java.util.Date;

/**
 * @className:com.springinaction.schedule.tasktest.TaskTrigger
 * @description:定时激活任务
 * @version:v1.0.0
 * @date:2016-6-16 下午1:29:42
 * @author:WangHao
 */
public class TaskTrigger implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(new Date() + "-----------------A TaskTrigger has run");
	}

}
