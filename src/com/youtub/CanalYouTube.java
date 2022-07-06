package com.youtub;

import com.observer.Subscriber;
import com.observer.Publisher;
import java.util.ArrayList;

public class CanalYouTube implements Publisher {

    private final ArrayList<Subscriber> chanelSubscribers;
    private String lastVideoPosted;

    public CanalYouTube() {
        chanelSubscribers = new ArrayList<>();
        lastVideoPosted = "";
    }

    public String getLastVideoPosted() {
        return lastVideoPosted;
    }

    public void addNewVideo(String title) {
        lastVideoPosted = title;
        System.out.println("Nuevo video agregado! ");
        notifySubscribers();
    }

    @Override
    public void subscribers(Subscriber s) {
        chanelSubscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        chanelSubscribers.remove(s);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber suscriptor : chanelSubscribers) {
            suscriptor.update(this);
        }
    }
}
