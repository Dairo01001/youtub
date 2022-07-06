package com.youtub;

import com.observer.Observador;
import com.observer.Sujeto;

public class Subscriptor implements Observador {

    @Override
    public void actualizar(Sujeto contexto) {
        System.out.println("Nuevo video subido!");
        System.out.println(((CanalYouTube) contexto).getUltimoVideoSubido());
    }
}
