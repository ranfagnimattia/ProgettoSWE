package com.company;

public class FantinoVelocità extends Fantino{

    public FantinoVelocità(Integer id, String nome, String cognome) {
        super(id, nome, cognome);
    }

    @Override
    public void Cavalca(Cavallo c) {
        Scatta(c);
    }

    //Implement
    private void Scatta(Cavallo c) {

    }
}

