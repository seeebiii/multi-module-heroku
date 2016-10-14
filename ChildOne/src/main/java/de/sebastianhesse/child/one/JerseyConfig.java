package de.sebastianhesse.child.one;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Jersey configuration class. Uses package to scan for resources.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        super();
        packages("de.sebastianhesse.child.one.rest");
    }
}
