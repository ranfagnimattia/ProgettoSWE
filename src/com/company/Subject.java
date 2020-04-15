package com.company;

import java.util.ArrayList;

public abstract class Subject {
    public ArrayList<Observer> observers;
    public void addObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void Notify() {
        for(Observer o:observers)
            o.Update();
    }
}
