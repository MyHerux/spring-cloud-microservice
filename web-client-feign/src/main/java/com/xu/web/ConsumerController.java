package com.xu.web;

import com.xu.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return userClient.add("xu");
    }
}