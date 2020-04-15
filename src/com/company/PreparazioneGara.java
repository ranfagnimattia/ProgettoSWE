package com.company;


import java.util.ArrayList;

public abstract class PreparazioneGara extends Observer{
    protected Schedario sc;
    protected Stalla st;
    private Classifica clas;
    protected ArrayList<Concorrente> concorrenti;
    public abstract void PreparaConcorrenti(int ngiocatori);
    public abstract void AvviaGara();

    public PreparazioneGara(Schedario sc, Stalla st) {
        this.sc = sc;
        this.st = st;
        this.clas = new Classifica();
    }


    @Override
    public void Update() {
        for(Concorrente c:concorrenti) {
            if(c.isCompleted()){
                clas.aggiornaClassifica(c);
                concorrenti.remove(c);
            }
        }
    }
}
