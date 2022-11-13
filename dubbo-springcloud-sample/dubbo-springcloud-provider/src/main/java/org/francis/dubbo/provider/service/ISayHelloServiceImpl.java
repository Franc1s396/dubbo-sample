package org.francis.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.francis.dubbo.api.ISayHelloService;

/**
 * @author Franc1s
 * @date 2022/11/13
 * @apiNote
 */
@Service
public class ISayHelloServiceImpl implements ISayHelloService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
