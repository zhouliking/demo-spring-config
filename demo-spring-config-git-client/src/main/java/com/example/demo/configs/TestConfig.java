package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class TestConfig {
    @Value("${config.value}")
    private String configValue;


    public String getConfigValue() {
        return configValue;
    }
}
