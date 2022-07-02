package com.observer;

public interface Publisher {
    public void subscribers(Subscriber o);
    public void unsubscribe(Subscriber o);
    public void notifySubscriber();
}
