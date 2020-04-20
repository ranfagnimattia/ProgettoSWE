package com.company;

public class FantinoOstacoli extends Fantino{

    public FantinoOstacoli(Integer id, String nome, String cognome) {
        super(id, nome, cognome);
    }

    //Implement
    private Integer Salta(Cavallo c) {
        return c.getElevation();
    }
}
