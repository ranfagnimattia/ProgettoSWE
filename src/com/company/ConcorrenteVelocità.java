package com.company;

public class ConcorrenteVelocità extends Concorrente {
    public ConcorrenteVelocità(Cavallo cavallo, Fantino fantino,PreparazioneGara pr) {
        super(cavallo, fantino,pr);
    }

    @Override
    public void Corri() {
        fineCorsa=true;
        Notify();
    }

    private void Trotta() {

    }
}
