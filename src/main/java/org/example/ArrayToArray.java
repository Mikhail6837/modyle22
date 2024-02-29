package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArray {
    public void arrayto() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Начальный размер списочного массива =  " + al.size());
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Размер списочного массива после ввода = " + al.size());
        System.out.println("Содержимое списочного масссива - " + al);
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);
        System.out.println("Содержимое ia=  - " + Arrays.toString(ia));
        int sum = 0 ;
        for (int i : ia ) sum += i;

        System.out.println("Summa =  :" + sum);

    }
}
