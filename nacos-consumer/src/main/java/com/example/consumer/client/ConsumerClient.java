package com.example.consumer.client;

import com.common.intr.DemoInterface;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ConsumerClient {

    @DubboReference(version = "1.0", url = "dubbo://127.0.0.1:20880")
    private DemoInterface demoInterface;


    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            System.out.println(demoInterface.sayName("小马哥（mercyblitz）"));
        }
    }
}
