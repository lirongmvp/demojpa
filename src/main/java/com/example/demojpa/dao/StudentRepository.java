package com.example.demojpa.dao;


import com.example.demojpa.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author lirong
 * @create 2017/12/19
 * @since 1.0.0
 */
public interface StudentRepository  extends JpaRepository<Student,Long> {
    //方法名查询
    List<Student> findByStuName(String name);
    //方法名查询
    Student findByStuNameAndAge(String name,Integer age);
    //@Query查询
    @Query("select s from Student s where s.age=:age")
    Student findByStuAge(@Param("age")Integer age);

    List<Student> withNameQuery(String name);
}