package org.francis.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.francis.dubbo.api.ISayHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Franc1s
 * @date 2022/11/13
 * @apiNote
 */
@RestController
public class SayHelloController {
    @Reference(check = false)
    ISayHelloService sayHelloService;
    @GetMapping("/say")
    public String say(){
        return sayHelloService.sayHello();
    }
}
