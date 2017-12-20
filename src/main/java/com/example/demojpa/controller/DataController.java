package com.example.demojpa.controller;

import com.example.demojpa.dao.StudentRepository;
import com.example.demojpa.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author lirong
 * @create 2017/12/19
 * @since 1.0.0
 */
@RestController
public class DataController {
    //spring DataJPA已自动为你注册bean,所以可自动注入
    @Autowired
    private StudentRepository studentRepository;

    /**
     * 原有的自带的
     * 保存save支持批量保存<S extends T> Iterable<S>save(Iterable<S> entities)
     *
     */
    @RequestMapping("/save")
    public Student save(String name, Integer age) {
        return studentRepository.save(new Student(name, age));
    }

    @RequestMapping("/qname")
    public List<Student> qname(String name) {
        return studentRepository.findByStuName(name);
    }

    @RequestMapping("/qna")
    public Student qna(String name,Integer age) {
        return studentRepository.findByStuNameAndAge(name,age);
    }

    @RequestMapping("/qage")
    public Student qage(Integer age) {
        Student s=studentRepository.findByStuAge(age);
        return s;
    }

    @RequestMapping("/withNameQuery")
    public List<Student> withNameQuery(String name){
        return studentRepository.withNameQuery(name);
    }
}
