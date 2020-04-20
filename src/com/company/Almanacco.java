package com.company;

import java.util.ArrayList;

public class Almanacco extends Observer {
    private ArrayList<Classifica> classifiche;

    public Almanacco() {
        classifiche = new ArrayList<>();
    }

    public ArrayList<Classifica> getClassifiche() {
        return classifiche;
    }

    @Override
    public void Update(Object obj) {
        Classifica clas = ((Classifica)obj);
        classifiche.add(clas);
    }


}
