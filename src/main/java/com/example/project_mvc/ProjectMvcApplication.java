package com.example.project_mvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.project_mvc.dao")
public class ProjectMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMvcApplication.class, args);
    }

}
