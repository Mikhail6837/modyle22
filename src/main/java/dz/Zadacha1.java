package dz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zadacha1 {
    public int[]  zadacha (ArrayList<Integer>nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums.get(i), i);
        }
        return new int[]{-1,-1};
    }
    public void zada(){
        ArrayList<Integer> dz = new ArrayList<>();
        dz.add(7);
        dz.add(8);
        dz.add(15);
        dz.add(16);
        dz.add(1);

        int target = 23;

        int[] result = zadacha(dz, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Индексы суммирующихся чисел: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Таких чисел в массиве нет");
        }


    }
}
