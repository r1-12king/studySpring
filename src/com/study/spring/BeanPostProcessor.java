package com.study.spring;

/**
 * @description:
 * @author: luguilin
 * @date: 2022-04-18 16:39
 **/
public interface BeanPostProcessor {

    public Object postProcessBeforeInitialization(String beanName, Object bean);

    public Object postProcessAfterInitialization(String beanName, Object bean);
}
