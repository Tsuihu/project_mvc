package com.example.project_mvc.pojo.bo;

import lombok.Data;

@Data
public class PageRequestBO {
    // 查询第几页
    private Integer pageIndex;
    // 查询一页多少条
    private Integer pageSize;
    // 查询的第一个参数索引值
    public Integer getRowBegin() {
        return (pageIndex - 1) * pageSize;
    }
}
