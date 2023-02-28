package com.hackathon03.codeguru.utils;

public class MissingStringPositionCheck {

    public void checkSubStringNoncompliant(String sampleString) {
        final String sampleSubstring = "sample";
        final int index = sampleString.lastIndexOf(sampleSubstring);
        // Noncompliant: it is not checked if substring is part of the string.
        final String subString = sampleString.substring(0, index);
    }


    public void checkSubStringCompliant(String sampleString) {
        final String sampleSubstring = "sample";
        final int index = sampleString.lastIndexOf(sampleSubstring);
        // Compliant: checked if substring is part of the string.
        final String subString = index > 0 ? sampleString.substring(0, index) : sampleString;
    }

}
