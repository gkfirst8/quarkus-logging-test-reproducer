package nl.indi.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/hello")
public class GreetingResource {
    private static final org.jboss.logging.Logger JBOSS_LOG = org.jboss.logging.Logger
            .getLogger(GreetingResource.class);
    private static final Logger LOG = LoggerFactory.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.info("Hello called");
        JBOSS_LOG.info("Hello called (JBoss logging)");
        return "Hello from RESTEasy Reactive";
    }
}
