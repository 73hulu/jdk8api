package com.hulu73.entity;

import java.io.Serializable;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/10 0010
 * @Description:
 */
public class UserEntity implements Serializable {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public UserEntity(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public UserEntity() {
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
