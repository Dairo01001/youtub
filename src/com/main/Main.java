package com.main;

import com.youtub.Subscriptor;
import com.youtub.CanalYouTube;


public class Main {
    
    public static void main(String[] args) {
        
        CanalYouTube canal = new CanalYouTube();
        
        Subscriptor subscriptor = new Subscriptor();
        Subscriptor subscriptor1 = new Subscriptor();
        
        canal.adscribir(subscriptor);
        canal.adscribir(subscriptor1);
        
        canal.agregarNuevoVideo("Patron Observer!");
    }
}
