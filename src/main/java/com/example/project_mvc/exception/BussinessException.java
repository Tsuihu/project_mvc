package com.example.project_mvc.exception;

import com.example.project_mvc.utils.CodeEnum;

/**
 * 定义业务异常类
 */
public class BussinessException extends Exception {
    private CodeEnum errorCode;

    public CodeEnum getErrorCode() {
        return errorCode;
    }

    public BussinessException(String message, CodeEnum codeEnum) {
        super (message);
        this.errorCode = codeEnum;
    }
}
