package com.tzhao.app.spring.service;

import com.tzhao.app.spring.AppProperties;
import com.tzhao.app.spring.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AllProperties {

    @Autowired
    private AppProperties app;

    @Autowired
    private GlobalProperties global;


    public void setApp(AppProperties app) {
        this.app = app;
    }


    public void setGlobal(GlobalProperties global) {
        this.global = global;
    }

    public GlobalProperties getGlobal() {
        return global;
    }

    public AppProperties getApp() {
        return app;
    }
}
