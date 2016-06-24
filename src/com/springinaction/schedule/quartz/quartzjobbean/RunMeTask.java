/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.quartz.quartzjobbean.RunMeTask
 * @description:TODO
 * @date:2016-6-21 下午2:25:15
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-6-21     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.schedule.quartz.quartzjobbean;

import java.util.Date;

/**
 * @className:com.springinaction.schedule.quartz.quartzjobbean.RunMeTask
 * @description:一个需要执行的定时任务
 * @version:v1.0.0
 * @date:2016-6-21 下午2:25:33
 * @author:WangHao
 */
public class RunMeTask
{
	public void printMe()
	{
		System.out.println(new Date() + "My scheduled job is running");
	}
}
