package com.company;

public class PreparazioneGaraOstacoli extends PreparazioneGara {

    public PreparazioneGaraOstacoli(Stalla st,Schedario sc) {
        super(st,sc);
    }

    @Override
    public Gara createGara(int ngiocatori,Almanacco al) {
        GaraOstacoli gara = new GaraOstacoli();
        Integer[] giocatori_classifica = new Integer[ngiocatori];

        for(int i=0;i<ngiocatori;i++) {
            if(st.getCavallo(i) != null && sc.getFantinoOStacoli(i) != null) {
                ConcorrenteOstacoli c = new ConcorrenteOstacoli(i,st.getCavallo(i),sc.getFantinoOStacoli(i));
                gara.addConcorrente(c);
                giocatori_classifica[c.getId()] = 0;
            }
            else
                break;
        }
        Classifica c = new Classifica(giocatori_classifica,al);
        gara.setClassifica(c);
        return gara;
    }
}
