package com.jkli.eurekaserver;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration() //设置启动类 加载配置文件
@WebAppConfiguration
class EurekaServerApplicationTests {

    @Test
    void contextLoads() {
    }

}
