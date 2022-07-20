package com.learn.problem;

public class Subscriber {

   private String channelName;

  public Subscriber(String channelName, YouTubeChannel youTubeChannel) {
    this.channelName = channelName;
    youTubeChannel.addSubscribe(this);
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  @Override
  public String toString() {
    return "Subscriber{" +
            "channelName='" + channelName + '\'' +
            '}';
  }
}
