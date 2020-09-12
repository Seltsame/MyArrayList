package test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyArrayList myArray = new MyArrayList();
        for (int i = 0; i < 25; i++) {
            myArray.add(i);
        }
        myArray.add(25);
        for (int i = 0; i < 29; i++) {
            System.out.println(myArray.get(i));
        }


    }
}
