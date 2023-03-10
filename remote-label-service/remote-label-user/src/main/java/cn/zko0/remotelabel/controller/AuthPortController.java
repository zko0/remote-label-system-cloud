package cn.zko0.remotelabel.controller;

import cn.zko0.remotelabel.entity.User;
import cn.zko0.remotelabel.mapper.UserMapper;
import cn.zko0.remotelabel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthPortController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper mapper;

    @GetMapping("/auth/getRoleById")
    public String getRoleById(String id){
        return userService.getRoleById(id);
    }

}