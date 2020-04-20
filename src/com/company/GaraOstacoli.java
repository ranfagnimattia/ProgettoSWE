package com.company;

import java.util.ArrayList;

public class GaraOstacoli extends Gara {
    @Override
    public void avviaGara() {
        System.out.println("Inizio gara di ostacoli!");
        for(Concorrente c: concorrenti) {
            c.Corri();
            if(c.isCompleted())
                classifica.confermaArrivo(c.getId());
        }
    }
}
