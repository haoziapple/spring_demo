/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.schedule.tasktest.TaskQueueInit
 * @description:TODO
 * @date:2016-6-16 下午2:10:39
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

import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.springinaction.schedule.tasktest.runnable.QueueRunnable;

/**
 * @className:com.springinaction.schedule.tasktest.TaskQueueInit
 * @description:任务初始化
 * @version:v1.0.0
 * @date:2016-6-16 下午2:10:53
 * @author:WangHao
 */
public class TaskQueueInit implements InitializingBean, DisposableBean
{
	@Resource(name = "initExecutor")
	private ThreadPoolTaskExecutor initExecutor;

	@Resource(name = "tptExecutor")
	private ThreadPoolTaskExecutor tptExecutor;

	@Override
	public void destroy() throws Exception
	{
		System.out.println(new Date() + "DisposableBean方法-----------------destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println(new Date() + "InitializingBean方法-----------------afterPropertiesSet()");
	}

	public void queueInit()
	{
		// 使用单线程循环掉起具体的队列任务
		QueueRunnable queueRunnable = new QueueRunnable(tptExecutor);
		initExecutor.execute(queueRunnable);
	}
}
