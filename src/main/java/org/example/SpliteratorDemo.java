package org.example;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public void split() {
        ArrayList<Double> spl = new ArrayList<>();
                spl.add(1.0);
        spl.add(2.0);
        spl.add(3.0);
        spl.add(4.0);
        spl.add(5.0);
        spl.add(6.0);
        System.out.print("Содержимое списочного массива spl ");
        Spliterator<Double> spliter = spl.spliterator();
        while (spliter.tryAdvance((n)-> System.out.println(n)));
        System.out.println();
        spliter = spl.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spliter.tryAdvance((n)-> sqrs.add(Math.sqrt(n))));
        System.out.println("Содержимое списочного массива sqrt ");
        spliter = sqrs.spliterator();
        spliter.forEachRemaining((n) -> System.out.println(n));



    }
}
