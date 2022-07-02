package com.main;

import com.youtub.ConcreteSubscriber;
import com.youtub.YouTubeChanel;


public class Main {
    public static void main(String[] args) {
        YouTubeChanel chanel = new YouTubeChanel();
        
        ConcreteSubscriber subscriber = new ConcreteSubscriber();
        ConcreteSubscriber subscriber1 = new ConcreteSubscriber();
        
        chanel.subscribers(subscriber);
        chanel.subscribers(subscriber1);
        
        chanel.addNewVideo("Que Pasa!");
    }
}
