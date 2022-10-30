package com.example.project_mvc.service;

import com.example.project_mvc.pojo.Custom;
import com.example.project_mvc.pojo.bo.PageRequestBO;
import com.example.project_mvc.pojo.bo.PageResultBO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ICustomService {
    // 分页查询
    PageResultBO<Custom> getPagedCustom(PageRequestBO model);
    // 插入数据
    Custom insertCustom(Custom custom);
    // 修改数据
    Custom updateCustom(Custom custom);
    // 删除数据
    Custom deleteCustom(Integer customId);
    // 根据customId查询一数据
    Custom getCustomById(Integer customId);
    // 模糊查询：根据名字查询相关数据
    List<Custom> getCustomListByName(String customName);
}
