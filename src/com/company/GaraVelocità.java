package com.company;

public class GaraVelocità extends PreparazioneGara {

    public GaraVelocità(Schedario sc, Stalla st) {
        super(sc, st);
    }

    @Override
    public void PreparaConcorrenti(int ngiocatori) {
        for(int i=0;i<ngiocatori;i++) {
            if(st.getCavallo(i) != null && sc.getFantinoVelocità(i) != null) {
                ConcorrenteVelocità c = new ConcorrenteVelocità(st.getCavallo(i),sc.getFantinoVelocità(i),this);
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

    @Override
    public void Update() {
        super.Update();
    }
}
