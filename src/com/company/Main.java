package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 20;
        int randomAge =  a + (int) (Math.random() *b);

        System.out.println("randomAge "+ randomAge);
//        System.out.println("25" + Math.random());
//        System.out.println("30" + Math.random());
    }
}
