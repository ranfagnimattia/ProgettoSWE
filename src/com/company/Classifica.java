package com.company;

import java.util.Vector;

//SERVE PROXY PER ACCEDERE A CLASSIFICA!
public class Classifica {
    private Vector<Concorrente> posizioni;

    public Classifica() {
        posizioni = new Vector<Concorrente>();
    }

    public Vector<Concorrente> getPosizioni() {
        return posizioni;
    }

    public void aggiornaClassifica(Concorrente c) {
        if(!posizioni.contains(c))
            posizioni.add(c);
    }

}
