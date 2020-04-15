package com.company;

import java.util.ArrayList;

public class Stalla {
    private ArrayList<Cavallo> cavalli;
    private Integer size;

    public Stalla(Integer size) {
        this.size = size;
        this.cavalli = new ArrayList<Cavallo>(size);
    }

    public Cavallo getCavallo(int i) {
        return cavalli.get(i);
    }

    public Integer getSize() {
        return size;
    }

    public void addCavallo(Cavallo c) {
        if(!cavalli.contains(c))
            cavalli.add(c);
        //else exception
    }
    public void removeCavallo(Cavallo c) {
        cavalli.remove(c);
    }
}
