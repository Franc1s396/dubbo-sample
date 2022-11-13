package org.francis.springboot.dubbo.provider.service;


import org.apache.dubbo.config.annotation.DubboService;
import org.francis.springboot.dubbo.api.ISayHelloService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Franc1s
 * @date 2022/11/13
 * @apiNote
 */
@DubboService(registry = {"shanghai","hunan"},protocol = {"dubbo"})
public class ISayHelloServiceImpl implements ISayHelloService {
    @Value("${dubbo.protocols.dubbo.port}")
    private Integer port;
    @Override
    public String sayHello() {
        System.out.println("hello" + port);
        return "hello"+port;
    }
}
