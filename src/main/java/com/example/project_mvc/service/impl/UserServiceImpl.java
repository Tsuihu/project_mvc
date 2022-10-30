package com.example.project_mvc.service.impl;

import com.example.project_mvc.dao.UserDao;
import com.example.project_mvc.exception.BussinessException;
import com.example.project_mvc.pojo.User;
import com.example.project_mvc.pojo.bo.RegisterUserBO;
import com.example.project_mvc.service.IUserService;
import com.example.project_mvc.utils.CodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;

    /**
     *  修改抛出异常为 BussinessException
     *  返回 user 对象
     */
    public User login(String loginId, String password) throws BussinessException {
        User user = userDao.login(loginId, password);
        if(user != null) {
            return user;
        }else {
            throw new BussinessException("用户名或密码不正确", CodeEnum.LOGIN_FAILED);
        }
    }

    @Override
    public User registe(RegisterUserBO model) throws BussinessException {
        if(model.getPassword().equals(model.getPasswordAgain())) {
            if(userDao.checkUserRepeat(model.getLoginId()) > 0) {
                throw new BussinessException("用户名已经存在",CodeEnum.BUSSINESS_ERROR);
            }else {
                userDao.insertUser(model);
            }
        }else {
            throw new BussinessException("两次密码不相同",CodeEnum.BUSSINESS_ERROR);
        }
        return model;
    }
}
