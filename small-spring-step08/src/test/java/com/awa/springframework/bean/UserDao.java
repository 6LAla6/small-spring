package com.awa.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/9/25 20:11
 **/
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行：init-method");
        hashMap.put("01", "awa");
        hashMap.put("02", "周曦");
        hashMap.put("03", "杨静");
    }

    public void destroyDataMethod() {
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String id) {
        return hashMap.get(id);
    }

}
