package com.company;

public class GaraVelocità extends Gara {
    @Override
    public void avviaGara() {
        System.out.println("Inizio gara di velocità!");
        for(Concorrente c: concorrenti) {
            c.Corri();
            if(c.isCompleted())
                classifica.confermaArrivo(c.getId());
        }
    }
}
