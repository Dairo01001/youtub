package com.youtub;

import com.observer.Subscriber;
import com.observer.Publisher;

public class ConcreteSubscriber implements Subscriber {

    @Override
    public void update(Publisher obs) {
        System.out.println("New video posted!");
        System.out.println(((YouTubeChanel) obs).getLastVideoPosted());

    }
}
