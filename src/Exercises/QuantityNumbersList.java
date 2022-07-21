package Exercises;

import java.util.Arrays;
import java.util.List;

public class QuantityNumbersList {
    
    public static void quantityNumbersList(List<Integer> arr) {
       
        int equals = 0;
        int count = 0;

        for(int i = 0; i < arr.size(); i++){
            equals = arr.get(i);
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(j) == equals){
                    count++;
                }
            }

            System.out.println("Number " + equals + " => " + count  + " element(s)");
            count = 0;
        }
    }
    
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 4, 4, 4, 5, 3);

        quantityNumbersList(nums);
    }
}
