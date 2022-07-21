package HackerrankAlgorithms;

import java.util.Scanner;

public class StairCase {
    
    public static void stairCase(int n){
        
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n; j++){
             if(j < n - i){
                 System.out.print(" ");
             } else {
                 System.out.print("#");
             }
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();

        stairCase(n);
        sc.close();
    }
}
