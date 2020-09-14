package com.ds.entity;

/**
 * @ClassName: User
 * @Description: function desc
 * @Author cnopens
 * @Date 2020/9/14 下午3:33
 * @Copyright Dashuo
 **/
public class User {
    private String name;
    private int age;
    private String sex;
    private String className;
    private String toTecheacher;


    public User() {
    }

    public User(String name, int age, String sex, String className, String toTecheacher) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.className = className;
        this.toTecheacher = toTecheacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getToTecheacher() {
        return toTecheacher;
    }

    public void setToTecheacher(String toTecheacher) {
        this.toTecheacher = toTecheacher;
    }
}
