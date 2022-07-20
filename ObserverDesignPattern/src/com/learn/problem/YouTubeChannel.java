package com.learn.problem;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    List<Subscriber> subscriberList = new ArrayList<>();

    private String channelName;
    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void addSubscribe(Subscriber subscriber){
        this.subscriberList.add(subscriber);
    }

    public void removeSubscribe(Subscriber subscriber){
        this.subscriberList.remove(subscriber);
    }

    public void notifyAllObservers(String subject){
        for (Subscriber subscriber : subscriberList) {
            System.out.println("Hi , Dear : "+ subscriber.getChannelName() + " .You have new notification -" +subject +" From "+this.channelName);
        }
    }
    public void uploadVideo(){
        notifyAllObservers("Video Uploaded");
    }

    public void uploadDeleted(){
        notifyAllObservers("Video Deleted");
    }

    @Override
    public String toString() {
        return "YouTubeChannel{" +
                "subscriberList=" + subscriberList +
                ", title='" + channelName + '\'' +
                '}';
    }
}
