package com.alsheuskaya.task.tasksix;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Thing> bestThings;

    private double maxWeight;

    private double bestPrice;

    public Backpack(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    private double calculateWeigth(List<Thing> things) {
        double sumWeight = 0;
        for (Thing thing : things) {
            sumWeight += thing.getWeight();
        }
        return sumWeight;
    }

    private double calculatePrice(List<Thing> things) {
        double sumPrice = 0;
        for (Thing thing : things) {
            sumPrice += thing.getPrice();
        }
        return sumPrice;
    }

    private void CheckSet(List<Thing> things) {
        if (bestThings == null) {
            if (calculateWeigth(things) <= maxWeight) {
                bestThings = things;
                bestPrice = calculatePrice(things);
            }
        } else {
            if (calculateWeigth(things) <= maxWeight && calculatePrice(things) > bestPrice) {
                bestThings = things;
                bestPrice = calculatePrice(things);
            }
        }
    }

    private void MakeAllSets(List<Thing> things) {
        if (things.size() > 0)
            CheckSet(things);

        for (int i = 0; i < things.size(); i++) {
            List<Thing> newSet = new ArrayList<>(things);

            newSet.remove(i);

            MakeAllSets(newSet);
        }
    }

    private List<Thing> getBestSet() {
        return bestThings;
    }

    public static void showBestSet(List<Thing> things, double maxWeight) {
        Backpack backpack = new Backpack(maxWeight);
        backpack.MakeAllSets(things);
        System.out.println(backpack.getBestSet());
    }
}
