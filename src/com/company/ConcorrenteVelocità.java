package com.company;

public class ConcorrenteVelocità extends Concorrente {
    public ConcorrenteVelocità(Integer id,Cavallo cavallo, Fantino fantino) {
        super(id,cavallo, fantino);
    }

    @Override
    public void Corri() {
        Scatta();
        fineCorsa=true;
    }

    private void Scatta() {

    }
}
