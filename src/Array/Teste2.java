package Array;

import java.util.ArrayList;

public class Teste2 {
    
    public static int sum_of_numbers(ArrayList<Integer> nums){
        
        int sum = 0;

        for (Integer numbers : nums) {
            sum += numbers;
        }

        return sum;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println(sum_of_numbers(nums));
    }
}
