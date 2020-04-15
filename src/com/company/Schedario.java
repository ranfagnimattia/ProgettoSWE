package com.company;

import java.util.ArrayList;

public class Schedario {
    private ArrayList<Fantino> fantini;

    public Schedario() {
        this.fantini = new ArrayList<>();
    }

    public void addFantino(Fantino f) {
        if(!fantini.contains(f))
            fantini.add(f);
        //else exception
    }
    public void removeFantino(Fantino f) {
        fantini.remove(f);
    }
}
