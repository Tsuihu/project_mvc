package com.example.project_mvc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Task {
    private Integer taskId;
    private String taskName;
    private Integer taskStatus;
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    @JsonFormat(pattern = "YYYY-MM-dd hh:mm:ss", timezone = "GMT+8")
    private Date createTime;
}
