package com.codegym.introstring;

public class StringOverview {

    public static void main(String[] args) {
        String s1 = " Welcome to c10 Class ";
        String s2 = "Hello";

        System.out.println(s1);
        System.out.println(s1.length());//22
        String s3 = s1.trim();
        System.out.println(s3);
        System.out.println(s3.length());//20

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.concat(s2).length());
    }
}
