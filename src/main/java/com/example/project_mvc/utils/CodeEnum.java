package com.example.project_mvc.utils;

/**
 * 定义CodeEnum枚举
 */
public enum CodeEnum {
    // 约束code规则
    SUCCESS(200),LOGIN_TIME(300),LOGIN_FAILED(301),BUSSINESS_ERROR(400);
    private int code;
    CodeEnum(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
