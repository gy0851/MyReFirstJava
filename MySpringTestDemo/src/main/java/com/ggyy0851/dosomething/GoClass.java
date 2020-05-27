package com.ggyy0851.dosomething;

import javax.naming.Name;

/**
 * @author GeYao
 * @create 2020-05-27 - 15:46
 */
public class GoClass {
    private String score;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void gotoClass(){
        System.out.println("去上课");
        System.out.println("本体："+score);
    }
    public void gotoClass(String classname){
        int a =6/0;
        System.out.println("去上课");
        System.out.println("本体："+score);
        System.out.println("上的课名叫："+ classname);
    }
    public void listen(){
        System.out.println("上课");
    }
    public void sleep(){
        System.out.println("也是上课");
    }
}
