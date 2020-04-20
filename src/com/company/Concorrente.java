package com.company;

public abstract class Concorrente extends Subject{
    protected Integer id;
    protected Cavallo cavallo;
    protected Fantino fantino;
    protected Boolean fineCorsa;


    public Concorrente(Integer id,Cavallo cavallo, Fantino fantino) {
        this.id=id;
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

    public Integer getId() {return id; }
}
