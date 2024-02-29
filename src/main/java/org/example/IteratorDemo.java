package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public void iter() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("D");
        al.add("F");
        al.add("G");
        al.add("E");
        al.add("R");
        System.out.print("Исходный массив al " );
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print( element + " ");
        }
        System.out.println();


        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
            System.out.print( element + "ввв ");

        }

            System.out.print("Измененное содержимое массива al ");
            itr = al.iterator();
            while(itr.hasNext()) {
                String element = itr.next();
                System.out.print( element + " ");
            }
            System.out.println();
            System.out.print( "А теперь в обратном порядке " );

            while (litr.hasPrevious()) {
                String element = litr.previous();
                System.out.print (element + " ");

            }

            System.out.println();

    }
}
