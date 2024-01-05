package com.qt.nacos.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return port + "Hello Nacos Discovery " + message;
    }

}
