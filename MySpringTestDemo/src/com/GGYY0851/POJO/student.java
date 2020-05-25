package com.ggyy0851.pojo;

/**
 * @author GeYao
 * @create 2020-05-25 - 15:33
 */
public class Student {
    public Student(){};
    public Student(String name) {
        super();
        this.name  = name;
    }
    public Student(String name,String id){
        super();
        this.id = id;
        this.name = name;
    }

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
