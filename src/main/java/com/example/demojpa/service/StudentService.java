package com.example.demojpa.service;

import com.example.demojpa.dao.StudentRepository;
import com.example.demojpa.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author lirong
 * @create 2017/12/20
 * @since 1.0.0
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //缓存的名称为student key为student的stuId数据缓存到people中
    //无论怎样都将方法的返回值放到缓存中
    @CachePut(value = "student", key = "#student.stuId")
    public Student put(Student student) {
        return studentRepository.save(student);
    }

    //执行方法前先查看缓存中是否有
    @Cacheable(value = "student", key = "#student.stuId")
    public Student cache(Student student) {
        return studentRepository.findOne(student.getStuId());
    }
}
