package com.company;

public class Classifica extends Subject{
    private Integer[] posizioni;
    private Integer posizioneattuale;

    public Classifica(Integer[] posizioni, Almanacco al) {
        this.addObserver(al);
        this.posizioni = new Integer[posizioni.length];
        System.arraycopy(posizioni,0,this.posizioni,0,posizioni.length-1);
        posizioneattuale=0;
    }

    public Integer[] getPosizioni() {
        return posizioni;
    }

    public Integer getPosizioneattuale() {
        return posizioneattuale;
    }

    public void confermaArrivo(Integer giocatore) {
        if(giocatore>=0 && giocatore<posizioni.length) {
            posizioneattuale++;
            posizioni[giocatore]=posizioneattuale;
            if(posizioneattuale == posizioni.length)
                Notify(this);
        }
    }
}
