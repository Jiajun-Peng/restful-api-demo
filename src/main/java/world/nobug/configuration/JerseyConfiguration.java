package world.nobug.configuration;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/api") // 设置API路径前缀
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        packages("world.nobug.resource");
    }
}
