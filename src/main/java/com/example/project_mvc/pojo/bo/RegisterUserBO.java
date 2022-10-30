package com.example.project_mvc.pojo.bo;

import com.example.project_mvc.pojo.User;
import lombok.Data;

@Data
public class RegisterUserBO extends User {
    private String passwordAgain;
}
