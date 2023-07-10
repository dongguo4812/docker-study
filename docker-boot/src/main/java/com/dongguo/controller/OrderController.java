package com.dongguo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author dongguo
 * @date 2023/7/8
 * @description:
 */
@RestController
public class OrderController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/order/docker")
    public String helloDocker() {
        return "hello docker"+"\t"+port+"\t"+ UUID.randomUUID();
    }
}
