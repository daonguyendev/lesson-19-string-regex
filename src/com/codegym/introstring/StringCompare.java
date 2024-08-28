package com.codegym.introstring;

public class StringCompare {

    public static void main(String[] args) {
//        String s1 = "Welcome to Java";
//        String s2 = "Programming is fun";
//        String s3 = "Welcome to Java";
//
//        String s12 = "b";//98
//        String s34 = "B";//66
//        System.out.println(s12.compareTo(s34));//32
//
//        System.out.println(s1 == s2);//true
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s1.equals(s3));//true
//
//        // 7 -> range of s1, s2 through ascii code
//        System.out.println(s1.compareTo(s2));
//
//        System.out.println(s1.compareTo(s3));//true
//
//        String s4 = s2.substring(12, 14);
//        System.out.println(s4);
//
//        String s5 = new String("Welcome to Java");
//        System.out.println(s1 == s5);//false -> create 2 different memories
//        System.out.println(s1.equals(s5));//true -> create 2 different memories

//        String s1 = "Dao";
//        String s2 = "Do";
//        Integer s3 = s1.compareTo(s2);
//        System.out.println(s3);

        String a = "abc";
        String b = new String("abc");
        System.out.println(a == b);//F

        a = "def";
        b = "def";
        System.out.println(a == b);//T

        b = new String("def");
        System.out.println(a == b);//F
    }
}
