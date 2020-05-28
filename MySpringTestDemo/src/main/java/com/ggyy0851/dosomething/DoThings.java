package com.ggyy0851.dosomething;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import javax.naming.Name;

/**
 * @author GeYao
 * @create 2020-05-27 - 18:30
 */
public class DoThings {
    //AspectJ中的异常捕获不是必须的，可以是一个普通方法
    public void MyWrong(Exception e){
        System.out.println("搞出问题了");
        System.out.println(e.getMessage());
    }
    public void BeforeAdvice(){
        System.out.println("Aj风格前置通知");
    }
    public void AfterAdvice(){
        System.out.println("Aj风格后置通知");
    }
    public void BeforeAdvice(String name){
        System.out.println("Aj风格前置通知" + name);
    }
    public Object AroundAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Aj风格环绕通知");
        System.out.println("Aj风格环绕前置");
        Object o = point.proceed();
        System.out.println("Aj风格环绕后置");
        return o;
    }
}
