package com.sanyou.dubbo.provider;

import com.sanyou.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 生产者
 *
 * @author 三友的java日记
 * @date 2024/7/5 22:46
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
