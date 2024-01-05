package com.qt.nacos.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "qt-nacos-echo-service")
public interface FeignService {
    @GetMapping("/api/test/echo/{message}")
    String echo(@PathVariable String message);

}
