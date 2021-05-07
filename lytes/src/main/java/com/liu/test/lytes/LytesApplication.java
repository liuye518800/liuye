package com.liu.test.lytes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
@PropertySource(value = {"classpath:application.yml"})
public class LytesApplication {
    @Value("${host}")
    private String host;
    @Value("${password}")
    private String password;
    @Value("${port}")
    private String port;
    public static void main(String[] args) {
        SpringApplication.run(LytesApplication.class, args);
    }
    @PostConstruct
    public void todosou(){
        System.out.println("测试输出正确==========================================1111111");
        System.out.println("测试输出正确==========================================1345");
        //System.out.println("host=========================================="+host);
        //System.out.println("password=========================================="+password);
        //System.out.println("port=========================================="+port);
    }

}
