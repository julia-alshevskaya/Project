package com.alsheuskaya.task.tasksix;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Thing> things = new ArrayList<>();
        things.add(new Thing(5, 2));
        things.add(new Thing(7, 3));
        things.add(new Thing(8, 1));
        Backpack.showBestSet(things,5);
    }
}
