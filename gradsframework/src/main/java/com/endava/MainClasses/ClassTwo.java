package com.endava.MainClasses;

public class ClassTwo {

    public static Integer factorial(Integer n) {
        Integer fact = 1;
        if (n == 0 || n == 1)
            fact = 1;
        for (Integer i = 2; i <= n; i++) {
            fact = i * fact;
        }
        return fact;
    }

    public static String getString(String encodedString){
        encodedString = encodedString.replace(".", "a")
                                    .replace(",","e")
                                    .replace("/","i")
                                    .replace(":","o")
                                    .replace(";","u");
        return encodedString;
    }
}
