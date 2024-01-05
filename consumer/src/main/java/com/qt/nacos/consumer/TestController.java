package com.qt.nacos.consumer;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final FeignService feignService;

    public TestController(FeignService feignService) {
        this.feignService = feignService;
    }

    @RequestMapping("/echo/hi")
    public String echo() {
        return feignService.echo("Hi Feign");
    }
}
