package ru.eldarov.java.core;

public class Main {

    public static void main(String[] args) {


        String[][] array =
                {{"1","абс","1","1"},
                        {"1","1","алк","1"},
                        {"1","фва","1","1"},
                        {"1","вап","1","вап"}};









        Lesson2 hw = new Lesson2();


        try {
            System.out.println(hw.sumArrayElements(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}