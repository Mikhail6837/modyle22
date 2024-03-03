package dz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Zadacha2 {
    public void zadacha () {
        ArrayList<Integer> zd = new ArrayList<>();
        zd.add(3);
        zd.add(6);
        zd.add(4);
        zd.add(22);
        zd.add(8);
        zd.add(2);
        Set<Integer> zdd = new HashSet<>(zd);

        if (zd.size() != zdd.size() ) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
