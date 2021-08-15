package second.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(value = "second")
@Import(CDPlayerConfig.class)
@ImportResource(locations = "classpath*:second/*.xml")
public class SecondSpringConfig {

}
