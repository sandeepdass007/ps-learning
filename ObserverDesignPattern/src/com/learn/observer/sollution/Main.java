package com.learn.observer.sollution;

public class Main {
    public static void main(String[] args) {
    PostOffice postOffice = new PostOffice();
    Person p1 = new Person("manoj-1");
    Person p2 = new Person("manoj-2");
    Person p3 = new Person("manoj-3");



    Mail mail = new Mail("receiverName-1","Rajasthan","This is for testing...");

    postOffice.attach(p1);
    postOffice.attach(p2);
    postOffice.attach(p3);
    postOffice.addMail(mail);

    }

}
