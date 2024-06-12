package world.nobug.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        packages("world.nobug.resource");
    }
}
