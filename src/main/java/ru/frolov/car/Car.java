package ru.frolov.car;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 3l;

    private Engine engine;
    private Wheel aWhile;

    public Car(Engine engine, Wheel aWhile) {
        this.engine = engine;
        this.aWhile = aWhile;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getaWhile() {
        return aWhile;
    }

    public void setaWhile(Wheel aWhile) {
        this.aWhile = aWhile;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", aWhile=" + aWhile +
                '}';
    }
}
