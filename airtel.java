package com.netconnection.demo;

import org.springframework.stereotype.Component;

@Component("airtel")
public class airtel implements Internet{
    @Override
    public void con() {
        System.out.println("Connect to airtel");
    }
}
