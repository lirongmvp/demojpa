package com.example.demojpa.jsonTest;

/**
 * @author lirong
 * @create 2017/12/24
 * @since 1.0.0
 */
public class Item {

    private String name;
    private Integer age;

    public Item() {
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
        return "Item{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
