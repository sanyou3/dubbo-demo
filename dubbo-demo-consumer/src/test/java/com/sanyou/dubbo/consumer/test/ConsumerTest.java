package com.sanyou.dubbo.consumer.test;

import com.sanyou.dubbo.api.DemoService;
import com.sanyou.dubbo.consumer.ConsumerApplication;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 消费者测试
 *
 * @author 三友的java日记
 * @date 2024/7/5 23:41
 */
@SpringBootTest(classes = ConsumerApplication.class)
@RunWith(SpringRunner.class)
public class ConsumerTest {

    @DubboReference(
    )
    private DemoService demoService;

    @Test
    public void testSayHello() {
        String result = demoService.sayHello("三友的java日记");
        System.out.println(result);
    }

}
