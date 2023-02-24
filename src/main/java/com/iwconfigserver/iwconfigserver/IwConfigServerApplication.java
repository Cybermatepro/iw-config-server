package com.iwconfigserver.iwconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class IwConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IwConfigServerApplication.class, args);
    }

}
