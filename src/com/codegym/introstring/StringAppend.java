package com.codegym.introstring;

public class StringAppend {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Welcome to ");
        String s2 = "CodeGym";
        String s3 = s1.append(s2).toString();
        System.out.println(s3);
    }
}
