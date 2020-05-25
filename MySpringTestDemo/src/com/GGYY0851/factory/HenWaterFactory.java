package com.ggyy0851.factory;

import com.ggyy0851.pojo.OverCookStudent;

/**
 * @author GeYao
 * @create 2020-05-25 - 18:29
 */
public class HenWaterFactory {
    private static HenWaterFactory instance;
    private HenWaterFactory(){};

    public static HenWaterFactory getInstance(){
        if(instance == null) {return new HenWaterFactory();}
        else {return instance;}
    }
    public OverCookStudent CreateStudent(){
        return new OverCookStudent(1000);
    }
}
