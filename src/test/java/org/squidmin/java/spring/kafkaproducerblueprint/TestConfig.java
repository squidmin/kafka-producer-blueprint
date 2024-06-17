package org.squidmin.java.spring.kafkaproducerblueprint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public String topic() {
        return "test-topic";
    }

}
