package com.liu.test.lytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LytesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LytesApplication.class, args);
    }
    @PostConstruct
    public void todosou(){
        System.out.println("测试输出正确==========================================123");
        System.out.println("测试输出正确==========================================1345");
        System.out.println("测试==========================================1345");
    }

}
