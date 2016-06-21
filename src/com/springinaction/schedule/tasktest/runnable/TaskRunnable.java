/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.tasktest.runnable.TaskRunnable
 * @description:TODO
 * @date:2016-6-16 下午2:34:54
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
package com.springinaction.schedule.tasktest.runnable;

import java.util.Date;

/**
 * @className:com.springinaction.schedule.tasktest.runnable.TaskRunnable
 * @description:实际执行任务线程
 * @version:v1.0.0
 * @date:2016-6-17 上午10:08:41
 * @author:WangHao
 */
public class TaskRunnable implements Runnable
{
	// 执行任务等待时间
	private long waitTime;

	public TaskRunnable(long waitTime)
	{
		this.waitTime = waitTime;
	}

	@Override
	public void run()
	{
		synchronized (this)
		{
			try
			{
				this.wait(waitTime);
			} catch (InterruptedException e)
			{
			}

			System.out.println(new Date() + "实际执行任务线程----------------TaskRunnable id: "
					+ Thread.currentThread().getId() + " has run");
		}
	}
}
