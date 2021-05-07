package com.liu.test.lytes;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestService {
    @Qualifier("getRedisson")
    @Autowired
    private RedissonClient redissonClient;
    @RequestMapping("/test")
    public String testRedisson(){
        RLock lock = redissonClient.getLock("lock");
        lock.lock();
        try {
            System.out.println("上锁输出=========================123");
            while (true){

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("解锁输出=========================456");
        }
        return "123";

    }
}
