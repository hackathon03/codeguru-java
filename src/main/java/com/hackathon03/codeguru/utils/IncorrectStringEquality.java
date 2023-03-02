package com.hackathon03.codeguru.utils;

public class IncorrectStringEquality {

    public void stringEqualityCheckNoncompliant(String str1, String str2) {
        // Noncompliant: the == operator doesn't compare the contents of the strings.
        if(str1 == str2) {
            System.out.println("The strings are equal.");
        }
    }

    public void stringEqualityCheckCompliant(String string1, String string2) {
        // Compliant: the equals() method compares the contents of the strings.
        if(string1.equals(string2)) {
            System.out.println("The strings are equal.");
        }
    }
}
