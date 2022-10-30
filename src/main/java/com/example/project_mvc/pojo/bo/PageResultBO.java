package com.example.project_mvc.pojo.bo;

import lombok.Data;

import java.util.List;

@Data
public class PageResultBO<T>{
    private List<T> data;
    private Integer count;
    // 创建构造方法（便于调用时传值）
    public PageResultBO(List<T> data, Integer count){
        this.data = data;
        this.count = count;
    }
}
