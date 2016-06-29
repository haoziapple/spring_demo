/**
 * Copyright (C) 2016 FuZhong
 *
 *
 * @className:com.springinaction.springidol.beanconfig.myqualifier.StringedInstrument
 * @description:TODO
 * @date:2016-6-29 下午1:31:01
 * @version:v1.0.0 
 * @author:WangHao
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2016-6-29     WangHao       v1.0.0        create
 *
 *
 */
package com.springinaction.springidol.beanconfig.myqualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @className:com.springinaction.springidol.beanconfig.myqualifier.StringedInstrument
 * @description:创建自定义的限电器(Qualifier) 使用Qualifier注解作为它的元注解
 * @version:v1.0.0
 * @date:2016-6-29 下午1:31:17
 * @author:WangHao
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface StringedInstrument
{

}
