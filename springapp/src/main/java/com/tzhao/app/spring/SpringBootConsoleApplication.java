package com.tzhao.app.spring;

import com.tzhao.app.spring.service.HelloMessageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {


    private static final Logger LOGGER =
            LogManager.getLogger(SpringBootConsoleApplication.class);

    @Autowired
    private HelloMessageService helloService;

    public static void main(String[] args) {

        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }


    @Override
    public void run(String... args) throws Exception {
        LOGGER.debug("a debug");
        LOGGER.info("a info");
        LOGGER.warn("a warn");
        LOGGER.error("a error");
        if ( args.length > 0 ) {
            System.out.println(helloService.getMessage(args[0].toString()));
        }
        else {
            System.out.println(helloService.getMessage());
        }

        exit(0);
    }
}
