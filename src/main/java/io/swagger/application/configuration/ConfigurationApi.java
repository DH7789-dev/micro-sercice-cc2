package io.swagger.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPooled;

@Configuration
public class ConfigurationApi {

    private final RedisConfiguration redisConfiguration;

    public ConfigurationApi(RedisConfiguration redisConfiguration) {
        this.redisConfiguration = redisConfiguration;
    }

    @Bean
    public JedisPooled jedisPool() {
        return new JedisPooled(redisConfiguration.getHost(), redisConfiguration.getPort());
    }
}