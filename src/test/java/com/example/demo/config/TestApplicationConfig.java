package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by yoonhyohwan on 2017. 1. 9..
 */
@Configuration
@Import({ RootApplicationConfig.class, WebApplicationConfig.class })
public class TestApplicationConfig {
}
