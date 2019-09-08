package com.telran;

public class Main /*extends Object */ {

    public static void main(String[] args) {

        int a = 0;
        a++; //a = a + 1;

        int b = 1_000_000; //1000000

        Runnable runnable_1 = new Runnable() {

            @Override
            public void run() {

            }
        };

        Runnable runnable_2 = () -> {};

        //Comparator | Comparable
        A a_1 = () -> System.out.println("execute method");
        a_1.method();

        B b_1 = () -> {};
    }
}

interface A {
    public abstract void method();

    //2-20 static methods
    //30 default methods
    //1 regular (abstract) method
    static void method2() {
        System.out.println();
    }
}

interface B {
    default void method_1() {
    }
    abstract void method_2();
}

class StringUtils {

    public static Integer convert(String possibleDigit) {
        try {
            return Integer.parseInt(possibleDigit);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
