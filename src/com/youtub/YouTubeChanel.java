package com.youtub;

import com.observer.Subscriber;
import com.observer.Publisher;
import java.util.ArrayList;

public class YouTubeChanel implements Publisher {

    private final ArrayList<Subscriber> chanelSubscribers;
    private String lastVideoPosted;

    public YouTubeChanel() {
        chanelSubscribers = new ArrayList<>();
        lastVideoPosted = "";
    }

    public String getLastVideoPosted() {
        return lastVideoPosted;
    }

    public void addNewVideo(String title) {
        lastVideoPosted = title;
        notifySubscriber();
        System.out.println("New youtube added to channel!");
    }

    @Override
    public void subscribers(Subscriber o) {
        chanelSubscribers.add(o);
    }

    @Override
    public void unsubscribe(Subscriber o) {
        chanelSubscribers.remove(o);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber suscriptor : chanelSubscribers) {
            suscriptor.update(this);
        }
    }
}
