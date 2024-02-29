package org.example;

import java.util.ArrayDeque;

public class ArrayDequedemo {
    public void arraydeq() {
        ArrayDeque<String> b = new ArrayDeque<String>();
        b.add("A");
        b.add("B");
        b.add("R");
        b.add("C");
        b.add("D");
        System.out.println(b);
        System.out.println("Извлечение из стека :");
        while (b.peek() != null)
            System.out.println(b.pop() );

        System.out.println(b);



    }
}
