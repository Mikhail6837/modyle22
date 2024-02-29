package org.example;
import java.util.*;

public class TreeSetDemo {
    public void treeset() {
        TreeSet <String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("F");
        ts.add("A");
        ts.add("V");
        ts.add("B");
        ts.add("R");
        System.out.println(ts.subSet("A","C"));
    }


}
