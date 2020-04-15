package com.company;

public class CavalloPurosangue extends Cavallo{
    private int burst;

    public CavalloPurosangue(Integer id,Integer resistance, Integer weight, Float speed, Integer elevation, int burst) {
        super(id,resistance, weight, speed, elevation);
        this.burst = burst;
    }

    public int getBurst() {
        return burst;
    }

    public void setBurst(int burst) {
        this.burst = burst;
    }
}
