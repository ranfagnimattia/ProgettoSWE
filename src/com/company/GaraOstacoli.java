package com.company;

public class GaraOstacoli extends PreparazioneGara {
    public GaraOstacoli(Schedario sc, Stalla st) {
        super(sc, st);
    }

    @Override
    public void PreparaConcorrenti(int ngiocatori) {
        for(int i=0;i<ngiocatori;i++) {
            if(st.getCavallo(i) != null && sc.getFantinoOStacoli(i) != null) {
                ConcorrenteOstacoli c = new ConcorrenteOstacoli(st.getCavallo(i),sc.getFantinoOStacoli(i),this);
                concorrenti.add(c);
            }
            else
                break;
        }
    }

    @Override
    public void AvviaGara() {
        for(Concorrente c:concorrenti)
            c.Corri();
    }

}
