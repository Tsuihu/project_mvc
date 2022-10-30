package com.example.project_mvc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class User {
    private Integer id;
    private String name;
    private String loginId;
    private String password;
    // 日期格式化
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyy-MM-dd", timezone = "GMT+8")
    private Date birthday;
}
