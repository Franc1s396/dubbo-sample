package org.francis.springboot.dubbo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Franc1s
 * @date 2022/11/13
 * @apiNote
 */
@Path("/")
public interface ISayHelloService {

    @GET
    @Path("/say")
    String sayHello();
}
