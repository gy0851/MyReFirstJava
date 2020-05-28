package com.ggyy0851.doshomethingbyat;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.BeforeAdvice;
import org.springframework.stereotype.Component;

/**
 * @author GeYao
 * @create 2020-05-28 - 14:57
 */
@Component(value = "before_advice")
@Aspect
public class Prepare {

    @Pointcut("execution(* com.ggyy0851.doshomethingbyat.GoClass.HaveALesson())")
    public void pointcut(){
        System.out.println("这是切面1");
    };

    @Pointcut("execution(* com.ggyy0851.doshomethingbyat.GoClass.HaveALesson(String))")
    public void pointcut2(){
        System.out.println("这是切面2");
    };
    @Before("pointcut()")
    public void pre(){
        System.out.println("收书");
    }
    @Before("pointcut2() && args(name1)")
    public void pre(String name1){
        System.out.println("收书:"+name1);
    }
}
