package com.company;

import java.util.Objects;

public abstract class Cavallo {
    private Integer resistance,weight,elevation, id;
    private Float speed;

    public Cavallo(Integer resistance, Integer weight, Float speed,Integer elevation) {
        this.resistance = resistance;
        this.weight = weight;
        this.speed = speed;
        this.elevation = elevation;
    }

    public Integer getResistance() {
        return resistance;
    }

    public void setResistance(Integer resistance) {
        this.resistance = resistance;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return Objects.equals(((Cavallo) o).id, this.id);
    }

}
