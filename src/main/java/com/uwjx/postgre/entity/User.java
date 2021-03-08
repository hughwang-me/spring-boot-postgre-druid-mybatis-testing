package com.uwjx.postgre.entity;

/**
 * @author  Wang Huan 
 * @author  18501667737@163.com
 * @date  2021/3/8 14:43
 *
 */
    
public class User {
    private Integer id;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}