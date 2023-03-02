package com.hackathon03.codeguru.utils;

import java.util.Map;

public class InEfficientMapEntryIteration {
    public void iterateOnKeySetUsingValuesNoncompliant(Map<String, String> map) {
        // Noncompliant: iterate the set of keys and get the value of each key from the map.
        for (String name : map.keySet())
            System.out.println("Value: " + map.get(name));
    }


    public void iterateOnEntrySetCompliant(Map<String, String> map) {
        // Compliant: iterate the set of map entries.
        for (Map.Entry<String,String> entry : map.entrySet())
            System.out.println("Key: " + entry.getKey() +
                    ", Value: " + entry.getValue());
    }

}
