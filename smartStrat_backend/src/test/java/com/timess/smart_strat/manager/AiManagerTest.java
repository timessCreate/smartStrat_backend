package com.timess.smart_strat.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void invokeTest() {
        String answer = aiManager.Invoke("分析需求:\n" +
                "分析网站用户的增长情况\n" +
                "原始数据:\n" +
                "日期,用户数\n" +
                "1号,100\n" +
                "2号,20\n" +
                "3号,5000");
        System.out.println(answer);
    }
}