package com.awa.springframework.bean;

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
        System.out.println("查询用户信息......" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }

}
