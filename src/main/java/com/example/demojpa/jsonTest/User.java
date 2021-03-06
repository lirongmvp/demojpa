package com.example.demojpa.jsonTest;

import java.util.List;

/**
 * @author lirong
 * @create 2017/12/24
 * @since 1.0.0
 */
public class User {
    private String name;
    private Integer age;
    private List<Item> list;

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }

    public User() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }
}
