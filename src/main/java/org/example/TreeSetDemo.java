package org.example;
import java.util.*;

public class TreeSetDemo {
    public void treeset() {
        TreeSet <String> ts = new TreeSet<String>((aStr,bStr) ->aStr.compareTo(bStr));
        ts.add("C");
        ts.add("F");
        ts.add("A");
        ts.add("V");
        ts.add("B");
        ts.add("R");

        for (String element : ts)

        System.out.println(element +  "  ");
    }


}
