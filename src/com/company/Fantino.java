package com.company;

public abstract class Fantino {
    private Integer id;
    private String nome,cognome;

    public Fantino(Integer id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }


    public abstract void Cavalca(Cavallo c);
}
