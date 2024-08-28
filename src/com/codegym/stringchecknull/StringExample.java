package com.codegym.stringchecknull;

import java.util.Optional;

public class StringExample {

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        String a = productService.getName();
        //Coding convention 1: maybe have NPE error
//        if (!a.equals("")) {
//            System.out.println("Do not leave product name empty");
//        } else {
//            System.out.println("Continue to do somethings");
//        }

        //Coding convention 2: not have NPE error
//        if (!"".equals(a)) {
//            System.out.println("Do not leave product name empty");
//        } else {
//            System.out.println("Continue to do somethings");
//        }

        //Coding convention 3: not have NPE error
        if (Optional.ofNullable(a).isEmpty()) {
            System.out.println("Do not leave product name empty");
        } else {
            System.out.println("Continue to do somethings");
        }
    }
}
