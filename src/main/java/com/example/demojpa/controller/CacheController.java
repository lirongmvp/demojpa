package com.example.demojpa.controller;

import com.example.demojpa.pojo.Student;
import com.example.demojpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lirong
 * @create 2017/12/20
 * @since 1.0.0
 */
@RestController
public class CacheController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/savecache")
    public Student save(Student student){
        return studentService.put(student);
    }
    @RequestMapping("/cache")
    public Student cache(Student student){
        return studentService.cache(student);
    }
}
