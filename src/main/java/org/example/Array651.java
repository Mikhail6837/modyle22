package org.example;

import java.util.*;

public class Array651 {
    public void array651() {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Начальный размер списочного массива =  " + al.size());
        al.add("C");
        al.add("A");
        al.add("D");
        al.add("F");
        al.add("G");
        al.add("E");
        al.add("R");
        al.add(1,"A2");
        System.out.println("Размер списочного массива после ввода = " + al.size());
        System.out.println("Содержимое списочного масссива - " + al);
        al.remove("F");
        al.remove(2);
        System.out.println(" Размер списочного массива после удаления =" + al.size());
        System.out.println("Содержание массива  al :" + al);

    }
}
