package com.demo.provider.Impl;

import com.demo.provider.xml.service;

public class ServiceImpl implements service {
    @Override
    public String sayHello(String msg) {
        return msg;
    }
}
