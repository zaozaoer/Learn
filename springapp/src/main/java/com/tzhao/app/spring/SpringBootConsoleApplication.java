package com.tzhao.app.spring;

import com.tzhao.app.spring.service.AllProperties;
import com.tzhao.app.spring.service.HelloMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Properties;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {


    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootConsoleApplication.class);

    @Autowired
    private HelloMessageService helloService;

    @Autowired
    AllProperties props;

    public static void main(String[] args) {

        System.setProperty("spring.config.location", "file:./springapp/conf/");
        System.setProperty("spring.config.name", "ppp");

        File f = new File("./conf/pason.properties");
        System.out.println(f.getAbsoluteFile().getAbsolutePath());

//        KvsMigConf conf = new KvsMigConf();
//        System.out.println( "--"+conf.getWordSize() );


        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
        //app.setBannerMode(Banner.Mode.OFF);
        app.run(args);



    }



    @Override
    public void run(String... args) throws Exception {


        AppProperties app = props.getApp();
        GlobalProperties global = props.getGlobal();

        LOGGER.info("Welcome {}, {}", app, global);

        LOGGER.debug("a debug");
        LOGGER.info("a info");
        LOGGER.warn("a warn");
        LOGGER.error("a error");
        if (args.length > 0) {
            System.out.println(helloService.getMessage(args[0].toString()));
        } else {
            System.out.println(helloService.getMessage());
        }

        exit(0);
    }
}
