package com.marinaguskova;

public class Main {
    public static void main(String[] args) {

        byte myByte1 = Byte.MAX_VALUE;
        byte myByte2 = -2;

        short myShort1 = 32765;
        short myShort2 = 3;

        float myFloat = 127.8487f;
        double myDouble = 0.99d;
        int myInt = Integer.MIN_VALUE;


//        Переполнение:

        System.out.println(myByte2 - myByte1);
        System.out.println(myShort1 + myShort2);
        System.out.println(myShort1 * myByte1);

//       Вычисления комбинаций типов данных:

        System.out.println(myInt + myFloat);
        System.out.println(myShort1 / myDouble);
        System.out.println(myByte2 + myDouble / Long.MIN_VALUE);


    }
}