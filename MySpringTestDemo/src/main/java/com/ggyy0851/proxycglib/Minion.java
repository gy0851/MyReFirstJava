package com.ggyy0851.proxycglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author GeYao
 * @create 2020-05-28 - 18:54
 */
public class Minion implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("清扫地面");
        Object oo = null;
        //oo = method.invoke(o,objects);
        oo = methodProxy.invokeSuper(o,objects);
        return oo;
    }
}
