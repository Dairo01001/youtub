package com.youtub;

import com.observer.Subscriber;
import com.observer.Publisher;

public class Subscriptor implements Subscriber {

    @Override
    public void update(Publisher context) {
        System.out.println("Nuevo video subido!");
        System.out.println(((CanalYouTube) context).getLastVideoPosted());
    }
}
