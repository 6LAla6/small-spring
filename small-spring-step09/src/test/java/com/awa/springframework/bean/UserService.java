package com.awa.springframework.bean;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.*;
import com.awa.springframework.context.ApplicationContext;
import com.awa.springframework.context.ApplicationContextAware;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/9/22 20:43
 **/
public class UserService {

    private String uId;
    private String company;
    private String location;
    private IUserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

}
