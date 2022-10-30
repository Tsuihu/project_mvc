package com.example.project_mvc.exception;

import com.example.project_mvc.pojo.vo.ResultModel;
import com.example.project_mvc.utils.CodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
/**
 * 创建全局异常处理类
 */
public class GlobalExceptionAccess {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handle(Exception e) {
        if(e instanceof BussinessException) {
            BussinessException be = (BussinessException)e;
            ResultModel<Object> result = new ResultModel<>(be.getErrorCode(),be.getMessage(),null,false);
            return result;
        }
        ResultModel<Object> result = new ResultModel<>(CodeEnum.BUSSINESS_ERROR,"服务器处理异常",null,false);
        return result;
    }
}
