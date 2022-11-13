package org.francis.dubbo.client;

import org.francis.dubbo.server.ILoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Franc1s
 * @date 2022/11/12
 * @apiNote
 */
public class DubboClientApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/application.xml");
        ILoginService loginService = context.getBean(ILoginService.class);
        System.out.println(loginService.login("admin", "admin"));
    }
}
