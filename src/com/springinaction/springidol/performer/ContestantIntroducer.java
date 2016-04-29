/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.performer.ContestantIntroducer
 * @description:TODO
 * @date:2016-4-29 上午11:14:57
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-4-29     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.springidol.performer;

import org.aspectj.lang.annotation.DeclareParents;

import com.springinaction.springidol.inter.Contestant;

/**
 * @className:com.springinaction.springidol.performer.ContestantIntroducer
 * @description:使用@AspectJ注解引入Contestant接口
 * @version:v1.0.0
 * @date:2016-4-29 上午11:15:04
 * @author:WangHao
 */
public class ContestantIntroducer
{
	@DeclareParents(value = "com.springinaction.springidol.inter.Performer+", defaultImpl = GraciousContestant.class)
	public static Contestant contestant;
}
