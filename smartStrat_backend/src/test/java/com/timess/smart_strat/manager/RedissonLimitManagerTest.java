package com.timess.smart_strat.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RedissonLimitManagerTest {

    @Resource
    private RedissonLimitManager redissonLimitManager;

    @Test
    void doRateLimit() throws InterruptedException {
        //模拟请求操作
        String userId = "1";
        for (int i = 0; i < 2; i++) {
            redissonLimitManager.doRateLimit(userId);
            System.out.println("成功");
        }
        //休眠一秒
        Thread.sleep(1000);
        for (int i = 0; i < 5; i++) {
            redissonLimitManager.doRateLimit(userId);
            System.out.println("成功");
        }
    }
}