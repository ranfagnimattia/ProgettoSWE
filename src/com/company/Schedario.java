package com.company;

import java.util.ArrayList;

public class Schedario {
    private ArrayList<Fantino> fantiniOStacoli;
    private ArrayList<Fantino> fantiniVelocità;

    public Schedario() {
        this.fantiniOStacoli = new ArrayList<>();
        this.fantiniVelocità = new ArrayList<>();
    }

    public void addFantinoOstacoli(FantinoOstacoli f) {
        if(!fantiniOStacoli.contains(f))
            fantiniOStacoli.add(f);
        //else exception
    }

    public void addFantinoVelocità(FantinoVelocità f) {
        if(!fantiniVelocità.contains(f))
            fantiniVelocità.add(f);
        //else exception
    }

    public void removeFantinoOstacoli(Fantino f) {
        fantiniOStacoli.remove(f);
    }

    public void removeFantinoVelocità(Fantino f) {
        fantiniVelocità.remove(f);
    }


    public Fantino getFantinoOStacoli(int i) {
            return fantiniOStacoli.get(i);
    }

    public Fantino getFantinoVelocità(int i) {
        return fantiniVelocità.get(i);
    }
}
