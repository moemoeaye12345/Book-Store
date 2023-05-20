package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void saveStudent() {

        Student s1 = new Student(1, "John Doe", 23, "ISM");
        Student s2 = new Student(2, "John WIlliam", 22, "ISY");
        Student s3 = new Student(3, "Thaw Thaw", 21, "Latha");


        studentDao.save(s1);
        studentDao.save(s2);
        studentDao.save(s3);

    }

    public Iterable<Student> listAllStudent() {
        return studentDao.findAll();
    }
}
