package com.tzhao.app.spring;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(
        prefix = "spring.datasource.secondary")
public class AppProperties {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

//    public void set(String myname)
//    {
//        this.myname = myname;
//    }
//
//    public String getMyname()
//    {
//        return this.myname;
//    }

}
