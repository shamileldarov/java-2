package ru.eldarov.java.core;

import java.awt.*;
import java.util.Random;

public class Main {
    public static <Actions, Barrier> void main(String[] args) {


        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(5);
        int heigth = rand.nextInt(5);
        actions[0] = new Human("Кеша", distance, heigth);

        distance = rand.nextInt(5);
        heigth = rand.nextInt(5);
        actions[1] = new Robot("obe 1 kenobe", distance, heigth);

        distance = rand.nextInt(5);
        heigth = rand.nextInt(5);
        actions[2] = new Cat("Марфа", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Road " + i, distance);
            } else {
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {



                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Молодец!");
            } else {
                System.out.println("Увы, но не сегодня!!");
            }
        }
    }
}
