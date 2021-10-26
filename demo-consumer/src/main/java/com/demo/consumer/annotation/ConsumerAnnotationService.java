package com.demo.consumer.annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.provider.annotation.ServiceAnnotation;
import org.springframework.stereotype.Component;

/**
 * 注解方式的service
 */
@Component("annotatedConsumer")
public class ConsumerAnnotationService {

    @Reference
    private ServiceAnnotation providerServiceAnnotation;

    public String doSayHello(String name) {
        return providerServiceAnnotation.sayHello(name);
    }
}
