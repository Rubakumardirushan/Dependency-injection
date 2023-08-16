package com.netconnection.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Home {
    Home(){
        System.out.println("home");
    }
    private String owner;
    private  int doorNumb;
    @Autowired
    @Qualifier("bsnl")
    private Internet moderm;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoorNumb() {
        return doorNumb;
    }

    public void setDoorNumb(int doorNumb) {
        this.doorNumb = doorNumb;
    }
    public void  connect(){
        moderm.con();
        System.out.println("connnect passs");
    }
}
