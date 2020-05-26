package com.ggyy0851.pojo;

/**
 * @author GeYao
 * @create 2020-05-25 - 15:33
 */
public class Student {
    public Student(){};

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    private History history;
    public Student(String name) {
        super();
        this.name  = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(String name, String id){
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

    @Override
    public String toString() {
        return "Student{" +
                "history=" + history +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
