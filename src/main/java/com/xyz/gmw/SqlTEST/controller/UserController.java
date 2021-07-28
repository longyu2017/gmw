package com.xyz.gmw.SqlTEST.controller;


import com.xyz.gmw.SqlTEST.model.User;
import com.xyz.gmw.SqlTEST.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xyz
 * @since 2021-07-20
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;

    @GetMapping("/getUser")
    public User getUser(){
        User user = userService.getById(1);
        System.out.println(user);
        return user;
    }
}
