package com.company;

import java.util.ArrayList;

public abstract class Gara {
    protected ArrayList<Concorrente> concorrenti;
    protected Classifica classifica;


    public void addConcorrente(Concorrente concorrente) {
        if(!concorrenti.contains(concorrente))
            concorrenti.add(concorrente);
    }

    public void setClassifica(Classifica classifica) {
        this.classifica = classifica;
    }

    public abstract void avviaGara();
}
