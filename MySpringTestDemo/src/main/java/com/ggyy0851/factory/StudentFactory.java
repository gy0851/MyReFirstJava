package com.ggyy0851.factory;

import com.ggyy0851.pojo.OverCookStudent;

/**
 * @author GeYao
 * @create 2020-05-25 - 17:34
 */
public class StudentFactory {
    public OverCookStudent CreateStudent(int money) {return new OverCookStudent(money);}
}
