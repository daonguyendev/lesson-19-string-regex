package com.codegym.practice01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//    private static final String EMAIL_REGEX =   "^[a-zA-Z0-9].[a-zA-Z0-9\\._%\\+\\-]{0,63}@" +
//                                                "[a-zA-Z0-9\\.\\-]+\\.[a-zA-Z]{2,30}$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
