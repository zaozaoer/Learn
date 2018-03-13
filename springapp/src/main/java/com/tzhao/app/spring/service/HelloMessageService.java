package com.tzhao.app.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import outer.OuterClass;

@Service
public class HelloMessageService {

    private static final Logger LOGGER =
            LogManager.getLogger(HelloMessageService.class);


    @Value( "${name:unknown}" )
    private String name;

    public String getMessage() {
        return getMessage(name);
    }

    public String getMessage(String name) {
        OuterClass o = new OuterClass();
        LOGGER.info("infoinfo");
        LOGGER.warn("warnwarn");
        LOGGER.error("errorerror");
        return "Hello " + name;
    }

}
