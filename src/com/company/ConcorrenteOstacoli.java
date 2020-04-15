package com.company;

public class ConcorrenteOstacoli extends Concorrente {
    public ConcorrenteOstacoli(Cavallo cavallo, Fantino fantino, PreparazioneGara pr) {
        super(cavallo, fantino, pr);
    }

    private void Salta() {

    }

    private void Trotta(){

    }


    @Override
    public void Corri() {
        fineCorsa=true;
        Notify();

    }
}
