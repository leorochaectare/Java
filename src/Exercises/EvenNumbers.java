package Exercises;

import java.util.List;
import java.util.ArrayList;

public class EvenNumbers {
    
    public static void evenNumbers(List<Integer> nums){
        for (Integer integer : nums) {
            if(integer % 2 == 0) {
                System.out.println("Number "+integer+" is even");
            } else{
                System.out.println("Number "+integer+" is odd");
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(11);
        nums.add(13);
        nums.add(15);
        nums.add(17);
        nums.add(19);

        evenNumbers(nums);
    }
}
