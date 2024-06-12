package world.nobug.configuration;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import world.nobug.jaxrs.CustomExceptionMapper;
import world.nobug.jaxrs.OtherExceptionMapper;

@Configuration
@ApplicationPath("/api") // 设置API路径前缀
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        packages("world.nobug.resource");
        // 注册异常映射器
        register(CustomExceptionMapper.class);
        register(OtherExceptionMapper.class);
    }
}
