package com.example.project_mvc.service;

import com.example.project_mvc.exception.BussinessException;
import com.example.project_mvc.pojo.User;
import com.example.project_mvc.pojo.bo.RegisterUserBO;
import org.springframework.stereotype.Component;

@Component
public interface IUserService {
    User login(String loginId, String password) throws BussinessException;
    User registe(RegisterUserBO model) throws BussinessException;
}
