package org.francis.springboot.dubbo.provider.service;


import org.apache.dubbo.config.annotation.DubboService;
import org.francis.springboot.dubbo.api.ISayHelloService;

/**
 * @author Franc1s
 * @date 2022/11/13
 * @apiNote
 */

//@DubboService(registry = {"shanghai","hunan"})
@DubboService(version = "2.0")
public class ISayHelloServiceImpl2 implements ISayHelloService {
    @Override
    public String sayHello() {
        return "[Version2.0]hello";
    }
}
