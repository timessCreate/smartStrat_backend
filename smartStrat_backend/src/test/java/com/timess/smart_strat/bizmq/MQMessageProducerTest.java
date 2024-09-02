package com.timess.smart_strat.bizmq;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

@SpringBootTest
class MQMessageProducerTest {

    @Resource
    MQMessageProducer MQMessageProducer;

    @Test
    void sendMessage(){
        MQMessageProducer.sendMessage("这是一条测试数据");
    }
}