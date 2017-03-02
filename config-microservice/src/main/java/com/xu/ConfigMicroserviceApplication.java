package com.xu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigMicroserviceApplication {

    public static void main(String args[]){
        new SpringApplicationBuilder(ConfigMicroserviceApplication.class).web(true).run(args);
    }
}
