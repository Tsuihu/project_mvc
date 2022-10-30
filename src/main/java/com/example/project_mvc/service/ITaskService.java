package com.example.project_mvc.service;


import com.example.project_mvc.pojo.Task;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ITaskService {
    List<Task> getAllTask(Task task);
    Task updateTask(Task task);
}
