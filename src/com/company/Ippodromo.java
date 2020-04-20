package com.company;

public class Ippodromo {
    private PreparazioneGara garaBuilder;

    public Gara getGara() {
        return this.garaBuilder.getGara();
    }

    public void constructGara() {
        this.garaBuilder.buildConcorrenti();
        this.garaBuilder.buildClassifica();
    }
}
