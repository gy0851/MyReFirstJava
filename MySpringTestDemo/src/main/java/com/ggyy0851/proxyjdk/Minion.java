package com.ggyy0851.proxyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author GeYao
 * @create 2020-05-28 - 18:08
 */
public class Minion implements InvocationHandler {
    private Master master;

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = null;
        //针对不同的method进行不同处理
        if("fly".equals(method.getName())){
            System.out.println("清空场地");
        }else{
            System.out.println("驱赶人群");
        }
        o = method.invoke(master,args);
        System.out.println("清扫场地");

        return o;
    }
}
