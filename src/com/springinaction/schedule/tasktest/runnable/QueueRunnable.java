/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.tasktest.runnable.QueueRunnable
 * @description:TODO
 * @date:2016-6-16 下午2:23:50
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

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @className:com.springinaction.schedule.tasktest.runnable.QueueRunnable
 * @description:运行具体的执行任务
 * @version:v1.0.0
 * @date:2016-6-16 下午2:23:54
 * @author:WangHao
 */
public class QueueRunnable implements Runnable
{
	private ThreadPoolTaskExecutor tptExecutor;

	public QueueRunnable(ThreadPoolTaskExecutor tptExecutor)
	{
		this.tptExecutor = tptExecutor;
	}

	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				// 每秒执行一次
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(new Date() + "------------------QueueRunnable is running");

			// 设置执行任务等待时间 10s
			long waitTime = 10000;
			TaskRunnable taskRunnable = new TaskRunnable(waitTime);
			tptExecutor.execute(taskRunnable);
		}
	}
}
