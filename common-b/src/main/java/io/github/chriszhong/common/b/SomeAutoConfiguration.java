package io.github.chriszhong.common.b;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@Configuration
@EnableConfigurationProperties(SomeProperties.class)
public class SomeAutoConfiguration {

    @Inject
    private SomeProperties properties;

    @Bean
    public SomeData someData() {
        return new SomeData(properties.getKey1(), properties.getKey2());
    }
}
