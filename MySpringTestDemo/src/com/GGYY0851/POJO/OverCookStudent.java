package com.ggyy0851.pojo;

/**
 * @author GeYao
 * @create 2020-05-25 - 17:58
 */
public class OverCookStudent extends Student {
    public OverCookStudent(int money){
        if(money>=100) {super.setLevel("high");}
        else {super.setLevel("low");}
    }
}
