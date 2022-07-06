package com.observer;

public interface Sujeto {

    public void adscribir(Observador o);    
    public void quitar(Observador o);
    public void notificar();
}
