package com.xu;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulMicroserviceApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(ZuulMicroserviceApplication.class).web(true).run(args);
    }
}
