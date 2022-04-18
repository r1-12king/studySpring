package com.study.spring;

/**
 * @description:
 * @author: luguilin
 * @date: 2022-04-18 15:02
 **/
public class BeanDefinition {
    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    private Class type;
    private String scope;
}
