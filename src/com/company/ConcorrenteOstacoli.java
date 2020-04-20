package com.company;

public class ConcorrenteOstacoli extends Concorrente {
    public ConcorrenteOstacoli(Integer id,Cavallo cavallo, Fantino fantino) {
        super(id,cavallo, fantino);
    }

    private void Salta() {

    }

    private void Trotta(){

    }


    @Override
    public void Corri() {
        Trotta();
        Salta();
        fineCorsa=true;
    }
}
