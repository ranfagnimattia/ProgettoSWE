package com.company;

public class PreparazioneGaraVelocità extends PreparazioneGara {

    public PreparazioneGaraVelocità(Stalla st,Schedario sc) {
        super(st,sc);
    }

    @Override
    public Gara createGara(int ngiocatori) {
        GaraVelocità gara = new GaraVelocità();
        Integer[] giocatori_classifica = new Integer[ngiocatori];

        for(int i=0;i<ngiocatori;i++) {
            if(st.getCavallo(i) != null && sc.getFantinoOStacoli(i) != null) {
                ConcorrenteVelocità c = new ConcorrenteVelocità(i,st.getCavallo(i),sc.getFantinoOStacoli(i));
                gara.addConcorrente(c);
                giocatori_classifica[c.getId()] = 0;
            }
            else
                break;
        }
        Classifica c = new Classifica(giocatori_classifica);
        gara.setClassifica(c);
        return gara;
    }
}
