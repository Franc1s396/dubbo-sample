package org.francis.springboot.dubbo.provider.service;


import org.apache.dubbo.config.annotation.DubboService;
import org.francis.springboot.dubbo.api.ISayHelloService;

/**
 * @author Franc1s
 * @date 2022/11/13
 * @apiNote
 */

//@DubboService(registry = {"shanghai","hunan"})
@DubboService
public class ISayHelloServiceImpl implements ISayHelloService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
