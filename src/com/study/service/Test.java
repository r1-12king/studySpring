package com.study.service;

import com.study.spring.StudySpringApplicationContext;

/**
 * @description:
 * @author: luguilin
 * @date: 2022-04-18 14:29
 **/
public class Test {
    public static void main(String[] args) {
        StudySpringApplicationContext applicationContext = new StudySpringApplicationContext(AppConfig.class);

//        UserService userService = (UserService)applicationContext.getBean("userService");
        UserInterfaces userService = (UserInterfaces)applicationContext.getBean("userService");
        userService.test();

    }

}
