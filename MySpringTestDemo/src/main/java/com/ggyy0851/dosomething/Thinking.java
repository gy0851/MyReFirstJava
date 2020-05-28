package com.ggyy0851.dosomething;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author GeYao
 * @create 2020-05-28 - 12:43
 */
public class  Thinking implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        //在此过程之前执行的类似前置通知
        System.out.println("前置");
        //此方法即继续执行被介入类的方法的过程
        Object result = invocation.proceed();
        //在此过程之后执行的类似后置通知
        System.out.println("后置");
        //之后返回被介入方法的返回值，使其继续往下执行
        return result;
    }
}
