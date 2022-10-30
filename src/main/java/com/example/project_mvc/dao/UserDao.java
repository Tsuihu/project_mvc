package com.example.project_mvc.dao;

import com.example.project_mvc.pojo.User;
import com.example.project_mvc.pojo.bo.RegisterUserBO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public interface UserDao {
    User login(@Param("loginId") String loginId,@Param("password") String password);
    int insertUser(RegisterUserBO user);
    int checkUserRepeat(@Param("loginId") String loginId);
}
