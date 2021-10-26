package com.demo.provider.annotation.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.provider.annotation.ServiceAnnotation;


@Service(timeout = 5000)
public class ServiceAnnotationImpl implements ServiceAnnotation {
    @Override
    public String sayHello(String msg) {
        return msg;
    }
}
