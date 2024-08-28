package com.codegym.introstring;

public class StringTest {

    public static void main(String[] args) {
//        String a = "Tèo";
//        String b = "Tèo";
//        System.out.println(a == b);//compare memory address -> true
//        System.out.println(a.equals(b));//compare value -> true
//
//        char c = a.charAt(2);//"o"
//        String d = String.valueOf(a.charAt(2)).concat("e");//"o"
//        System.out.println(a);
//        System.out.println(c + "m");
//        System.out.println(d + " oe");

        String name = "Tôn";
        String name2 = "Tôn";
        String name3 = new String("Tôn");
        System.out.println(name == name2);//true
        System.out.println(name == name3);//false
    }
}
