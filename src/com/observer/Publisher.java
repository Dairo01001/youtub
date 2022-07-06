package com.observer;

public interface Publisher {

    public void subscribers(Subscriber s);    
    public void unsubscribe(Subscriber s);
    public void notifySubscribers();
}
