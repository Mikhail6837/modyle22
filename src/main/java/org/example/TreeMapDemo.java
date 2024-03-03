package org.example;

import java.util.*;

public class TreeMapDemo {
    public void treemap() {
        TCompar com = new TCompar();
        Comparator<String> compfirst = com.thenComparing(new CompTheyFirstName());
        TreeMap<String, Double> hm = new TreeMap<>(compfirst);
        hm.put("Djon Mik", new Double(333.32));
        hm.put("Birukov Nik", new Double(9933.32));
        hm.put("Kastorny Vik", new Double(21.2));
        hm.put("Sanya Ander", new Double(23.32));
        hm.put("Ded Nak", new Double(2222.32));
        hm.put("Sanya And", new Double(2222.32));

        Set< Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double > me : set) {
            System.out.println(me.getKey() + " : ");
            System.out.println(me.getValue() );
        }
        System.out.println();

        double balance = hm.get("Birukov Nik");
        hm.put("Birukov Nik", balance + 1000.0);
        System.out.println("Новый остаток у Бирюкова = " + hm.get("Birukov Nik"));

    }
}



