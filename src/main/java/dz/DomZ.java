package dz;

import java.util.ArrayList;
import java.util.ListIterator;

public class DomZ {
    public void domashka(){
        ArrayList<Integer> dz = new ArrayList<>();
        dz.add(7);
        dz.add(8);
        dz.add(15);
        dz.add(16);
        dz.add(1);
        dz.add(15);


        ListIterator<Integer> litr = dz.listIterator();

        while (litr.hasNext()) {
            Integer element = litr.next();
            int outerIndex = litr.previousIndex();
            ListIterator<Integer> nextier = dz.listIterator(litr.nextIndex());

            while (nextier.hasNext()) {

                Integer nextelement = nextier.next();
                int innerIndex = nextier.previousIndex();
                 Integer sum = element + nextelement;
                if( sum == 23) {
                    System.out.println("Индексы " + outerIndex + " и " + innerIndex);
                }
            }
        }
    }
}
