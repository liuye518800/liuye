package com.liu.test.lytes;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:application.yml"})
public class RedssonConfig {
    @Value("${host}")
    private String host;
    @Value("${password}")
    private String password;
    @Value("${port}")
    private String port;
    public RedssonConfig(){}
    @Bean
    public RedissonClient getRedisson()
    {
        System.out.println("host=========================================="+host);
        System.out.println("password=========================================="+password);
        System.out.println("port=========================================="+port);
        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://"+host+":"+port).setPassword(password)
                .setRetryInterval(5000)
                .setTimeout(10000)
                .setConnectTimeout(10000);
        return Redisson.create(config);
    }
}
