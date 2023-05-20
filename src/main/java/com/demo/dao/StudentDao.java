package com.demo.dao;

import com.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
}
