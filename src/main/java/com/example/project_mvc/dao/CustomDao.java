package com.example.project_mvc.dao;

import com.example.project_mvc.pojo.Custom;
import com.example.project_mvc.pojo.bo.PageRequestBO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomDao {
    // 返回查询页数的集合
    List<Custom> getPagedCustom(PageRequestBO mdoel);
    // 返回数据总个数
    int getPagedCustomCount();
    // 插入数据
    void insertCustom(Custom custom);
    // 修改数据
    void updateCustom(Custom custom);
    // 删除数据
    void deleteCustom(Integer customId);
    // 根据customId查询一数据
    Custom getCustomById(Integer customId);
    // 模糊查询：根据名字查询相关数据
    List<Custom> getCustomListByName(String customName);
}
