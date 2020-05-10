package com.alsheuskaya.task.tasksix;

import java.util.Objects;
import java.util.StringJoiner;

public class Thing {
    private double price;
    private double weight;

    public Thing(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Double.compare(thing.price, price) == 0 &&
                Double.compare(thing.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Thing.class.getSimpleName() + "[", "]")
                .add("price=" + price)
                .add("weight=" + weight)
                .toString();
    }
}
