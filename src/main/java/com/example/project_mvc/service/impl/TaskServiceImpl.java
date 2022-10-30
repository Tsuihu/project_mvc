package com.example.project_mvc.service.impl;

import com.example.project_mvc.dao.CustomDao;
import com.example.project_mvc.dao.TaskDao;
import com.example.project_mvc.pojo.Custom;
import com.example.project_mvc.pojo.Task;
import com.example.project_mvc.pojo.bo.PageRequestBO;
import com.example.project_mvc.pojo.bo.PageResultBO;
import com.example.project_mvc.service.ICustomService;
import com.example.project_mvc.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskServiceImpl implements ITaskService {
    @Autowired
    TaskDao taskDao;

    @Override
    public List<Task> getAllTask(Task task) {
        List<Task> allTask = taskDao.getAllTask(task);
        return allTask;
    }

    @Override
    public Task updateTask(Task task) {
        taskDao.updateTask(task);
        return task;
    }


}
