package com.company.u3;

public class Uebung3 {

    public static void main(String[] args) {
        int i = 0;
        int j = 99;
        int result = plus();
        System.out.println(result);
    }

    public static int plus(int i, int j) {
        return i+j;
    }

    public static int plus() {
        int i = 0;
        int j = 99;
        return i+j;
    }

    public static String plus(String input) {
        return input;
    }

    public static void plus(int i) {
        System.out.println(i);
    }


}
