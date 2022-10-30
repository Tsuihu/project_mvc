package com.example.project_mvc.pojo.vo;

import com.example.project_mvc.utils.CodeEnum;
import lombok.Data;


@Data
/**
 *  定义统一的返回数据类
 */
public class ResultModel<T> {
    // code约定： 200调用成功， 300登陆超时， 301登陆失败， 400业务逻辑错误
    private Integer code;
    private String message;
    private T object;
    private Boolean success;

    public ResultModel(CodeEnum codeEnum, String message, T object, Boolean success) {
        this.code = codeEnum.getCode();
        this.message = message;
        this.object = object;
        this.success = success;
    }
}
