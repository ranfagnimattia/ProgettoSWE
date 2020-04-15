package com.company;

public class CavalloMezzosangue extends Cavallo{
    private Cavallo padre;
    private Cavallo madre;

    public CavalloMezzosangue(Integer id, Integer resistance, Integer weight, Float speed, Integer elevation, Cavallo padre, Cavallo madre) {
        super(id, resistance, weight, speed, elevation);
        this.padre = padre;
        this.madre = madre;
    }

    public Cavallo getPadre() {
        return padre;
    }

    public Cavallo getMadre() {
        return madre;
    }
}
