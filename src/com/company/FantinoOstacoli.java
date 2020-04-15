package com.company;

public class FantinoOstacoli extends Fantino{

    public FantinoOstacoli(Integer id, String nome, String cognome) {
        super(id, nome, cognome);
    }

    @Override
    public void Cavalca(Cavallo c) {
        Salta(c);
    }

    //Implement
    private Integer Salta(Cavallo c) {
        return c.getElevation();
    }
}
