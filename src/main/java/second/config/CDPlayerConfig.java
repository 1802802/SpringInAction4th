package second.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import second.CDPlayer;
import second.CompactDisc;

@Configuration
public class CDPlayerConfig {
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }
}
