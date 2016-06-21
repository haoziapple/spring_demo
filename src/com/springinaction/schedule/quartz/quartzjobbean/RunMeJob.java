/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.quartz.quartzjobbean.RunMeJob
 * @description:TODO
 * @date:2016-6-21 下午2:22:47
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

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @className:com.springinaction.schedule.quartz.quartzjobbean.RunMeJob
 * @description:使用继承QuartzJobBean的方式声明Quartz的job
 * @version:v1.0.0
 * @date:2016-6-21 下午2:23:26
 * @author:WangHao
 */
public class RunMeJob extends QuartzJobBean
{
	private RunMeTask runMeTask;

	public void setRunMeTask(RunMeTask runMeTask)
	{
		this.runMeTask = runMeTask;
	}

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException
	{
		runMeTask.printMe();
	}

}
