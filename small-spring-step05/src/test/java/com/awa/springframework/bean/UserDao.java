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

    static {
        hashMap.put("01", "小米");
        hashMap.put("02", "华为");
        hashMap.put("03", "三星");
    }

    public String queryPhoneName(String id) {
        return hashMap.get(id);
    }

}
