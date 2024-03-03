package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapsDemo {
    public void hash() {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Djon Mik", new Double(333.32));
        hm.put("Birukov Nik", new Double(9933.32));
        hm.put("Kastorny Vik", new Double(21.2));
        hm.put("Sanya And", new Double(23.32));
        hm.put("Ded Nak", new Double(2222.32));

        Set< Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double > me : set) {
            System.out.println(me.getKey() + " : ");
            System.out.println(me.getValue() );
        }
    double balance = hm.get("Birukov Nik");
    hm.put("Birukov Nik", balance + 1000.0);
    System.out.println("Новый остаток у Бирюкова = " + hm.get("Birukov Nik"));

    }
}
