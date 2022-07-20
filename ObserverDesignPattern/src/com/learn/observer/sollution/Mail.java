package com.learn.observer.sollution;

public class Mail {
    String receiverName;
    String address;
    String content;


    public Mail(String receiverName, String address, String content) {
        this.receiverName = receiverName;
        this.address = address;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "receiverName='" + receiverName + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
