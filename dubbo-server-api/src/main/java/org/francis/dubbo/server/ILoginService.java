package org.francis.dubbo.server;

/**
 * @author Franc1s
 * @date 2022/11/12
 * @apiNote
 */
public interface ILoginService {
    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return 结果
     */
    String login(String username, String password);
}
