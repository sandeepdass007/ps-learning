package com.learn.observer.sollution;

import com.learn.observer.Observer;
import com.learn.observer.Subject;

import java.util.ArrayList;

public class PostOffice implements Subject {

    private ArrayList<Mail> allMail= new ArrayList<>();

    private ArrayList<Observer> observers= new ArrayList<>();


    public PostOffice(){

    }

    public void addMail(Mail m){
        allMail.add(m);
        notifyUpdate();
    }
    public ArrayList getState(){
        return allMail;
    }

    @Override
    public void attach(Observer o) {
           observers.add(o);
    }

    @Override
    public void detach(Observer o) {
          observers.remove(o);
    }

    @Override
    public void notifyUpdate() {
      for(Observer observer:observers){
          observer.update(this);
      }
    }
}
