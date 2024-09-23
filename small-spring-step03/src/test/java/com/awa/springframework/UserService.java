package com.awa.springframework;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/9/22 20:43
 **/
public class UserService {

    private String name;

    UserService(String name) {
        this.name = name;
    }

    public void query() {
        System.out.println("UserService......");
    }
}
