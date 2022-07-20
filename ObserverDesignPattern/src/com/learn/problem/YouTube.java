package com.learn.problem;

public class YouTube {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel("Manoj-java-channel");

        Subscriber s1=new Subscriber("s-1",youTubeChannel);
        Subscriber s2=new Subscriber("s-2",youTubeChannel);
        Subscriber s3=new Subscriber("s-3",youTubeChannel);

        youTubeChannel.uploadVideo();
        youTubeChannel.removeSubscribe(s1);
        System.out.println("-----------------------------");
        youTubeChannel.uploadDeleted();

    }
}
