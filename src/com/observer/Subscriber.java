package com.observer;

import com.observer.Publisher;

public interface Subscriber {
    public void update(Publisher context);
}
