package com.ds.controller;

import com.ds.utils.Result;
import com.ds.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UserController
 * @Description: function desc
 * @Author cnopens
 * @Date 2020/9/14 下午3:30
 * @Copyright Dashuo
 **/
@RestController
@RequestMapping("/")
public class UserController {

    @RequestMapping("/users")
    public Result getUsers(){

        User user1 = new User("wangpeng",22,"男","二班","王老师");
        User user2 = new User("莉莉",24,"女","三班","王老师");
        User user3 = new User("凯凯",26,"男","一班","王老师");

        List list = new ArrayList<User>();
        list.add(0,user1);
        list.add(1,user2);
        list.add(2,user3);

        return Result.toResult(200,"ok",list);
    }
}
