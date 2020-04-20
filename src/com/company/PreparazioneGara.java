package com.company;

public abstract class PreparazioneGara {
    public abstract Gara createGara(int nconcorrenti,Almanacco al);
    protected Stalla st;
    protected Schedario sc;

    public PreparazioneGara(Stalla st, Schedario sc) {
        this.st = st;
        this.sc = sc;
    }
}
