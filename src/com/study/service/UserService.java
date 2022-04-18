package com.study.service;

import com.study.spring.Autowired;
import com.study.spring.BeanNameAware;
import com.study.spring.Component;
import com.study.spring.InitializingBean;
import com.study.spring.Scope;

/**
 * @description:
 * @author: luguilin
 * @date: 2022-04-18 14:29
 **/
@Component("userService")
public class UserService implements UserInterfaces{

    @Autowired
    private OrderService orderService;

    private String beanName;


    @Override
    public void test(){
        System.out.println(orderService);
    }

//    @Override
//    public void setBeanName(String beanName) {
//        this.beanName = beanName;
//    }
//
//    @Override
//    public void afterPropertiesSet() {
//        // .....
//        System.out.println("初始化");
//    }
}
