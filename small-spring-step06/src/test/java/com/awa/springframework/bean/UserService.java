package com.awa.springframework.bean;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/9/22 20:43
 **/
public class UserService {

    private String uId;
    private UserDao userDao;

    public String query() {
       return userDao.queryUserName(uId);
    }

}
