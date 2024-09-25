package com.awa.springframework.beans;

/**
 * @Author: awa
 * @Description: TODO Bean的属性
 * @DateTime: 2024/9/25 16:12
 **/
public class PropertyValue {

    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
