package com.example.project_mvc.dao;

import com.example.project_mvc.pojo.Task;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TaskDao {
    List<Task> getAllTask(Task task);
    void updateTask(Task task);
}
