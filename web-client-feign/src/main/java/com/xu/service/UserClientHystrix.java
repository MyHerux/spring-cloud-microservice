package com.xu.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class UserClientHystrix implements UserClient{
    @Override
    public String add(@RequestParam(value = "name") String name) {
        return "error";
    }
}
