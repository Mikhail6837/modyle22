package dz;

import java.util.ArrayList;

public class DomZChat {
    public void domashkaa() {
        ArrayList<Integer> dz = new ArrayList<>();
        dz.add(7);
        dz.add(8);
        dz.add(15);
        dz.add(16);
        dz.add(1);
        dz.add(15);

        int size = dz.size();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                Integer sum = dz.get(i) + dz.get(j);
                if (sum == 23) {
                    System.out.println("Индексы " + i + " и " + j);
                    dz.remove(j);
                    dz.remove(i);
                    size -= 2;  // Уменьшаем размер коллекции на 2 после удаления двух элементов
                    i--;  // Уменьшаем индекс, чтобы не пропустить элемент после удаления
                    break;  // Прерываем внутренний цикл
                }
            }
        }
    }
}
