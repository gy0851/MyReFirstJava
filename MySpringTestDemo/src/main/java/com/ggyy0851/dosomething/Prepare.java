package com.ggyy0851.dosomething;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author GeYao
 * @create 2020-05-27 - 15:42
 */
public class Prepare implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        //method传递的是本通知所介入对象的被介入方法的引用，可以通过该对象获得相应方法的名字等信息
        System.out.println(method.getName());
        //argument传递的是上述方法所包含的参数，是数组类型。
        if(args.length>0){
            for(Object o:args){
                System.out.println(o.toString());
            }
        }
        //target包含的是被介入对象的引用，而非被介入对象的复制，此处可对原目标进行操作
        System.out.println(target.getClass().getName());
        GoClass gc = (GoClass)target;
        System.out.println("前置通知里："+gc.getScore());
        gc.setScore("321");
        System.out.println("收书");
    }


}
