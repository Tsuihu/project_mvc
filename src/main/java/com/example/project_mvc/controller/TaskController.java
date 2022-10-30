package com.example.project_mvc.controller;

import com.example.project_mvc.pojo.Task;
import com.example.project_mvc.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    ITaskService taskService;

    @PostMapping("/getalltask.do")
    public List<Task> getAllTask(Task task) {
        List<Task> allTask = taskService.getAllTask(task);
        return allTask;
    }

    @PostMapping("/updatetask.do")
    public Task updateTask(@RequestBody Task task) {
        taskService.updateTask(task);
        return task;
    }
}
