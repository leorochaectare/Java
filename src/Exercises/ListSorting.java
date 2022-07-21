package Exercises;

import java.util.Arrays;
import java.util.List;

public class ListSorting {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        int temp = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        
        System.out.println(arr);
    }
}
