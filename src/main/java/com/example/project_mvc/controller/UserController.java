package com.example.project_mvc.controller;

import com.example.project_mvc.pojo.User;
import com.example.project_mvc.pojo.bo.RegisterUserBO;
import com.example.project_mvc.pojo.vo.ResultModel;
import com.example.project_mvc.service.IUserService;
import com.example.project_mvc.utils.CodeEnum;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

// Rest 风格的接口：json格式接口
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    /**
     * Get登录接口
     * @param loginId
     * @param password
     * @return  返回定义的 ResultModel
     * @throws Exception
     */
    @GetMapping("/login.do")
    public ResultModel<User> login(@Param("loginId") String loginId, @Param("password") String password) throws Exception {
        User user = userService.login(loginId, password);
        return new ResultModel<>(CodeEnum.SUCCESS,"登录成功",user,true);
    }

    /**
     * Post登录接口
     * @RequestBody  user 对象
     * @return  返回定义的 ResultModel
     * @throws Exception
     */
    @PostMapping("/login.do")
    public ResultModel<User> loginPost(@RequestBody User model) throws Exception {
        User user = userService.login(model.getLoginId(), model.getPassword());
        return new ResultModel<>(CodeEnum.SUCCESS,"登录成功",user,true);
    }

    @PostMapping("/registe.do")
    public User registe(@RequestBody RegisterUserBO model) throws Exception {
        userService.registe(model);
        model.setPassword("");
        model.setPasswordAgain("");
        return model;
    }

}
