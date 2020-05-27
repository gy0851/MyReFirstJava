package com.ggyy0851.dosomething;

/**
 * @author GeYao
 * @create 2020-05-27 - 18:30
 */
public class DoWrong2 {
    //AspectJ中的异常捕获不是必须的，可以是一个普通方法
    public void MyWrong(Exception e){
        System.out.println("搞出问题了");
        System.out.println(e.getMessage());
    }
}
