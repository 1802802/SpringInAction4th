package second.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import second.CompactDisc;
import second.SgtPeppers;

@Configuration
public class CDConfig {
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
}