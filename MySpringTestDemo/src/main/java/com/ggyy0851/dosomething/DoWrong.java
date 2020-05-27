package com.ggyy0851.dosomething;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author GeYao
 * @create 2020-05-27 - 17:31
 */
public class DoWrong implements ThrowsAdvice {
    //奇怪的使用方法，必须使用afterThrowing(Method,Object[],Object,Throwable)或者afterThrowing(Throwable)这两种形式，否则报错
    public void afterThrowing(Method method, Object[] args, Object target, Throwable th){
        //异常的处理需要原方法没有进行try catch处理，否则无法捕捉
        System.out.println("这个类"+target.getClass().getName()+"的"+method.getName()+"方法干出问题了！");
    }
}
