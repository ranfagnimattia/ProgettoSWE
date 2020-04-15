package com.company;

public abstract class Concorrente extends Subject{
    protected Cavallo cavallo;
    protected Fantino fantino;
    protected Boolean fineCorsa;


    public Concorrente(Cavallo cavallo, Fantino fantino,PreparazioneGara observer) {
        super.addObserver(observer);
        this.cavallo = cavallo;
        this.fantino = fantino;
        this.fineCorsa=false;
    }

    public abstract void Corri();

    public Cavallo getCavallo() {
        return cavallo;
    }

    public Fantino getFantino() {
        return fantino;
    }

    public Boolean isCompleted() {
        return fineCorsa;
    }
}
