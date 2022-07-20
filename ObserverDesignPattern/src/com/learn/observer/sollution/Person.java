package com.learn.observer.sollution;

import com.learn.observer.Observer;

import java.util.ArrayList;

public class Person implements Observer {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(Object obj) {
       if(obj instanceof PostOffice){
           ArrayList<Mail> mailList = ((PostOffice) obj).getState();
           for(Mail mail : mailList){
                   System.out.println("Hello , "+name +" : "+ mail.content);
           }
       }

    }
}
