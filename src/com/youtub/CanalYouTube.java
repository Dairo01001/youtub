package com.youtub;

import java.util.ArrayList;
import com.observer.Observador;
import com.observer.Sujeto;

public class CanalYouTube implements Sujeto {

    private final ArrayList<Observador> subscriptores;
    private String ultimoVideoSubido;

    public CanalYouTube() {
        subscriptores = new ArrayList<>();
        ultimoVideoSubido = "";
    }

    public String getUltimoVideoSubido() {
        return ultimoVideoSubido;
    }

    public void agregarNuevoVideo(String titulo) {
        ultimoVideoSubido = titulo;
        System.out.println("Nuevo video agregado! ");
        notificar();
    }

    @Override
    public void adscribir(Observador s) {
        subscriptores.add(s);
    }

    @Override
    public void quitar(Observador s) {
        subscriptores.remove(s);
    }

    @Override
    public void notificar() {
        for (Observador suscriptor : subscriptores) {
            suscriptor.actualizar(this);
        }
    }
}
