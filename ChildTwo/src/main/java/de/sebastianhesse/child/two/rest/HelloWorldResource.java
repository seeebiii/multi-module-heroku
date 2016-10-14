package de.sebastianhesse.child.two.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 */
@Component
@Path("/hello")
public class HelloWorldResource {


    @GET
    public Response sayHelloWorld() {
        return Response.ok("Hello World Two!").build();
    }

}
