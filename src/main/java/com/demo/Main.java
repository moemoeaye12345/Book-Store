package com.demo;

import com.demo.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        context.registerShutdownHook();

        StudentService studentService = context.getBean(StudentService.class);
        studentService.saveStudent();
        studentService.listAllStudent()
                .forEach(System.out::println);
    }
}
