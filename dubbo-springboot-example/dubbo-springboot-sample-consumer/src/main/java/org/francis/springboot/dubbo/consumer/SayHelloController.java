package org.francis.springboot.dubbo.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.francis.springboot.dubbo.api.ISayHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Franc1s
 * @date 2022/11/13
 * @apiNote
 */
@RestController
public class SayHelloController {
    @DubboReference(registry = {"shanghai","hunan"},protocol = "dubbo",loadbalance = "")
    ISayHelloService sayHelloService;
    @GetMapping("/say")
    public String say(){
        return sayHelloService.sayHello();
    }
}
