package io.swagger.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPooled;

@Configuration
public class ConfigurationApi {


    public ConfigurationApi() {
    }

    @Bean
    public JedisPooled jedisPool() {
        return new JedisPooled("localhost", 6379);
    }
}