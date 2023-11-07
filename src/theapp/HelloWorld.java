package theapp;

import mylib.Adder;

class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println("Sum of 6 + 9 = " + Adder.doInt(6, 9));
    }
}