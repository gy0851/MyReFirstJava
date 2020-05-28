package com.ggyy0851.doshomethingbyat;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author GeYao
 * @create 2020-05-28 - 14:32
 */
//该注解用于将类注册为bean，value参数类似beanid，默认为该类的首字母小写的全程
@Component(value = "GoClass")
public class GoClass {
    public void HaveALesson(){
        System.out.println("注解的上课");
    }
    public void HaveALesson(String name1){
        System.out.println("注解的上课,课程名：" + name1);
    }
}
