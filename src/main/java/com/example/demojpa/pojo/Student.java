package com.example.demojpa.pojo;

import org.hibernate.annotations.NamedQuery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @author lirong
 * @create 2017/12/19
 * @since 1.0.0
 */
@Entity
@NamedQuery(name = "Student.withNameQuery",
        query = "select s from Student s where s.stuName=?1")
public class Student {
    @Id
    @GeneratedValue
    private Long stuId;
    private String stuName;
    private Integer age;

    public Student(String stuName, Integer age) {
        this.stuName = stuName;
        this.age = age;
    }

    public Long getStuId() {

        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }
}
