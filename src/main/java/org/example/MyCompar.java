package org.example;

import java.util.Comparator;

public class MyCompar implements Comparator<String> {
    public int compare(String a, String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return aStr.compareTo(bStr);
    }

}
