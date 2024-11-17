package com.example.todoclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.kafka")
@Data
public class KafkaProperties {
    private String bootstrapServers;
    private Consumer consumer;

    @Data
    private static class Consumer {
        private String groupId;
    }
}
