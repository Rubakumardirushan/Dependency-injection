package com.netconnection.demo;

import org.springframework.stereotype.Component;

@Component("bsnl")
public class BSNL implements Internet{
    @Override
    public void con() {
        System.out.println("connect to bsnl");
    }
}
